import java.util.Locale;

public class LocaleTest2 {
    public static void main(String[] args) {
        Locale lc = new Locale("ENGLISH","US","WIN");

        System.out.println(lc);
        System.out.println(lc.toString());

        System.out.println(lc.getLanguage());


    }
    
}
