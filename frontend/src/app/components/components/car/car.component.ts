import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.less']
})
export class CarComponent implements OnInit {

  @Input() car: {
    id: number,
    nume: string,
    pret: number,
    img: HTMLImageElement
  }

  constructor() { }

  ngOnInit() {
    console.log(this.car);
  }

}
