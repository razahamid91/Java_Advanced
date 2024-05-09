import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormater {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        ZonedDateTime zone = ldt.atZone(ZoneId.of("Australia/Darwin"));
        System.out.println(fr.format(zone));

        ZonedDateTime zone2 = ldt.atZone(ZoneId.of("America/Chicago"));
        System.out.println(fr.format(zone2));

        ZoneId zid = zone.getZone();
        System.out.println(zid);

        ZonedDateTime zdt = zone.withZoneSameInstant(ZoneId.of("America/Chicago"));
        System.out.println(zdt);

    }

}
