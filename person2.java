
class Person2 {
    // base class Person with attributes name and age.
    protected String name;
    protected int age;


    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    // Additional attributes for Employee
    private int employeeID;
    private double salary;


    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Call the parent class (Person) constructor
        this.employeeID = employeeID;
        this.salary = salary;
    }


    public void displayEmployeeDetails() {

        displayPersonDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {

        Employee emp = new Employee("Kabilan", 24, 101, 50000.0);


        emp.displayEmployeeDetails();
    }
}
