import java.text.SimpleDateFormat;
import java.util.Date;

public class FormDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat fr1 = new SimpleDateFormat("dd/M/yyyy");
        System.out.println(fr1.format(d));

        SimpleDateFormat fr2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(fr2.format(d));

        SimpleDateFormat fr3 = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println(fr3.format(d));

        SimpleDateFormat fr4 = new SimpleDateFormat("dd/MMMM/yyyy");
        System.out.println(fr4.format(d));

        SimpleDateFormat fr5 = new SimpleDateFormat("dd:MMMM:yyyy");
        System.out.println(fr5.format(d));

        SimpleDateFormat fr6 = new SimpleDateFormat("MM dd  yyyy");
        System.out.println(fr6.format(d));

        SimpleDateFormat fr7 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        System.out.println(fr7.format(d));

        SimpleDateFormat fr8 = new SimpleDateFormat("dd-MM-yyyy z");
        System.out.println(fr8.format(d));

        SimpleDateFormat fr9 = new SimpleDateFormat("dd-MM-yyyy zzzz");
        System.out.println(fr9.format(d));

        SimpleDateFormat fr10 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss zzzz");
        System.out.println(fr10.format(d));

        SimpleDateFormat fr11 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
        System.out.println(fr11.format(d));
    }

}
