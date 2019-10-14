import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       System.out.println("Add name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
       System.out.println("Hello, " + name + "! ");

        System.out.println("Reverse : Hello, " + name);
        StringBuffer buff = new StringBuffer("Hello, " + name);
        buff.reverse();
        System.out.println(buff.toString());

        System.out.print("Add amount of numbers: ");
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.setArr();
        randomNumbers.outputArr();

        System.out.print("Add amount of numbers: ");
       SummNumbers summNumbers = new SummNumbers();
       summNumbers.setArr();
       summNumbers.summa();

       NumberMonth numberMonth = new NumberMonth();
       numberMonth.inputNumberMonth();


    }
}









