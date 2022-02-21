interface IPerson{
	  name:string;
	display():void 	 
	}
	 	 
interface IEmployee{
	
	empCode:number;
	
}
class Employee implements IPerson,IEmployee{
	  
	  empCode:number;
	   name:string 
	    constructor(empCode:number ,empname:string){
		  this.name=empname;
		 this.empCode=empCode;
		 
	}
	display():void{
		console.log(this.empCode+","+this.name);
	}   
	   
}

let emp:IPerson=new Employee(10,'Abhijig');
let emp1:IEmployee= new Employee(20,'Sumit');


emp.display();
console.log(emp1.empCode);

