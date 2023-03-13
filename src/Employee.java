public class Employee {
    private double salary;
    private int department;
    private final int id;
    private final Fio fio;


    public Employee(double salary, int department, Fio fio) {
        this.salary = salary;
        this.department = department;
        this.id = ++counter;
        this.fio = fio;
    }

    public static int counter = 0;


    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public Fio getFio() {
        return fio;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id:" + id + " Ф.И.О: " + fio + ", Отдел: " + department + ", Зарплата: " + salary;
    }
}
