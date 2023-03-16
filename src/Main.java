public class Main {
    static Employee[] employees = new Employee[10];
    static Fio[] fioBase = new Fio[10];
    public static void main(String[] args) {

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

        double averageSalary = averageSalary();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц по отделу = " + sumSalary());
        System.out.println("Средняя зарплата в месяц по отделу = " + averageSalary);
        System.out.println();

        maxSalary();
        minSalary();
        averageSalary();
        fio();
        System.out.println();
        System.out.println("Повышенная сложность:");
        System.out.println("Пункт 1:");
        indexSalaryForAll(0.10);
        System.out.println("Проиндексированная зарплата всех сотрудников:");
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
        System.out.println("Пункт 2:");
        System.out.println("a.:");
        minSalaryByDepartment(2);
        System.out.println("b.:");
        maxSalaryByDepartment(2);
        System.out.println("c.:");
        System.out.println("Сумма затрат на зарплату по отделу: " +  sumSalaryByDepartment(2));
        System.out.println("d.:");
       // System.out.println("Средня зарпалат по отделу: " + getAverageSalaryByDepartment(2));
        getAverageSalaryByDepartment(2);
        System.out.println("e.:");
        getIndexSalary(0.1, 2);
        System.out.println("f.:");
        getEmployeesByDepartment(2);
        System.out.println();
        System.out.println("Пункт 3:");
        System.out.println("a.:");
        getEmployeeWithSalaryLess(60000);
        System.out.println("b.:");
        getEmployeeWithSalaryMore(70000);
    }
    public static double sumSalary () {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
    public static void maxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getFio() + ". Зарплата: " + employeeWithMaxSalary.getSalary());
    }
    public static void minSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getFio() + ". Зарплата: " + employeeWithMinSalary.getSalary());
    }
    public static double averageSalary () {
        return sumSalary() / employees.length;
    }

    public static void fio () {
        for (Fio fio : fioBase) {
            System.out.println(fio);
        }
    }
    public static void minSalaryByDepartment(int department) {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                        employeeWithMinSalary = employee;
                }
            }
        }
        if (employeeWithMinSalary != null) {
            System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + employeeWithMinSalary.getFio() + ". Зарплата: " + employeeWithMinSalary.getSalary());
        } else {
            System.out.println("Сотрудников в отделе " + department + " нет");
        }
    }
    public static void maxSalaryByDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = employee;
                }
            }
        }
        if (employeeWithMaxSalary != null) {
            System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + employeeWithMaxSalary.getFio() + ". Зарплата: " + employeeWithMaxSalary.getSalary());
        } else {
            System.out.println("Сотрудников в отделе " + department + " нет");
        }

    }

    public static double sumSalaryByDepartment (int department) {
        double total = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static void getAverageSalaryByDepartment(int department) {
        int counter = 0;
        double total = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                ++counter;
                total += employee.getSalary();
            }
        }
         System.out.println("Средняя зарплата по отделу " + department + ": " + sumSalaryByDepartment(department)/counter);
    }

    public static void getIndexSalary(double index, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index);
                System.out.println("Проиндексированная зарплата сотрудника " + employee.getFio() + ": " + employee.getSalary());
            }
        }
    }

    public static void getEmployeesByDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("id: " + employee.getId() + " Ф.И.О: " + employee.getFio() + ", Зарплата " + employee.getSalary());
            }
        }
    }

    public static double indexSalaryForAll(double index) {
        double newSalary = 0;
        for (Employee employee : employees) {
            newSalary = employee.getSalary() + (employee.getSalary() * index);
            employee.setSalary(newSalary);
        }
        return newSalary;
    }

    public static void getEmployeeWithSalaryLess(int threshold) {
        for (Employee employee : employees) {
            if (employee.getSalary() < threshold) {
                System.out.println("id: " + employee.getId() + " Ф.И.О: " + employee.getFio() + ", Зарплата " + employee.getSalary());
            }
        }
    }

    public static void getEmployeeWithSalaryMore(int minSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= minSalary) {
                System.out.println("id: " + employee.getId() + " Ф.И.О: " + employee.getFio() + ", Зарплата " + employee.getSalary());
            }
        }
    }
}
