class Person{
	 public name:string;
	 constructor(name:string){
		 this.name=name;
		 
	}
	 	 
}
class Employee extends Person{
	  empcode:number;
	    constructor(code:number , name:string){
		  super(name);
		 this.empcode=code;
		 
	}
	displayName():void{
		console.log(this.empcode+","+this.name);
	}   
	   
}

let emp:Employee=new Employee	(10,'Abhijig');
emp.displayName();