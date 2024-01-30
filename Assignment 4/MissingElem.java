import java.util.*;

public class MissingElem {
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
        for (int i = 0; i < n; i++) {
            if (a[i] != (i + 1)) {
                System.out.println("Missing element" + (i + 1));
                break;
            }
        }
        sc.close();
    }
}
