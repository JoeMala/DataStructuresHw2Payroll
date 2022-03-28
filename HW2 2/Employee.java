public class Employee {
    private String employeeNumber;
    private Name name;
    private Address address;
    //private PayRate payRate;
    
    public Employee(String employeeNumber, Name name, Address address /*, PayRate payRate*/) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.address = address;
        ///this.payRate = payRate;
    }
    public String toString() {
        return employeeNumber + "\n" + name + "\n" + address;  
    }
}
