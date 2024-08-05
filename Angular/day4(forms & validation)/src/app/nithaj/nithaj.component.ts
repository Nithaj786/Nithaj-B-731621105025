import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-nithaj',
  templateUrl: './nithaj.component.html',
  styleUrl: './nithaj.component.css'
})
export class NithajComponent {
   sum : number;
   sub : number;

   constructor(private calc : CalculatorService){
    this.sum = calc.getAddition(20,40);
    this.sub = calc.getSubtraction(30,10);
   }
}
