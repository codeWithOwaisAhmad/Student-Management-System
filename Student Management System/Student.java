public class Student {
    private String name;
    private int rollNumber;
    private double fees;
    private int studentCount = 50;

    // Default constructor
    public Student() {

    }

    // Parameterized constructor
    public Student(String name, int rollNumber, double fees) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.fees = fees;
    }

    // Copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.rollNumber = s.rollNumber;
        this.fees = s.fees;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getFees() {
        return fees;
    }



    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    // Method to calculate fees with discount
    public double calcFeeWithDiscount(int discountPercentage) {
        return fees - (fees * discountPercentage / 100.0);
    }

    // Method to calculate fees without discount
    public double calcFeeWithoutDiscount() {
        return fees;
    }

    // Method to calculate average marks
    public double calcAvg(int lastYearMarks, int presentYearMarks) {
        return (lastYearMarks + presentYearMarks) / 2.0;
    }

    // Method to calculate percentage
    public double calcPercentage(int totalMarks, int obtainMarks) {
        return (obtainMarks * 100.0) / totalMarks;
    }

    // Method to print all data member values
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Fees: " + fees);
        System.out.println("Total Students: " + studentCount);
    }
}
