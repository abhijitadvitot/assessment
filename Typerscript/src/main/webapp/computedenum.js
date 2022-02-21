var printmedia;
(function (printmedia) {
    printmedia[printmedia["newspaper"] = 1] = "newspaper";
    printmedia[printmedia["newsletter"] = getprintmedia("newsletter")] = "newsletter";
    printmedia[printmedia["magzine"] = printmedia.newsletter * 5] = "magzine";
    printmedia[printmedia["book"] = 10] = "book";
})(printmedia || (printmedia = {}));
function getprintmedia(media) {
    if (media === 'newsletter') {
        return 5;
    }
}
console.log(printmedia.newsletter);
console.log(printmedia.magzine);
var code;
code: 122;
code: "Abc";
function getinfo(code) {
    if (typeof (code) === "number") {
        console.log("code is number");
    }
    else if (typeof (code) === 'string') {
        console.log("code is string");
    }
}
getinfo(123);
getinfo("AB");
var anyDayaType;
anyDayaType = 32;
anyDayaType = "Tarkeshwar";
anyDayaType = false;
anyDayaType = [4, 5, 6, 3, 5, 5];
anyDayaType = { "name": "Tarkesh", "phone": 3434, "city": "New Delhi" };
anyDayaType = [[3, 5, 3], [6, 6], [5], [6, 5, 6, 87, 6]];
function greeting(name) {
    console.log("Hello " + name + ", How are you?");
}
greeting("Abhijt Advitot");
var funCopy = greeting("abhi");
console.log(funCopy);
function addtion(a, b) {
    return a + b;
}
var sum = addtion(10, 20);
console.log(sum);
var myname = "Abhijit";
console.log(typeof (myname));
var myid = myname;
console.log(myid);
function neverUseKeyword(name) {
    throw new Error(name);
}
function withoutParameter() {
    while (true) {
        console.log("This is Sample Code");
    }
    console.log("This is Sample Code");
}
//neverUseKeyword("Tarkeshwar");
//withoutParameter();
var a = 3;
var b = "Tarkeshwar";
//b=<string>a;
//a=<number>b;
var c = "Hello World";
var array = [4, "hello", true];
console.log(typeof (array));
var kb = a;
var abc = a;
var subtract = function (x, y) {
    return x - y;
};
var result = subtract(2, 5);
console.log(result);
function greeting1(name) {
    console.log("Hello " + name + ", How are you?");
}
greeting1("Abhijit Advitot");
function sayHello(name, msg) {
    return "Hi," + name + ". " + msg;
}
console.log(sayHello("Dr. Tarkeshwar Barua"));
console.log(sayHello("Dr. Tarkeshwar Barua", "Good Morning"));
function add(a, b) {
    return a + b;
}
console.log(add("Abhi", "Advitot"));
console.log(add(10, 20));
console.log(add(10, 20));
function greet(name) {
    var msg = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        msg[_i - 1] = arguments[_i];
    }
    return "Hi," + name + ". " + msg.join(", ") + "!";
}
console.log(greet("Abhijit Advitot"));
console.log(greet("Abhijt Advitot", "Good Morning", "Good Afternoon", "Good Evening"));
;
function addKeyValue(key, value) {
    console.log(key + ", " + value);
}
function updateKeyValue(key, value) {
    console.log(key + ", " + value);
}
var myobj = addKeyValue;
myobj(1, "Tarkesh");
var myobj1 = updateKeyValue;
myobj(2, "Barua");
var obj = { empCode: 1,
    empName: "Abhi", getsalray: function (num) {
        return 100;
    }, getEmpName: function (number) {
        return "Abhijit";
    }
};
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);
var Employee = /** @class */ (function () {
    function Employee(empCode, empName) {
        this.empCode = empCode;
    }
    Employee.prototype.getsalray = function (num) {
        return 100;
    };
    Employee.prototype.getEmpName = function (number) {
        return "Advitot";
    };
    return Employee;
}());
var Student = /** @class */ (function () {
    function Student(enrollment, name) {
        this.rollNumber = enrollment;
        this.stdName = name;
    }
    Student.prototype.getName = function () {
        return this.stdName;
    };
    Student.prototype.getRollNumber = function () {
        return this.rollNumber;
    };
    return Student;
}());
var std = new Student(1, "Abhi");
console.log(std.getName());
console.log(std.getRollNumber());
