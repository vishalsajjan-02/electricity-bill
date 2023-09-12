import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class age_calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your birth month (1-12):");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter your birth day:");
        int birthDay = scanner.nextInt();

        scanner.close();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Your age is:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
