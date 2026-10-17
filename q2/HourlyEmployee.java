public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String staffID, String name, double hoursWorked, double hourlyRate) {
        super(staffID, name);
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Rate cannot be negative");
        }
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}
