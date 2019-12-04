import java.util.Scanner;

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class NumberMonth {
    void inputNumberMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        try {
            int number = scanner.nextInt();
            System.out.println("Month: " + Month.values()[number - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number of Month is invalid! ");
        }
    }
}
