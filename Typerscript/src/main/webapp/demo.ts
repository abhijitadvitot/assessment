let fruit123:string[]=["1", "One", "Tarkesh"];
console.log(fruit123);
let fruits123:Array<string> = ["One", "Two", "Three"];
console.log(fruits123);
let myarray=[1,true,false, "Dr. Tarkeshwar", {'name':'Tarkesh', 'phone':'454545', }];
console.log(myarray);

 let fruit:string[]=["1","Abhi","Advitot"];
 console.log(fruit);
 
 
 let score:number[]=[10,20,30,50];
 console.log(score);
 let  strorno:(string|number) [] = ["Abhi",10,20,"Abhijit","Umesh",30,"Ajay"];
 console.log(strorno);
 
 
 let strorno1:Array<string|number>=["Abhi",10,20,"Abhijit","Umesh",30,"Ajay"];
 console.log(strorno1)
 
 
 let employee:[number,string]=[10,"Abhit"];
 console.log(employee);
 
 
 enum FruitsName{
    Apple=5, Orange='Colour', Banana=0xff, Watermalon
}
 
function getFruits(): FruitsName{
    return FruitsName.Watermalon;
}
function getFruits1(): FruitsName{
    return 77;
}
let fruit3: FruitsName= getFruits();
console.log("Fruit Name : "+fruit3);
let fruit1: FruitsName= getFruits1();
console.log("Fruit1 Name : "+fruit1);
console.log("Get bY value Banana : "+FruitsName.Banana);
console.log("Get bY value Orange : "+FruitsName[66]);