import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class InternationalTest2 {

    static void date(Locale l){
        DateFormat fr =  DateFormat.getTimeInstance(DateFormat.DEFAULT, l);
        Date dt = new Date();
        System.out.println("Time : " + fr.format(dt));
    }
    public static void main(String[] args) {
        date(Locale.GERMAN);
        date(Locale.FRANCE);
        date(Locale.JAPAN);
        date(Locale.CANADA);
        
    }
}
