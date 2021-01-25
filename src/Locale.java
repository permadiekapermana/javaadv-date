import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

public class Locale {
	public static void main(String[] args) throws ParseException {
		Locale locale = Locale.getDefault();		
		Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(dateFormat.format(date));
	}
}