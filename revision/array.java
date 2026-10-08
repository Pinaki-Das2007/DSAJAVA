import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [];
        arr = new int[5];
        int brr[] =  {10,20,30,40,50};
        System.out.println("Value at 0 index of arr is: " + arr[0]);
        System.out.println("Value at 1 index of arr is: " + arr[1]);
        System.out.println("Value at 2 index of arr is: " + arr[2]);
        System.out.println("Value at 3 index of arr is: " + arr[3]);
        System.out.println("Value at 4 index of arr is: " + arr[4]);
        System.out.println("Value at 0 index of brr is: " + brr[0] );
        System.out.println("Value at 1 index of brr is: " + brr[1] );
        System.out.println("Value at 2 index of brr is: " + brr[2] );
        System.out.println("Value at 3 index of brr is: " + brr[3] );
        System.out.println("Value at 4 index of brr is: " + brr[4] );   


        int n = brr.length;
        for(int i = 0; i <= n- 1; i++){
            System.out.println(brr[i]);
        }

     System.out.println("New way to iterate");
        
     for(int i : brr){
        System.out.println(i);
     }

     System.out.println(" Taking input into an array");

     int crr[] = new int[5];
     for(int i = 0 ; i <= crr.length - 1 ; i ++){
        System.out.println(("Enter the value at index " + i));
        crr[i] = sc.nextInt();
     }


     for(int val : crr){
        System.out.println(val);
     }


     sc.close();
    }
}
