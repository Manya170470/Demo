public class arraysortornot {
    public static boolean isArraySorted(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null!");
            return true; // An empty array is considered sorted
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // Found an element out of order
            }
        }
        return true; // No elements were out of order
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 3, 4, 1, 2};

        System.out.println("Is array1 sorted? " + isArraySorted(array1)); // Should print true
        System.out.println("Is array2 sorted? " + isArraySorted(array2)); // Should print false
    }

}
