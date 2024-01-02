import java.util.Arrays;

/**
 * Main
 * 1 Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3,
 * 5]) → 0
 * 2 Написать функцию, возвращающую разницу между самым большим и самым ма-
 * леньким элементами переданного не пустого массива.
 * 3 Написать функцию, возвращающую истину, если в переданном массиве есть два
 * соседних элемента, с нулевым значением.
 */
public class Main {

    public static int countEvens(int[] array) {
        int count = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int var(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 2, 3, 4 };
        int[] arr2 = { 2, 2, 0 };
        int[] arr3 = { 1, 3, 5 };
        System.out.printf("%d\n", countEvens(arr1));
        System.out.printf("%d\n", countEvens(arr2));
        System.out.printf("%d\n", countEvens(arr3));

        System.out.printf("%d\n", var(arr1));
        System.out.printf("%d\n", var(arr2));
        System.out.printf("%d\n", var(arr3));
    }
}