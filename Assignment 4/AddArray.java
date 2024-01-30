import java.util.*;

public class AddArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int a1 = 0, a2 = 0;
        for (int i = 0; i < n; i++) {
            a1 = a1 * 10 + a[i];

        }

        for (int i = 0; i < n; i++) {
            a2 = a2 * 10 + b[i];

        }
        System.out.println("Sum is " + (a1 + a2));
        sc.close();
    }

}
