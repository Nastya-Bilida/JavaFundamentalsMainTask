import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Add name: ");
        Scanner scanner = new Scanner(System.in);
        String name = "Hello, " + scanner.next() + "!";
        System.out.println(name.toString());
        StringBuffer buff = new StringBuffer(name);
        buff.reverse();
        System.out.println("Reverse: " + buff.toString());

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.setArr();

        SumNumbers sumNumbers = new SumNumbers();
        sumNumbers.setArray();

        NumberMonth numberMonth = new NumberMonth();
        numberMonth.inputNumberMonth();
    }
}









