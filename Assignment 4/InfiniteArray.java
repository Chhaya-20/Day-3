import java.util.*;

public class InfiniteArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter l index");
        int l = sc.nextInt();
        System.out.println("Enter r value");
        int r = sc.nextInt();
        int k = 0;
        if (l > n) {
            k = l % n;
        } else {
            k = (l - 1);
        }
        int sum = 0;
        System.out.println(k);
        for (int i = 0; i <= (r - l); i++) {

            sum = sum + a[k];
            if (k == (n - 1)) {
                k = -1;
            }
            k++;

        }
        System.out.println(sum);
        sc.close();
    }

}
