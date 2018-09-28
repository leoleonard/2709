package Arrays;

public class ArrayComparator {
    Boolean Compare(int [] arr1, int [] arr2) {

        int x = arr1.length;
        int y = arr2.length;

        if (x != y) {
            return false;
        } else {
            for (int i = 0; i < x ; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

}
