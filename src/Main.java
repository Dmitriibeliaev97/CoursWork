public class Main {
       public static void main(String[] args) {
        EmployeeBook main = new EmployeeBook();

        // System.out.println(EmployeeBook.getEmployees()[0].toString());
       // System.out.println(EmployeeBook.getEmployees()[1].toString());
       // System.out.println(EmployeeBook.getEmployees()[2].toString());
       // System.out.println(EmployeeBook.getEmployees()[3].toString());
       // System.out.println(EmployeeBook.getEmployees()[4].toString());
       // System.out.println(EmployeeBook.getEmployees()[5].toString());
       // System.out.println(EmployeeBook.getEmployees()[6].toString());
       // System.out.println(EmployeeBook.getEmployees()[7].toString());
       // System.out.println(EmployeeBook.getEmployees()[8].toString());
           // System.out.println(EmployeeBook.getEmployees()[9].toString());

        System.out.println();

        double sumSalary = main.sumSalary();
        double averageSalary = main.averageSalary();

        System.out.println();

        System.out.println("Сумма затрат на зарплаты в месяц по отделу = " + sumSalary);
        System.out.println("Средняя зарплата в месяц по отделу = " + averageSalary);

        System.out.println();

        main.maxSalary();
        main.minSalary();
        main.averageSalary();
        main.fio();
        System.out.println();
        System.out.println("Повышенная сложность:");
        System.out.println("Пункт 1:");
        main.indexSalaryForAll(0.10);
        System.out.println("Проиндексированная зарплата всех сотрудников:");
        System.out.println(EmployeeBook.getEmployees()[0].toString());
        System.out.println(EmployeeBook.getEmployees()[1].toString());
        System.out.println(EmployeeBook.getEmployees()[2].toString());
        System.out.println(EmployeeBook.getEmployees()[3].toString());
        System.out.println(EmployeeBook.getEmployees()[4].toString());
        System.out.println(EmployeeBook.getEmployees()[5].toString());
        System.out.println(EmployeeBook.getEmployees()[6].toString());
        System.out.println(EmployeeBook.getEmployees()[7].toString());
        System.out.println(EmployeeBook.getEmployees()[8].toString());
        System.out.println(EmployeeBook.getEmployees()[9].toString());
        System.out.println();
        System.out.println("Пункт 2:");
        System.out.println("a.:");
        main.minSalaryByDepartment(2);
        System.out.println("b.:");
        main.maxSalaryByDepartment(2);
        System.out.println("c.:");
        System.out.println("Сумма затрат на зарплату по отделу: " +  main.sumSalaryByDepartment(2));
        System.out.println("d.:");
        main.getAverageSalaryByDepartment(2);
        System.out.println("e.:");
        main.getIndexSalary(0.1, 2);
        System.out.println("f.:");
        main.getEmployeesByDepartment(2);
        System.out.println();
        System.out.println("Пункт 3:");
        System.out.println("a.:");
        main.getEmployeeWithSalaryLess(60000);
        System.out.println("b.:");
        main.getEmployeeWithSalaryMore(70000);
    }
}
