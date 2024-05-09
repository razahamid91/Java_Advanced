import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodDemo {
    public static void main(String[] args) {
        Period p = Period.ofDays(10);
        Temporal temp = p.addTo(LocalDateTime.now());
        System.out.println(temp);

        Period p1 = Period.of(2023,)
    }
    
}
