import java.time.Duration;
import java.time.LocalTime;

public class TemporalDemo {
    public static void main(String[] args) {
        Duration dr = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(dr.getSeconds());

        Duration dr1 = Duration.between(LocalTime.MIN, LocalTime.MAX);
        System.out.println(dr1.getSeconds());


        // ISnagative 
        Duration dr2 = Duration.between(LocalTime.MAX, LocalTime.NOON);
        System.out.println(dr2.getSeconds());


        Duration dr3 = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(dr3.getSeconds());

        //
        Duration dr4 = dr2.minus(dr3);
        System.out.println(dr4.getSeconds());

        Duration dr5 = dr1.plus(dr3);
        System.out.println(dr5.getSeconds());

    }
    
}
