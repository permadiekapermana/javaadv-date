import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class CalenderToDate {
	public static void main(String[] args) throws ParseException {
	    Calendar calendar = Calendar.getInstance();
        Date date =  calendar.getTime();
        System.out.println(date);
	}
}