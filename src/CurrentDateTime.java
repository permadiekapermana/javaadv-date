import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));		
	}
}
