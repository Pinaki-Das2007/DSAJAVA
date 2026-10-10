import java.util.Scanner;

public class m3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the sum of its digits:");
        int num = sc.nextInt();
        int sum = 0;

        while (num!= 0) {
            sum += num % 10;
            num = num /10;


        }
        System.out.println("Sum of digits: " + sum);


        sc.close();
    }
}
