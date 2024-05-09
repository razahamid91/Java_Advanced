import java.util.Locale;

public class LocaleTest1 {
    public static void main(String[] args) {
        Locale lc = new  Locale("EN","IN");
        System.out.println(lc);

System.out.println(lc.getDisplayName());
System.out.println(lc.getCountry());
System.out.println(lc.getDisplayCountry());
System.out.println(lc.getLanguage());
System.out.println(lc.getDisplayLanguage());
System.out.println(lc.getDisplayVariant());
System.out.println(lc.getScript());
System.out.println(lc.getISO3Country());

    }
}
