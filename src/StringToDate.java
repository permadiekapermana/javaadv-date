import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static void main(String[] args) throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	   String dateInString = "25-01-2021 17:00:56";
	   Date date = sdf.parse(dateInString);
	   System.out.println(date);
	}
}