// Using Calendar to get and set the current date and time
import java.util.Calendar;
public class ex11 {
    public static void printCalendar(String msg, Calendar cal) {
        int year = cal.get(Calendar.YEAR);

        // get() returns an integer from 0 to 30.
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int hour = cal.get(Calendar.HOUR);
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int ampm = cal.get(Calendar.AM_PM);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millisecond = cal.get(Calendar.MILLISECOND);

        System.out.print(msg + year + "/" + month + "/" + day + "/");
        switch(dayOfWeek) {
            case Calendar.SUNDAY: System.out.print("Sunday"); break;
            case Calendar.MONDAY: System.out.print("Monday"); break;
            case Calendar.TUESDAY: System.out.print("Tuesday"); break;
            case Calendar.WEDNESDAY: System.out.print("Wednesday"); break;
            case Calendar.THURSDAY: System.out.print("Thursday"); break;
            case Calendar.FRIDAY: System.out.print("Friday"); break;
            case Calendar.SATURDAY: System.out.print("Saturday"); break;
        }
        System.out.print("(" + hourOfDay + " o'clock)");
        if(ampm == Calendar.AM) System.out.print("AM");
        else System.out.print("PM");
        System.out.println(hour + " hour " + minute + " minute " + second + " second " + millisecond + " millisecond");
    }

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        printCalendar("Current ", now);

        Calendar firstDate = Calendar.getInstance();
        firstDate.clear();
        // December 25, 2016. Set month to 11 to represent December.
        firstDate.set(2016, 11, 25);
        firstDate.set(Calendar.HOUR_OF_DAY, 20); // 8 PM
        firstDate.set(Calendar.MINUTE, 30); // 30 minutes
        printCalendar("First date is ", firstDate);
    }
}