import java.util.*;

class array1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int arrSize = sc.nextInt();
    int[] array = new int[arrSize]; 
    for(int j=0; j<arrSize; j++){
        System.out.println("Enter " + j + "th index value of the array");
            array[j] = sc.nextInt();
    }
    int max = largestElement(array);
        System.out.println("The largest element in the array is: " + max);

        sc.close();
}

    public static int largestElement(int[] nums) {
        if(nums == null || nums.length == 0){
            System.out.println("Array us empty!");
            return -1;
        }
    int max = nums[0];
    for(int i=0; i<nums.length; i++){
       if(nums[i]> max){
        max = nums[i];
       }
    }
    return max;
        }
        
    }