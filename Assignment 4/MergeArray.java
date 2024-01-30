import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array");
        int n = sc.nextInt();
        Vector<Vector<Integer>> arr = new Vector<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < n; i++) {
            System.out.println("Enter no. of  elements in " + (i + 1) + " array");
            int b = sc.nextInt();
            System.out.println("Enter elem ");
            Vector<Integer> vector1 = new Vector<>();
            for (int j = 0; j < b; j++) {

                int t = sc.nextInt();
                vector1.add(t);

            }
            arr.add(vector1);
            // System.out.println(arr[i].leng);
            minHeap.offer(new int[] { vector1.get(0), i, 0 });
        }
        Vector<Integer> vec = new Vector<Integer>();
        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int i = curr[1];
            int j = curr[2];
            // System.out.println(curr[0] + " " + curr[1] + " " + curr[2] + arr[i].length);
            vec.add(curr[0]);
            if (j + 1 < arr.get(i).size()) {

                minHeap.offer(new int[] { arr.get(i).get(j + 1), i, j + 1 });
            }

        }
        sc.close();
        // for(int i=0;i<vec.size();i++)
        // {
        // System.out.println();

        // }
        System.out.println("Merging Array is " + vec);

    }

}
