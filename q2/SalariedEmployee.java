public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String staffID, String name, double monthlySalary) {
        super(staffID, name);
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
