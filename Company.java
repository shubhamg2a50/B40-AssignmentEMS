import java.util.ArrayList;

class Company {
    private ArrayList<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        System.out.println("Employee removed: " + employee.getName());
    }

    public void listEmployees() {
        System.out.println("Employees in the Company:");
        for (Employee employee : employees) {
            employee.displayEmployee();
        }
    }

    public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
    }

    public void promoteEmployee(Employee employee) {
        System.out.println("Promoting Employee: " + employee.getName() + " to a higher role.");
    }
}
