import java.util.Scanner;

public class ParttimeStaff extends Staff {
    private int hoursWorked;
    private final double RATE_PER_HOUR = 10;   // US dollars
    private final double TAX_RATE = 0.30;

    public ParttimeStaff(String staffNo, String staffName, int staffAge, int hoursWorked) {
        super(staffNo, staffName, staffAge);
        this.hoursWorked = hoursWorked;
    }

    public double calculateNetPay() {
        double totalPay = hoursWorked * RATE_PER_HOUR;
        double tax = totalPay * TAX_RATE;
        return totalPay - tax;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Net monthly pay: $" + calculateNetPay());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter staff number: ");
        String no = input.nextLine();
        System.out.print("Enter staff name: ");
        String name = input.nextLine();
        System.out.print("Enter staff age: ");
        int age = input.nextInt();
        System.out.print("Enter hours worked in the month: ");
        int hours = input.nextInt();

        ParttimeStaff p = new ParttimeStaff(no, name, age, hours);
        p.display();
    }
}
