import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString{
    public static void main(String[] args) {
        // format dd/MM/yyy
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    String date = sdf.format(new Date());
        System.out.println(date);
        
        // format dd-MM-yyyy
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
	    String date2 = sdf2.format(new Date());
	    System.out.println(date2);
    }
}