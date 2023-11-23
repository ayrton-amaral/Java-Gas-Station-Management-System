package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static String readAsString(String displayMessage)
    {
        String value = null;
        do {
            System.out.println(displayMessage);
            value = scanner.next();
        } while (value == null || value.isEmpty());
        return value;
    }

    public static int readAsInteger(String displayMessage)
    {
        Integer value = null;
        do {
            System.out.println(displayMessage);
            try {
                value = scanner.nextInt();
            } catch (Exception exception){
                System.out.println("The input should be an integer number.");
                scanner.next();
            }
        } while (value == null);
        return value;
    }

    public static double readAsDouble(String displayMessage)
    {
        Double value = null;
        do {
            System.out.println(displayMessage);
            try {
                value = scanner.nextDouble();
            } catch (Exception exception){
                System.out.println("The input should be a number.");
                scanner.next();
            }
        } while (value == null);
        return value;
    }

    public static BigDecimal readAsBigDecimal(String displayMessage)
    {
        BigDecimal value = null;
        do {
            System.out.println(displayMessage);
            try {
                value = scanner.nextBigDecimal();
            } catch (Exception exception){
                System.out.println("The input should be a number.");
                scanner.next();
            }
        } while (value == null);
        return value;
    }

    public static LocalDate readAsLocalDate(String displayMessage)
    {
        LocalDate value = null;
        do {
            System.out.println(displayMessage);
            try {
                value = LocalDate.parse(scanner.next());
            } catch (Exception exception){
                System.out.println("Please insert a valid date");
                //scanner.next();
            }
        } while (value == null);
        return value;
    }
}