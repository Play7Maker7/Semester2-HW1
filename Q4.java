import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b;
        System.out.println("Enter arrays sizes respectively:");
        a=in.nextInt();
        b=in.nextInt();
        int[] x = new int[a];
        int[] y = new int[b];
        boolean check = true;
        System.out.println("Enter array1 elements:");
        for (int i = 0; i < x.length; i++) {
            x[i]=in.nextInt();
        }
        System.out.println("Enter array2 elements:");
        for (int i = 0; i < y.length; i++) {
            y[i]=in.nextInt();
        }
        if (x.length == y.length)
        {
            for (int i = 0; i < x.length; i++) {
                if (x[i]!=y[i]) check = false;
            }
        }
        else check = false;
        if (check == true)
            System.out.println("The arrays are equal");
        else
            System.out.println("The arrays are not equal");
    }
}
