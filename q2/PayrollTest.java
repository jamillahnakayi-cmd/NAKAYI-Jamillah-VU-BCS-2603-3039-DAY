public class PayrollTest {
    public static void main(String[] args) {
        Payable[] staff = new Payable[2];
        staff[0] = new SalariedEmployee("S001", "Alice Nakato", 1500000);
        staff[1] = new HourlyEmployee("H001", "Peter Okello", 40, 12000);

        double total = 0;
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i] + " | Payment: UGX " + staff[i].getPaymentAmount());
            total += staff[i].getPaymentAmount();
        }
        System.out.println("Total payroll: UGX " + total);
    }
}
