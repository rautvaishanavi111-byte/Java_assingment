
class Student {
    private String name;
    private int rollNumber;
    private int m1, m2, m3, m4, m5;
    Student(String name, int rollNumber,
            int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.rollNumber = rollNumber;
        setM1(m1);
        setM2(m2);
        setM3(m3);
        setM4(m4);
        setM5(m5);
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    int getRollNumber() {
        return rollNumber;
    }
    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    int getM1() {
        return m1;
    }
    void setM1(int m1) {
        if (m1 >= 0 && m1 <= 100)
            this.m1 = m1;
        else
           System.out.println("Invalid mark");
    }
    int getM2() {
        return m2;
    }
    void setM2(int m2) {
        if (m2 >= 0 && m2 <= 100)
            this.m2 = m2;
        else
             System.out.println("Invalid mark");
    }
    int getM3() {
        return m3;
    }
    void setM3(int m3) {
        if (m3 >= 0 && m3 <= 100)
            this.m3 = m3;
        else
            System.out.println("Invalid mark");
    }
    int getM4() {
        return m4;
    }
    void setM4(int m4) {
        if (m4 >= 0 && m4 <= 100)
            this.m4 = m4;
        else
            System.out.println("Invalid mark");
    }
    int getM5() {
        return m5;
    }
    void setM5(int m5) {
        if (m5 >= 0 && m5 <= 100)
            this.m5 = m5;
        else
            System.out.println("Invalid mark");
    }
    int calculateTotal() {
        return m1 + m2 + m3 + m4 + m5;
    }
    double calculatePercentage() {
        return calculateTotal() / 5.0;
    }
    String calculateResult() {
        if (m1 >= 40 && m2 >= 40 && m3 >= 40
                && m4 >= 40 && m5 >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
    void displayResult() {
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + calculateResult());
    }
}
public class student_management {
        public static void main(String[] args) {
        Student s1 = new Student("Rahul", 21, 85, 76, 91, 68, 80);
        s1.displayResult();
    }
}
