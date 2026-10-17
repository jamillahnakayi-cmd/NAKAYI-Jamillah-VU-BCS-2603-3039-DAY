class FixedDeposit extends Account {
    public double interest() {
        return 0.0;
    }

    public void close() {
        System.out.println("Fixed deposit account closed");
    }
}
