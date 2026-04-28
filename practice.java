import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     System.out.print("Enter the operation for addition, subtraction, multiplication, division :");
     String operation = sc.nextLine();
    System.out.println("Enter the first number :");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number :");
    int num2 = sc.nextInt();


    switch (operation ) {
        case "addition":
            int sum = num1 + num2 ;
            System.out.println("The sum is : " + sum);
             break;


        case "subtraction":
            int diff = num1 - num2;
            System.out.println("The difference is : " + diff);
             break;


        case "multiplication":
            int mul = num1 * num2;
            System.out.println("The multiplication is : " + mul);
             break;


        case "division":
            int div = num1 / num2;
            System.out.println("The division is : " + div);
             break;
    
        
    }




     sc.close();
    }
}
