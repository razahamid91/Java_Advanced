import java.util.Locale;

public class LocaleTest3 {
    public static void main(String[] args) {
        Locale lc1 = new Locale("en","us");
        Locale lc2 = new Locale("fr","FR");
        Locale lc3 = new Locale("sv","SV");
        Locale lc4 = new Locale("no","NO");
        Locale lc5 = new Locale("in","IN");

        System.out.println("English word name is :" + lc1.getDisplayLanguage());
        System.out.println("English word name is :" + lc2.getDisplayLanguage());
        System.out.println("English word name is :" + lc3.getDisplayLanguage());
        System.out.println("English word name is :" + lc4.getDisplayLanguage());
        System.out.println("English word name is :" + lc5.getDisplayLanguage());

        Locale[] lc6 = {new Locale("en","US"),
        new Locale("es","ES"),
        new Locale("it","IT"),
        new Locale("jp","JP"),
        new Locale("no","NO")
    
    };
    for(int i=0; i<lc6.length; i++){
        System.out.println(lc6[i].getDisplayLanguage(lc6[i])+" :" + lc6[i].toString());
    }
    }
}
