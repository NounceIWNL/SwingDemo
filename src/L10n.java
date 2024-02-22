import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class L10n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the language: (0-en, 1-de, 2-ru)");
        int language = scanner.nextInt();
        Locale locale = null;
        switch(language){
            case 0: locale = new Locale("en","US"); break;
            case 1: locale = new Locale("de","DE"); break;
            case 2: locale = new Locale("ru","RU"); break;
        }
        ResourceBundle bundleRU = ResourceBundle.getBundle("L10n", locale);
        System.out.println(bundleRU.getString("key"));
    }
}
