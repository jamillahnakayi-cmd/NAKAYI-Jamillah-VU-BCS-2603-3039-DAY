import java.util.Scanner;

public class FulltimeStaff extends Staff {
    private double basicSalary;
    private final double NSSF_RATE = 0.05;
    private final double PAYE_RATE = 0.10;

    public FulltimeStaff(String staffNo, String staffName, int staffAge, double basicSalary) {
        super(staffNo, staffName, staffAge);
        this.basicSalary = basicSalary;
    }

    public double calculateNetSalary() {
        double deductions = basicSalary * (NSSF_RATE + PAYE_RATE);
        return basicSalary - deductions;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Net monthly pay: " + calculateNetSalary());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter staff number: ");
        String no = input.nextLine();
        System.out.print("Enter staff name: ");
        String name = input.nextLine();
        System.out.print("Enter staff age: ");
        int age = input.nextInt();
        System.out.print("Enter basic monthly salary: ");
        double salary = input.nextDouble();

        FulltimeStaff f = new FulltimeStaff(no, name, age, salary);
        f.display();
    }
}
