class Developer extends Employee {
    private int codingHours;
    private static final double HOURLY_RATE = 100; // Fixed rate per coding hour

    public Developer(int id, String name, String department, double baseSalary, int workingHours, int codingHours) {
        super(id, name, department, baseSalary, workingHours);
        this.codingHours = codingHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (codingHours * HOURLY_RATE);
    }
}
