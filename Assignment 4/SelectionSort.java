import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[small] > a[j]) {
                    small = j;
                }
            }
            int t = a[small];
            a[small] = a[i];
            a[i] = t;

        }
        System.out.println("Sorted Array ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }

}
