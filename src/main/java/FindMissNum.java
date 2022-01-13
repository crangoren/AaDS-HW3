public class FindMissNum {
    public static void getMissNum(int[] arr) {
        if (arr.length == 0) {
            System.out.println(1);
            return;
        }

        int start = arr[0];
        int end = arr.length;
        int center = end / 2;
        while(start <= end) {
            if (arr[end - 1] - arr[end - 2] > 1) {
                System.out.println(end);
                return;
            } else if (arr[0] != 1) {
                System.out.println(start - 1);
                return;
            }
            if (start != arr[start] - 1){
                System.out.println(start);
                return;
            } else if (center != arr[center] - 1){
                start = center;
            } else {
                start = center;
                center = center + ((end - center) / 2);
            }
        }




    }
}
