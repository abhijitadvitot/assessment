var Employee = /** @class */ (function () {
    function Employee(empCode, empname) {
        this.name = empname;
        this.empCode = empCode;
    }
    Employee.prototype.display = function () {
        console.log(this.empCode + "," + this.name);
    };
    return Employee;
}());
var emp = new Employee(10, 'Abhijig');
var emp1 = new Employee(20, 'Sumit');
emp.display();
console.log(emp1.empCode);
