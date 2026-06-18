import java.util.Scanner;
public class p12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the 2d array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [] [] arr = new int[rows][cols];
        for (int i = 0;i < rows ; i++){
            for (int j = 0 ; j < cols ; j++){
                System.out.println("Enter the element at position [" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2d array is :"+ java.util.Arrays.deepToString(arr));


        System.out.println("Enter the number to search inside the 2d array for it's position:");
        int search = sc.nextInt();

        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < cols ; j++){
                if (arr[i][j] == search){
                    System.out.println("Number found at position [" + i + "][" + j + "]");
                }
            }
        }


        sc.close();
    }
}
