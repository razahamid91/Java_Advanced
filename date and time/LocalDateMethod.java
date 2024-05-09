import java.time.LocalDate;

public class LocalDateMethod {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        System.out.println(dt.getMonthValue());
        System.out.println(dt.getMonth());

        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getDayOfYear());

        System.out.println(dt.isLeapYear());

        System.out.println(dt.plusDays(1));
        System.out.println(dt.minusDays(1));

        System.out.println(dt.plusMonths(1));
        System.out.println(dt.minusMonths(1));

        System.out.println(dt.plusYears(5));
        System.out.println(dt.minusYears(3));


        System.out.println(dt.getYear());

        System.out.println(dt.getEra());

        System.out.println(dt.lengthOfMonth());
        System.out.println(dt.lengthOfYear());




    }
    
}
