package Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 5, 9};
        int[] array2 = new int[] {1, 4, 10};
        int[] array3 = new int[] {10, 4, 1};
        int[] array4 = new int[]  {1, 5, 9};

        ArrayComparator test = new ArrayComparator();
        System.out.println(test.Compare(array1, array2));
        System.out.println(test.Compare(array2, array3));
        System.out.println(test.Compare(array3, array4));
        System.out.println(test.Compare(array1, array4));
    }
}
