import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Nithajangular';
  sum :number;

  // name : string;
  // age : number;
  // email : string;
  // frame : string;
  // flag : boolean;
  // vehicles : string[];
  // imagepath : string;
  // selectedvehicles : string;
  // mystyle :{};
  // myclass : string;
  // mycla :string;

  constructor(private calc : CalculatorService){
    this.sum=calc.getAddition(10,20)
    // this.name="Nithaj";
    // this.age=20;
    // this.email="babunithaj@gmail.com";
    // this.frame="",
    // this.flag=true,
    // this.vehicles=["two","three","fou"];
    // this.selectedvehicles="";
    // this.mystyle={'width' : '50%','border': '2px solid black'};
    // this.imagepath="";
    // this.myclass="myclass1",
    // this.mycla="myclass1"
  }
  // changeflag(){
  //   this.flag = ! this.flag;
    
    
  // }
  // changestyle(){
  //   this.mystyle={'width' : '50%','border': '2px solid green'};
  //   this.mycla="myclass2";
  // }

  // setSelectedItem(vat : string){
  //   this.selectedvehicles=vat;
  // }
  // changename(){
  //   this.name="vijay";
  // }
  // changeimage(){
  //   this.imagepath="";
  // }

}
