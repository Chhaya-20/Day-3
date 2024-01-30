import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of  array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // int j = 0;
        for (int i = 1; i < n; i++) {
            int curr = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > curr) {
                a[j + 1] = a[j];
                j--;

            }
            a[j + 1] = curr;
        }
        sc.close();
        System.out.println("Sorted Array is ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
