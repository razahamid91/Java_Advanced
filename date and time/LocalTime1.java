import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTime1 {
    public static void main(String[] args) {
        LocalTime tm = LocalTime.now();

        // System.out.println(tm);

        // System.out.println(tm.getHour()+":");
        // System.out.println(tm.getMinute()+":");
        // System.out.println(tm.getSecond()+":");
        // System.out.println(tm.getNano()+":");

        // System.out.println(tm.minusHours(5));
        // System.out.println(tm.minusMinutes(10));

        // System.out.println(tm.plusHours(3));
        // System.out.println(tm.plusMinutes(1));

        ZoneId z= ZoneId.of("Canada/Central");
        LocalTime tm3 = LocalTime.now(z);

        System.out.println(tm3);


    }
    
}
