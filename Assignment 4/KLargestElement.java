import java.util.*;

public class KLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        System.out.println("Enter no. of elemnts");
        int b = sc.nextInt();
        int ans[] = new int[b];
        int j = 0;
        for (int i = (n - b); i < n; i++, j++) {
            ans[j] = a[i];

        }
        System.out.println("Elements are ");
        for (int i = 0; i < b; i++) {
            System.out.println(ans[i]);
        }

        sc.close();
    }

}
