
class Employee {
    private String name;
    private int employeeId;
    private double monthlySalary;
    private int rating;
    Employee(String name, int employeeId,
             double monthlySalary, int rating) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException(
                "Salary cannot be negative"
            );
        }
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException(
                "Rating must be between 1 and 5"
            );
        }
        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
        this.rating = rating;
    }
    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }
    double calculateBonus() {
        double percentage;

        if (rating == 5) {
            percentage = 20;
        } else if (rating == 4) {
            percentage = 15;
        } else if (rating == 3) {
            percentage = 10;
        } else if (rating == 2) {
            percentage = 5;
        } else {
            percentage = 0;
        }
        return calculateAnnualSalary() * percentage / 100;
    }
    double calculateTotalCompensation() {
        return calculateAnnualSalary() + calculateBonus();
    }
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
        System.out.println("Annual Bonus: " + calculateBonus());
        System.out.println("Total Annual Compensation: "
                + calculateTotalCompensation());
    }
}
public class employee_salary_bonus {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 105, 50000, 4);
        e1.displayDetails();
    }
}
