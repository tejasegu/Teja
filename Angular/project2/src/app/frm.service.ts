import { AdvertiseComponent } from './advertise/advertise.component';
import { Injectable } from '@angular/core';
import { Data } from './data';

@Injectable({
  providedIn: 'root'
})
export class FrmService {

  constructor() { }

a:any=[];

  savedata(value:any){
    this.a.push(value)
    console.log(this.a)
  }

}
