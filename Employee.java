public class Employee {
    String name;
    int id;
    double salary;
    int experience;

    public Employee(String name, int id, double salary, int experience) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Experience:" +experience);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("xyz", 101, 50000.0,2);
        emp1.displayInfo();
    }
}
