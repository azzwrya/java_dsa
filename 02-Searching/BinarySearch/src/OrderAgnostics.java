public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr={100,87,67,55,44,38,27,18,10,2};
        int target =18;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }

            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;

                }


            }
        }
        return -1;
    }
}
