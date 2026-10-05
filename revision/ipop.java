import java.util.Scanner;
public class ipop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num1 = sc.nextInt();

        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        System.out.println("Enter the string");
        String str = sc.next();

        System.out.println("Enter the float number");
        float num2 = sc.nextFloat();

        System.out.println("Enter the boolean value either true or false ");
        boolean bool = sc.nextBoolean();

        System.out.println("Enter the double number ");
        double num3 = sc.nextDouble();

        System.out.println(num1);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(num2);
        System.out.println(bool);
        System.out.println(num3);


        sc.close();
        
        
    }
}

