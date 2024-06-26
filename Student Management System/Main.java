public class Main {

  public static void main(String[] args) {
    // Testing the Student class
    Student student1 = new Student("Ahmad", 1, 1000.0);
    student1.print();

    Student student2 = new Student(student1); // Using copy constructor
    student2.setName("Ali");
    student2.setRollNumber(2);
    student2.setFees(1200.0);
    student2.print();

    System.out.println("Fees with 10% discount: " + student2.calcFeeWithDiscount(10));
    System.out.println("Average marks: " + student2.calcAvg(85, 90));
    System.out.println("Percentage: " + student2.calcPercentage(500, 450));
}
}