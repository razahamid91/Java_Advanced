import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalTime2 {
    public static void main(String[] args) {
        LocalDateTime ldt= LocalDateTime.of(2024, Month.APRIL, 25, 15, 23, 45);
        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZoneId id = ZoneId.of("Asia/Calcutta");
        ZoneId id1 = ZoneId.of("Asia/Kalcutta");


        ZonedDateTime zone2 = ZonedDateTime(id, id1);
        
    }
    
}
