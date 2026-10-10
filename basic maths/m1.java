import java.util.Scanner;


public class m1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its digits:");
        int num = sc.nextInt();
        
        
        while (num !=0) {
            int digit =num % 10;
            System.out.println(digit);
            num = num / 10;
        }

        sc.close();
    }
}
