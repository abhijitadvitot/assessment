enum printmedia{
	newspaper=1,
	newsletter=getprintmedia("newsletter"),
	magzine=newsletter * 5,
book=10


}
function  getprintmedia(media: string):number {
if(media==='newsletter'){
return 5;
}
}

console.log(printmedia.newsletter);
console.log(printmedia.magzine);



let code:(string | number)
code:122;
code:"Abc";

function getinfo(code:(string | number)){
	
	 if(typeof(code)==="number")
	 {
		 console.log("code is number")
		 
	}
   else if(typeof(code)==='string' )
   { 
	  console.log("code is string")
}
}

getinfo(123);
getinfo("AB");






let anyDayaType:any;
anyDayaType=32;
anyDayaType="Tarkeshwar";
anyDayaType=false;
anyDayaType=[4,5,6,3,5,5];
anyDayaType={"name":"Tarkesh","phone":3434,"city":"New Delhi"};
anyDayaType=[[3,5,3],[6,6],[5],[6,5,6,87,6]];







function greeting(name:string):void{
    console.log("Hello "+name+", How are you?");
}
greeting("Abhijt Advitot" );


let funCopy=greeting("abhi");
console.log(funCopy);


function addtion(a:number ,b:number):number{
	  return a+b;
}
let sum:number=addtion(10,20);
console.log(sum);

let myname="Abhijit";
console.log(typeof(myname));
let myid=myname;
console.log(myid);


function neverUseKeyword(name: string): never {
    throw new Error(name);
}
function withoutParameter(): never {
    while (true) { console.log("This is Sample Code"); }
    console.log("This is Sample Code");
}
//neverUseKeyword("Tarkeshwar");
//withoutParameter();






let a=3;
let b="Tarkeshwar";
//b=<string>a;
//a=<number>b;
let c="Hello World";
let array=[4,"hello",true];
console.log(typeof(array));
let kb=<number>a;
let abc=a as number;


let subtract=function(x:number, y:number):number{
    return x-y;
}
let result=subtract(2,5);
console.log(result);


function greeting1(name: string): void {
    console.log("Hello " + name + ", How are you?");
}
greeting1("Abhijit Advitot");


 function sayHello(name:string, msg?:string): string {​​​

​​    return "Hi,"+name+". "+msg;

}​​​​​

console.log(sayHello("Dr. Tarkeshwar Barua"));

console.log(sayHello("Dr. Tarkeshwar Barua","Good Morning"));


function add(a:string, b:string):string;

function add(a:number, b:number):string;

function add(a:any, b:any):any{
	return a+b;
}
	 console.log (add("Abhi","Advitot"));
	 console.log (add(10,20));
	 	 console.log (add(10,20));	 

function greet(name:string, ...msg:string[]): string {​​​​​

    return "Hi,"+name+". "+msg.join(", ")+"!";

}​​​​​

console.log(greet("Abhijit Advitot"));

console.log(greet("Abhijt Advitot","Good Morning","Good Afternoon","Good Evening"));

/*
interface IEmployee{    empCode:number;
    empName:string;
    salray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Tarkeshwar",
                    getEmpName(number):string{return "Tarkeshwar";}};
console.log(obj.getEmpName);
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);
*/






 interface KeyValueProcessor{ // functional interface 
	    (key: number, value:string):void;
};
function  addKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
function  updateKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
let myobj:KeyValueProcessor = addKeyValue;
myobj(1,"Tarkesh");
let myobj1:KeyValueProcessor = updateKeyValue;
myobj(2,"Barua");




interface IEmployee{
    empCode:number;
    empName:string;
    getsalray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Abhi",
                    getsalray(num):number{
                        return 100;
                    },
                    getEmpName(number):string{
                        return "Abhijit";
                        }
                    };
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);

class Employee implements IEmployee {​​​​​

    empCode: number;

    empName: string;

    constructor(empCode: number, empName: string) {​​​​​

        this.empCode = empCode;     }​​​​​

    getsalray(num): number {​​​​​

        return 100;

    }​​​​​

    getEmpName(number): string {​​​​​

        return "Advitot";

  	  }​​​​​











}
class Student{
    private rollNumber:number;
    private stdName:string;
    constructor(enrollment:number,name:string){
        this.rollNumber=enrollment;
        this.stdName=name;
    }
   public  getName():string{
        return this.stdName;
    }
    public getRollNumber():number{
        return this.rollNumber;
    }
}
let std:Student=new Student(1,"Abhi");
console.log(std.getName());
console.log(std.getRollNumber());
​​​​​

