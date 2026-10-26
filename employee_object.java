
class Employee {
    private String name;
    private int employeeId;
    private double monthlySalary;
    Employee(String name, int employeeId, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }
    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
    void compareSalary(Employee other) {
        if (this.calculateAnnualSalary() >
                other.calculateAnnualSalary()) {
            System.out.println(name + " earns more than "
                    + other.name + ".");
        } else if (this.calculateAnnualSalary() <
                other.calculateAnnualSalary()) {
            System.out.println(other.name + " earns more than "
                    + name + ".");
        } else {
            System.out.println(name + " and " + other.name
                    + " have equal annual salaries.");
        }
    }
    Employee getHigherPaid(Employee other) {
        if (this.calculateAnnualSalary() >=
                other.calculateAnnualSalary()) {
            return this;
        } else {
            return other;
        }
    }
    String getName() {
        return name;
    }
    void displaySalary() {
        System.out.println("Highest-paid employee: " + name);
        System.out.println("Annual Salary: "
                + calculateAnnualSalary());
    }
}
public class employee_object {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 101, 40000);
        Employee e2 = new Employee("Amit", 102, 50000);
        Employee e3 = new Employee("Priya", 103, 50000);
        e2.compareSalary(e1);
        e2.compareSalary(e3);
        Employee highest = e1.getHigherPaid(e2);
        highest = highest.getHigherPaid(e3);
        highest.displaySalary();
    }
}