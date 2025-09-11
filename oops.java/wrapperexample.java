public class wrapperexample {
    public static void main(String[] args) {
    Integer num = 45;
    Integer a = 10;
    Integer b = 20;

    //final has tp be initialised with a value
    final int increase = 2;
    System.out.println(increase);

    // wont change as Integer wrapper class is a final type
    //why wrapper because java doesnt support pass by reference just pass by value
    swap(a,b);
    System.out.println(a + " " + b);
    }
    static void swap(Integer a, Integer b){
        int temp = a;
        b = a;
        b = temp;
    }
}
