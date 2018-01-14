import { Component, OnInit } from '@angular/core';
import { ApiService } from '../service/';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.less']
})
export class LoginFormComponent implements OnInit {
cients: Client[];
  constructor(
    private router: Router
    ){} 

  ngOnInit() {
  }

  loginUser(e){
    e.preventDefault();
    console.log(e);
    var username = e.currentTarget.elements[0].value;
    var password = e.currentTarget.elements[1].value;
 
    if(username == this.apiService.get('api/client/').subscripbe(res=>{this.clients=res;})&& password == "admin")
    {
      this.router.navigate(['home']);
    }
  }

}
