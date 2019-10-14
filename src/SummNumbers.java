import java.util.Scanner;

public class SummNumbers {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    private int [] arr = new int[size] ;

    public void setArr() {
        System.out.println("Add numbers: ");
        for ( int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }

    }

    public void summa(){
        int sum = 0;

        for (int i: arr){
             sum += i;
        }

        System.out.println("Summa numbers: " + sum);
    }
}
