import java.util.*;

public class arraylist {

    //Multidimensional arraylist
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
        
        System.out.println("Enter the initial size of Arraylist: ");
        int rows = in.nextInt();

        for(int i =0; i < rows; i++){
           list.add(new ArrayList<>());
        }
        
        for(int i= 0; i< rows; i++){
            System.out.println("Enter no of coloumns for the row " + i + ":");
            int cols = in.nextInt();
        
        System.out.println("Enter " + cols + " elements for row " + i + ":");
            for (int j = 0; j < cols; j++) {
                int value = in.nextInt();
                list.get(i).add(value);  // add value to that row
            }
    }
    System.out.println("\nYour 2D ArrayList is:");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println(); 
        }

        in.close();
}
}
