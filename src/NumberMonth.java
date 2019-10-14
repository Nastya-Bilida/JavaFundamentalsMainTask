import java.util.Scanner;

enum Month{
    JANUARY, FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
}

public class NumberMonth {
    void inputNumberMonth() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number: ");

    if (scanner.hasNextInt()) {
        int number = scanner.nextInt();
        setMonth(number);
    } else {
        System.out.println("It is not number! ");
    }
}
     void setMonth (int number){

        try {
            System.out.println("Month: " + Month.values()[number-1]);
        }catch (ArrayIndexOutOfBoundsException  err) {
            System.out.println("Number of Month is invalid! ");
        }
    }


}
