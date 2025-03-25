package task2;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Report {
    public static void generateFullReport(List<Employee> employees, Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("t2", locale);
        String title = rb.getString("report.title");

        System.out.println(title);
        System.out.printf("%7s %23s%n", rb.getString("report.fullName"), rb.getString("report.salary"));
        int salary = 1;
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
        for (Employee employee : employees) {
            if(locale.getCountry().equals("RU")){
                salary=10;
            }
            System.out.printf("%-15s %15s%n", employee.fullName,  cf.format(employee.salary*salary));
        }
    }
}
