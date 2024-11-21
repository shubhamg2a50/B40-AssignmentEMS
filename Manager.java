class Manager extends Employee {
    private double bonusPercentage;

    public Manager(int id, String name, String department, double baseSalary, int workingHours,
            double bonusPercentage) {
        super(id, name, department, baseSalary, workingHours);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (getBaseSalary() * bonusPercentage / 100);
    }
}
