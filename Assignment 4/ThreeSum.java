import java.util.*;

class Threesum {
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
        System.out.println("Enter sum ");
        int sum = sc.nextInt();
        Arrays.sort(a);
        int j = n - 1, k = 1;
        for (int i = 0; i <= (n - 3); i++) {

            j = n - 1;
            k = i + 1;
            while (k < j) {
                // System.out.println(a[i]);
                // System.out.println(a[j]);
                // System.out.println(a[k]);
                if ((a[i] + a[j] + a[k]) > sum) {
                    j--;

                } else if ((a[i] + a[j] + a[k]) < sum) {
                    k++;
                } else {
                    System.out.println(a[i]);
                    System.out.println(a[j]);
                    System.out.println(a[k]);
                    break;

                }
            }

        }
        sc.close();
    }

}
