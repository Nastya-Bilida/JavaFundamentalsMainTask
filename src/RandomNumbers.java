import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random(50);
    private int size;
    private int[] array;

    public void setArr() {
        System.out.print("Add amount of numbers: ");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Output numbers without  a line break :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nWith a line break : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
