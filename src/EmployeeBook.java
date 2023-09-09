public class EmployeeBook {

    private static Employee[] employees = new Employee[10];
    private static Fio[] fioBase = new Fio[10];

    public static Employee[] getEmployees() {
        return employees;
    }

    public static Fio[] getFioBase() {
        return fioBase;
    }

    public void employeeBook() {
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
    }

    public double sumSalary() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
    public void maxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getFio() + ". Зарплата: " + employeeWithMaxSalary.getSalary());
    }

    public void minSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getFio() + ". Зарплата: " + employeeWithMinSalary.getSalary());
    }

    public double averageSalary () {
        return sumSalary() / employees.length;
    }

    public void fio () {
        for (Fio fio : fioBase) {
            System.out.println(fio);
        }
    }

    public void minSalaryByDepartment(int department) {
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

    public void maxSalaryByDepartment(int department) {
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

    public double sumSalaryByDepartment (int department) {
        double total = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public void getAverageSalaryByDepartment(int department) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                ++counter;
            }
        }
        System.out.println("Средняя зарплата по отделу " + department + ": " + sumSalaryByDepartment(department)/counter);
    }

    public void getIndexSalary(double index, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index);
                System.out.println("Проиндексированная зарплата сотрудника " + employee.getFio() + ": " + employee.getSalary());
            }
        }
    }

    public void getEmployeesByDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("id: " + employee.getId() + " Ф.И.О: " + employee.getFio() + ", Зарплата " + employee.getSalary());
            }
        }
    }

    public double indexSalaryForAll(double index) {
        double newSalary = 0;
        for (Employee employee : employees) {
            newSalary = employee.getSalary() + (employee.getSalary() * index);
            employee.setSalary(newSalary);
        }
        return newSalary;
    }

    public void getEmployeeWithSalaryLess(int threshold) {
        for (Employee employee : employees) {
            if (employee.getSalary() < threshold) {
                System.out.println("id: " + employee.getId() + " Ф.И.О: " + employee.getFio() + ", Зарплата " + employee.getSalary());
            }
        }
    }

    public void getEmployeeWithSalaryMore(int minSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= minSalary) {
                System.out.println("id: " + employee.getId() + " Ф.И.О: " + employee.getFio() + ", Зарплата " + employee.getSalary());
            }
        }
    }


}
