import java.util.*;

public class Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter new element ");
        int elem = sc.nextInt();
        if (elem > a[n - 1]) {
            System.out.println("Index is " + n);
        } else {
            for (int i = 0; i < n; i++) {
                if (a[i] > elem) {
                    System.out.println("Index is " + (i));
                }
            }
        }
        sc.close();
    }

}
