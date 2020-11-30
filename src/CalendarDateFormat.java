import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDateFormat {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = new GregorianCalendar(1941, Calendar.MAY, 9);
        System.out.println(calendar.get(Calendar.MONTH));
        Date dateStart = new Date();
        int res = 0;
        for (int i = 0; i < 1000000000; i++) {
            res += i;
        }
        Date dateFinish = new Date();
        System.out.println(dateFinish.getTime() - dateStart.getTime());

        //Parse string to date and then format date with REGEX pattern
        String dateToParse = "01.02.1985";
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date dateFromString = formatter.parse(dateToParse);
        System.out.println(dateFromString);
        System.out.println(formatter.format(dateFromString));
    }


}
