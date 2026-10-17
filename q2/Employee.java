public abstract class Employee implements Payable {
    private String staffID;
    private String name;

    public Employee(String staffID, String name) {
        this.staffID = staffID;
        this.name = name;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();

    @Override
    public double getPaymentAmount() {
        return calculatePay();
    }

    @Override
    public String toString() {
        return "Staff ID: " + staffID + ", Name: " + name;
    }
}
