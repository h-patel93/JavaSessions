package LocalizationDemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
    public static void main(String[] args) {
        //Locale
        //ResourceBundle

        String lang = "hi";
        String country="IN";

        Locale l = new Locale(lang,country);
        ResourceBundle r = ResourceBundle.getBundle("LocalizationDemo/Bundle",l);
        System.out.println(r.getString("wish"));
    }
}
