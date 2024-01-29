import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class SimpleDateFormatExample {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Date date = new Date();

        String DATE_FORMAT = "dd/MM/yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

        System.out.println("Today is " + sdf.format(date));
    }
}