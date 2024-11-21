public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Company company = new Company();

        try {
            // Creating employees
            Employee manager = new Manager(101, "John Smith", "HR", 80000, 160, 20);
            Employee developer = new Developer(102, "Alice Brown", "IT", 70000, 150, 120);
            Employee hr = new HR(103, "Robert White", "HR", 60000, 160, 5000);

            // Adding employees to the company
            company.addEmployee(manager);
            company.addEmployee(developer);
            company.addEmployee(hr);

            // Viewing employees
            company.listEmployees();

            // Calculating salaries
            System.out.println("\nCalculating Salaries:");
            manager.calculateSalary();
            developer.calculateSalary();
            hr.calculateSalary();

            // Promoting an employee
            System.out.println("\nPromotion:");
            company.promoteEmployee(manager);

            // Finding an employee by ID
            System.out.println("\nSearching for Employee:");
            Employee foundEmployee = company.findEmployeeById(102);
            foundEmployee.displayEmployee();

        } catch (EmployeeNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
