import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date and time in the format dd/MM/yyyy HH:mm");
        String userInput = scanner.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {

            Date inputDate = inputFormat.parse(userInput);
            System.out.println("Original timestamp: " + inputFormat.format(inputDate));

            inputDate.setTime(inputDate.getTime() + (24 * 60 * 60 * 1000));
            System.out.println("After adding one day: " + inputFormat.format(inputDate));

            inputDate.setTime(inputDate.getTime() - (10 * 24 * 60 * 60 * 1000));
            System.out.println("After subtracting 10 days: " + inputFormat.format(inputDate));

            inputDate.setTime(inputDate.getTime() + (60 * 60 * 1000));
            System.out.println("After adding 1 hour: " + inputFormat.format(inputDate));

            inputDate.setTime(inputDate.getTime() - ((5 * 60 + 30) * 60 * 1000));
            System.out.println("After subtracting 5 hours and 30 minutes: " + inputFormat.format(inputDate));

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the specified format");
        }
    }
}
