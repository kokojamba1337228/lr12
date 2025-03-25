package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice Johnson", 1234.56));
        employees.add(new Employee("Bob Smith", 7890.12));
        employees.add(new Employee("Carol Brown", 3456.78));

        System.out.println("Choose language / Выберите язык: 1 - Русский, 2 - English");
        int choice = scanner.nextInt();
        Locale locale;
        switch (choice) {
            case 2 -> locale = new Locale("en", "US");
            default -> locale = new Locale("ru", "RU");

        };

        Report.generateFullReport(employees, locale);
    }
}
