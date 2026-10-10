import java.util.Scanner;

public class m1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which you want to get the digits: ");
        int num = sc.nextInt();

        int digit ;

        while (num != 0) {
            digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }

    

        sc.close();
    }
}
