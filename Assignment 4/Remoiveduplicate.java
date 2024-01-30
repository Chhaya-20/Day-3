import java.util.*;

public class Remoiveduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elem ");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] == a[i]) {
                continue;
            } else {
                ans++;
            }

        }
        sc.close();
        System.out.println("ans" + ans);
    }

}
