

import { FrmService } from './../frm.service';

import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';


export interface PeriodicElement {
  title: string;
  name: string;
  category: string;
  des: string;
}


@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {
  el: any;


  constructor(private frm:FrmService) { 
  
  }
a:any=[]
 searchText=""

  ngOnInit(){
this.a=this.frm.a;
console.log(this.a);
  }

  elements: any []= this.frm.a;
  headElements= ['Title', 'Name', 'Category', 'Description','Edit','Delete'];
  
  }



