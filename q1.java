import java.util.* ;  
public class q1 {
    public static int addition( int a , int b) {
        int sum = a +b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addition(a, b);

        System.out.println("Sum of two numbers is : " + sum);

        sc.close();
    }
    
}
