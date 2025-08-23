import java.util.*;

public class arrayquestions {
    public static void main(String[] args){
    int [] arr1 = {3, 5, 6, 7, 8, 9};
    System.out.println(Arrays.toString(arr1));
    swap(arr1, 1, 3);
    
    System.out.println(Arrays.toString(arr1));
    System.out.println(max(arr1));
    reverse(arr1);
    System.out.println(Arrays.toString(arr1));
}

// swap elements in array
static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr [index1] = arr [index2];
        arr [index2] = temp;
    }

//maximum element in array
static int max(int arr[]){
    if( arr == null){
        return -1;
    }
    else{
    int maxvalue = arr[0];
    for(int i=1; i< arr.length; i++){
        if(arr[i] > maxvalue){
            maxvalue = arr[i];
        }
    }
    return maxvalue;
}
}

//reverse the array
static void reverse(int[] arr){
    int start = 0;
    int end = arr.length -1;
     while(start < end){
        swap(arr, start, end);
        start++;
        end --;
     }
}
}
