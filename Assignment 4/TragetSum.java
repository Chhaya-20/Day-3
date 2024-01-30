import java.util.*;

public class TragetSum {
    static int sum(List<Integer> arr, int i, int s, int target) {
        if (s == target && i == arr.size()) {
            return 1;
        }

        if (i >= arr.size()) {
            return 0;
        }

        return sum(arr, i + 1, s + arr.get(i), target) + sum(arr, i + 1, s - arr.get(i), target);
    }

    // Driver Program
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            arr.add(t);
        }
        sc.close();
        int target = sc.nextInt();

        System.out.println(sum(arr, 0, 0, target));
    }
}
