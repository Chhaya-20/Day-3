import java.util.*;

public class ProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = a[0];
        right[n - 1] = a[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * a[i];
        }
        // System.out.println("hello");
        for (int j = (n - 2); j >= 0; j--) {
            right[j] = right[j + 1] * a[j];
        }

        int ans[] = new int[n];
        ans[0] = right[1];
        ans[n - 1] = left[n - 2];
        // for (int i = 0; i < n; i++) {
        // System.out.println(left[i]);
        // }
        // System.out.println("..........................................");
        // for (int i = 0; i < n; i++) {
        // System.out.println(right[i]);
        // }
        System.out.println("Ans array is ");
        for (int i = 1; i < n - 1; i++) {
            ans[i] = left[i - 1] * right[i + 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
        sc.close();
    }
}
