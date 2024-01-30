import java.util.*;

public class LongestSequence {
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
        int small = Integer.MIN_VALUE;
        int c = 0, ans = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == small) {
                c++;
                small = a[i];
            } else if (small != a[i]) {// new element start
                c = 1;
                small = a[i];
            }
            ans = Math.max(ans, c);

        }
        System.out.println("Longest sequence is of lenght " + ans);
        sc.close();
    }

}
