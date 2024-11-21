class HR extends Employee {
    private double recruitmentBonus;

    public HR(int id, String name, String department, double baseSalary, int workingHours, double recruitmentBonus) {
        super(id, name, department, baseSalary, workingHours);
        this.recruitmentBonus = recruitmentBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + recruitmentBonus;
    }
}
