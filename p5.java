import java.util.Scanner;
public class p5 {
    
    public static int age (int a){
        if (a>=18){
            System.out.println("You are eligible to vote.");
        }

        else{
            System.out.println("You are not eligible to vote.");
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int a = sc.nextInt();
        age(a);
        sc.close();


}
}
