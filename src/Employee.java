public class Employee {
    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}