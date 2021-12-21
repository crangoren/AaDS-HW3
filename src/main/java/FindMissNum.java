public class FindMissNum {
    public static void getMissNum(int[] arr) {
        if (arr.length == 0) {
            System.out.println(1);
            return;
        }
        int start = arr[0];
        int end = arr.length;

        if (arr[end - 1] != end) {
            System.out.println(arr[end - 1]);
        } else if (start > 1) {
            System.out.println(start);
        }

        while ((end - start) != 1) {
            int center = arr[end - 1] / 2;
            if ((arr[end - 1] - arr[start] == 1) && (end - start != 1)) {
                System.out.println(end - 1);
                return;
            }
            if (arr[center - 1] == center) {
                start = center;
            } else {
                end = center;
            }
        }

    }
}
