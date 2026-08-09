import java.util.* ;

public class q2 {
    public static int multiplication(int a , int b){
        int product = a *b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiplication(a,b);

        System.out.println("Product of two numbers is : " + product);


        sc.close();
    }
}
