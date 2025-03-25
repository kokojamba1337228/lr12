import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class TopicsLocalization {
    public static void printTopics(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("t1", locale);

        System.out.println("Темы Java на " + locale.getDisplayLanguage() + ":");
        System.out.println("------------------------------");

        Set<String> keys = rb.keySet();

        for (String key : keys) {
            System.out.println(key + ": " + rb.getString(key));
        }

        System.out.println("------------------------------\n");
    }

    public static void main(String[] args) {
        Locale russianLocale = new Locale("ru", "RU");
        Locale englishLocale = new Locale("en", "US");

        printTopics(russianLocale);
        printTopics(englishLocale);
    }
}