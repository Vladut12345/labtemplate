import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../../service/';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.less']
})
export class HomeComponent implements OnInit {
  cars: Array<Object> = [];
  

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    // this.apiService.get('api/user/1').subscribe(res => {
    //   this.user = res.firstName;
    // });
    var imgr="../assets/images/logo.png";
    this.cars.push({id: 3, nume: "BMV", pret: 95.6, img:"../assets/images/logo.png"});
    //this.cars.push({id: 3, nume: "Mercedes", pret: 85.6});
    //this.cars.push({id: 3, nume: "Ceva", pret: 36.6});
    //this.cars.push({id: 3, nume: "Ceva", pret: 36.6});
    console.log(this.cars);
  }

}
