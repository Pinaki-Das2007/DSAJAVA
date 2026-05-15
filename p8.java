import java.util.Scanner;
public class p8 {
    public static long power(int x , int n){
        long result = 1;
        for (int i = 1 ; i <=n; i++){
            result = result * x;
        }
        return result ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number :");
        int x = sc.nextInt();

        
        System.out.println("Enter the power number :");
        int n = sc.nextInt();

        long result = power(x,n);

        System.out.println("The result of the power is :"+ result);

        sc.close();


    }
}
