import java.time.LocalDateTime;

public class LocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.getYear());
        System.out.println(now.getMinute());
        System.out.println(now.minusDays(5));
        System.out.println(now.plusMonths(92));
        System.out.println(now.getHour());
        System.out.println(now.getNano());

        LocalDateTime strtoDateTime = LocalDateTime.parse("2022-04-23T11:52:12.123");
        System.out.println(strtoDateTime);
    }

}
