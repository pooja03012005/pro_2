class Employee_P3 {
    private String name;
    private int id;
    private double salary;
    private String department;
    private String address;

    public Employee_P3(String name, int id, double salary, String department , String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.address=address;
   }
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Address:"+ address);
    }
    public static void main(String[] args) {
        Employee_P3 emp = new Employee_P3("John Doe", 12345, 50000.0, "Engineering","Hubbali");
        emp.display();
    }
}
