import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date and time in the format dd/MM/yyyy HH:mm");
        String userInput = scanner.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            Date inputDate = inputFormat.parse(userInput);

            System.out.println("Local timestamp:" + inputFormat.format(inputDate));

            long unixTimestamp = inputDate.getTime() ;
            System.out.println("Unix Timestamp:" + unixTimestamp);

            SimpleDateFormat utcFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String utcTimestamp = utcFormat.format(inputDate);
            System.out.println("UTC Timestamp: " + utcTimestamp);

            Date utcDate = utcFormat.parse(utcTimestamp);
            System.out.println("Converted back to local timestamp :" + inputFormat.format(utcDate));
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the specified format");
        }
    }
}
