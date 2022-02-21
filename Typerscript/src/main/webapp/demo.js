var fruit123 = ["1", "One", "Tarkesh"];
console.log(fruit123);
var fruits123 = ["One", "Two", "Three"];
console.log(fruits123);
var myarray = [1, true, false, "Dr. Tarkeshwar", { 'name': 'Tarkesh', 'phone': '454545' }];
console.log(myarray);
var fruit = ["1", "Abhi", "Advitot"];
console.log(fruit);
var score = [10, 20, 30, 50];
console.log(score);
var strorno = ["Abhi", 10, 20, "Abhijit", "Umesh", 30, "Ajay"];
console.log(strorno);
var strorno1 = ["Abhi", 10, 20, "Abhijit", "Umesh", 30, "Ajay"];
console.log(strorno1);
var employee = [10, "Abhit"];
console.log(employee);
var FruitsName;
(function (FruitsName) {
    FruitsName[FruitsName["Apple"] = 5] = "Apple";
    FruitsName["Orange"] = "Colour";
    FruitsName[FruitsName["Banana"] = 255] = "Banana";
    FruitsName[FruitsName["Watermalon"] = 256] = "Watermalon";
})(FruitsName || (FruitsName = {}));
function getFruits() {
    return FruitsName.Watermalon;
}
function getFruits1() {
    return 77;
}
var fruit3 = getFruits();
console.log("Fruit Name : " + fruit3);
var fruit1 = getFruits1();
console.log("Fruit1 Name : " + fruit1);
console.log("Get bY value Banana : " + FruitsName.Banana);
console.log("Get bY value Orange : " + FruitsName[66]);
