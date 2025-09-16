public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 99, 45, 88};
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        System.out.println("Max = " + max);
    }
}