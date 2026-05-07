import java.util.Scanner;
public class practice {
    public static int multiplication(int a , int b){
        int mul = a *b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();

        System.out.print("Enter the second number :");
        int b = sc.nextInt();

        int mul = multiplication(a,b);
        System.out.println("The multiplication value is : "+ mul);




        sc.close();
        }
}