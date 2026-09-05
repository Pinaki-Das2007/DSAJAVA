import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns you need in the array : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int i , j ;

        for(i = 0 ; i < rows ; i++){
            for(j = 0 ; j < cols ; j++){
            System.out.println("Enter the element at index [" + i + "][" + j + "] : ");
            arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search in the array : ");
        int choice = sc.nextInt();

        for(i = 0 ; i < rows ; i++){
            for(j = 0 ; j < cols ; j++){
                System.out.println("Element at index [" + i + "][" + j + "] is: ");
                System.out.println(arr[i][j] + " ");
            }
        }


        for ( i = 0 ; i < rows ; i ++){
            for (j =0; j < cols ; j++){
                if (arr[i][j] == choice){
                    System.out.println("Element found at index [" + i + "][" + j + "] ");
                    break;
                }
            }
        }

    


        sc.close();
    }
}
