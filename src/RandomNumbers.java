import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(50);
        private int size =  scanner.nextInt();
        private int [] arr = new int[size] ;

    public void setArr() {
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(50);
        }
    }

    public void outputArr(){
        System.out.println("Output numbers without  a line break :");

        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }

        System.out.println("\nWith  a line break : ");

        for(int i = 0; i < arr.length; i++){
            System.out.println( arr[i]);
        }

    }



}
