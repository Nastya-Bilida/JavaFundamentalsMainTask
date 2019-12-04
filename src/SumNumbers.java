import java.util.Scanner;

public class SumNumbers {
    Scanner scanner = new Scanner(System.in);
    private int size;
    private int[] array;

    public void setArray() {
        System.out.print("Add amount of numbers: ");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Add numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        sum();
    }

    public void sum() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum numbers: " + sum);
    }
}
