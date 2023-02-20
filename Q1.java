import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[5];
        System.out.println("Enter 5 elements: \n");
        for (int i = 0; i < x.length; i++) {
            x[i]=in.nextInt();
        }
        for (int j : x) {
            System.out.println(j);
        }
    }
}
