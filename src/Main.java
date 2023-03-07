public class Main {
    public static void main(String[] args) {

        Fio[] fioBase = new Fio[10];
        fioBase[0] = new Fio("Dmitrii", "Vladimirovich", "Beliaev");
        fioBase[1] = new Fio("Alexandr", "Alexandrovich", "Rubanov");
        fioBase[2] = new Fio("Pavel", "Alexandrovich", "Bazhura");
        fioBase[3] = new Fio("Vladislav", "Sergeevich", "Antonov");
        fioBase[4] = new Fio("Viktoria", "Stanislavovna", "Kaneva");
        fioBase[5] = new Fio("Ekaterina", "Vitalievna", "Matveeva");
        fioBase[6] = new Fio("Svetlana", "Vladimirovna", "Shirokova");
        fioBase[7] = new Fio("Elena", "Mihailovna", "Seitz");
        fioBase[8] = new Fio("Tatiana", "Viacheslavovna", "Urisman");
        fioBase[9] = new Fio("Natalia", "Vladimirovna", "Zernova");

        Employee[] employees = new Employee[10];
        employees[0] = new Employee(54100, 1, fioBase[0]);
        employees[1] = new Employee(43500, 2, fioBase[1]);
        employees[2] = new Employee(66300, 3, fioBase[2]);
        employees[3] = new Employee(81700, 4, fioBase[3]);
        employees[4] = new Employee(79900, 5, fioBase[4]);
        employees[5] = new Employee(35400, 1, fioBase[5]);
        employees[6] = new Employee(92900, 2, fioBase[6]);
        employees[7] = new Employee(60400, 3, fioBase[7]);
        employees[8] = new Employee(54900, 4, fioBase[8]);
        employees[9] = new Employee(79500, 5, fioBase[9]);

        System.out.println(employees[0].toString());
        System.out.println(employees[1].toString());
        System.out.println(employees[2].toString());
        System.out.println(employees[3].toString());
        System.out.println(employees[4].toString());
        System.out.println(employees[5].toString());
        System.out.println(employees[6].toString());
        System.out.println(employees[7].toString());
        System.out.println(employees[8].toString());
        System.out.println(employees[9].toString());

        System.out.println();

        sumSalary(employees);
        maxSalary(employees);
        minSalary(employees);
        averageSalary(employees);
        fio(fioBase);

        double sum = sumSalary(employees);
        double averageSalary = averageSalary(employees);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum);
        System.out.println("Средняя зарплата в месяц = " + averageSalary);
    }

    public static double sumSalary (Employee[] arr) {
        double total = 0;
        for (Employee employee : arr) {
            total += employee.getSalary();
        }
        return total;
    }


    public static void maxSalary(Employee[] arr) {
        Employee employeeWithMaxSalary = arr[0];
        for (Employee employee : arr) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getFio() + ". Зарплата: " + employeeWithMaxSalary.getSalary());
        System.out.println();

    }
    public static void minSalary(Employee[] arr) {
        Employee employeeWithMinSalary = arr[0];
        for (Employee employee : arr) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getFio() + ". Зарплата: " + employeeWithMinSalary.getSalary());
        System.out.println();
    }
    public static double averageSalary (Employee[] arr) {
        double total = 0;
        for (Employee employee : arr) {
            total += employee.getSalary();
        }
        return total / arr.length;
    }

    public static void fio (Fio[] arr) {
        for (Fio fio : arr) {
            System.out.println(fio);


        }

    }
}
