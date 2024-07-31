import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  UserName:string = "Enter UserName"
  amount:string = "Enter amount"
  Buyer:string="Enter Buyer name"
  

  userlist = []
  useramount=[]
  bookuser=[]

  onclick(prouser, proamo, promem){
    
    if(prouser.value.length > 0)
    {
      this.userlist.push(prouser.value);
      prouser.value = '';
      this.useramount.push(proamo.value);
      proamo.value='';
      this.bookuser.push(promem.value);
      promem.value='';
    }
  }

  ondelete(deleteme)
  {
    this.userlist.splice(deleteme,1);
    this.useramount.splice(deleteme,1);
    this.bookuser.splice(deleteme,1)
  }
  offclick(prouser, proamo, promem){
    // this.userlist=[]
    // this.useramount=[]
    // this.bookuser=[]
    if(prouser.value.length > 0)
      {
        this.userlist.push(prouser.value);
        prouser.value = '';
        this.useramount.push(proamo.value);
        proamo.value='';
        this.bookuser.push(promem.value);
        promem.value='';
      }
  }

  //Summary
  //ref variable
  //attibute binding
  //click event
  //function with parameter
  //Array
  //Array push method
  //Array splice method
  //ngfor structural directives
  //if condition

  
}


