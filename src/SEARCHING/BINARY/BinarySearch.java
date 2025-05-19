package SEARCHING.BINARY;//

public class BinarySearch {



    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 4, 5, 7, 8, 10, 14, 18, 44};

        int target = 8;

        int ans = binarySearch(arr, target);

        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;

        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                if (target <= arr[mid]) {
                    return mid;
                }

                start = mid + 1;
            }
        }

        return -1;
    }
}
