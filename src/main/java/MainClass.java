public class MainClass {


//    /**    1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1). Но в массиве гарантированно 1 число пропущено.
//     * Необходимо вывести на экран пропущенное число.
//     Примеры:
//     [1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16] => 11
//     [1, 2, 4, 5, 6] => 3
//     [] => 1
//
//     */

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20};
        int[] nullArr = new int[0];
        FindMissNum.getMissNum(arr1);
        FindMissNum.getMissNum(arr2);
        FindMissNum.getMissNum(nullArr);




    }
}
