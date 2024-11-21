abstract class Employee {
    private int id;
    private String name;
    private String department;
    private double baseSalary;
    private int workingHours;

    public Employee(int id, String name, String department, double baseSalary, int workingHours) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    // Abstract methods
    public abstract double calculateSalary();

    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department +
                ", Base Salary: " + baseSalary + ", Working Hours: " + workingHours +
                ", Total Salary: " + calculateSalary());
    }
}
