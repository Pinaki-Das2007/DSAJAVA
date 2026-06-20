import java.util.Scanner;
public class todarray {
    public static void main(String[] args) {
    // Creating a scanner class

        Scanner sc = new Scanner(System.in);

        // input section
        System.out.println(("Enter the number of rows and columns of the 2d array:"));
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [] [] arr = new int[rows][cols];

        // loops and  value input

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols;j++){
                System.out.println("Enter the element at position [" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
             
        }

        // output section
        System.out.println("The 2d array is :" + java.util.Arrays.deepToString(arr));
     

        sc.close();
    }
}