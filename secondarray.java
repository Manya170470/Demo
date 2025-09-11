import java.util.*;

public class secondarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
    }
    System.out.println();
    int secondlargest = secondlargestelement(arr);
    if (secondlargest != -1) {
        System.out.println("The second largest element in the array is: " + secondlargest);
    }
    int secondsmallest = secondsmallestelement(arr);
    if (secondsmallest != -1) {
        System.out.println("The second smallest element in the array is: " + secondsmallest);
    }
}

    public static int secondlargestelement(int[] array){
        int largest, secondlargest;
        if(array == null || array.length < 2){
            System.out.println("Array is too small to find the second largest element.");
            return -1;
        }
        // int first = Integer.MIN_VALUE;
        // int second = Integer.MIN_VALUE;
        // for(int i=0; i<array.length; i++){
        //     if(array[i] > first){
        //         second = first;
        //         first = array[i];
        //     }
        //     else if(array[i] > second && array[i] != first){
        //         second = array[i];
        //     }
        // }
        // if(second == Integer.MIN_VALUE){
        //     System.out.println("There is no second largest element.");
        //     return -1;
        // }
        // return second;

        if (array[0]> array[1]) {
            largest = array[0];
            secondlargest = array[1];
        } else {
            largest = array[1];
            secondlargest = array[0];
        }
        for (int i =2; i< array.length; i++){
            if (array[i]> largest) {
                secondlargest = largest;
                largest = array[i];
            } else if (array[i]> secondlargest && array[i] != largest) {
                secondlargest = array[i];                
            }
        }
        if (largest == secondlargest) {
            System.out.println("There is no second largest element.");
            return -1;
        }
        return secondlargest;
    }

    public static int secondsmallestelement(int[] array){
        int smallest, secondsmallest;
        if(array == null || array.length < 2){
            System.out.println("Array is too small to find the second smallest element.");
            return -1;
        }

        if (array[0]< array[1]) {
            smallest = array[0];
            secondsmallest = array[1];
        } else {
            smallest = array[1];
            secondsmallest = array[0];
        }
        for (int i =2; i< array.length; i++){
            if (array[i]< smallest) {
                secondsmallest = smallest;
                smallest = array[i];
            } else if (array[i]< secondsmallest && array[i] != smallest) {
                secondsmallest = array[i];                
            }
        }
        if (smallest == secondsmallest) {
            System.out.println("There is no second smallest element.");
            return -1;
        }
        return secondsmallest;
    }
}
