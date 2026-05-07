import java.util.Scanner;
public class j6 {
    public static void printMyName(String name){
        System.out.println("The name is  "+ name);
        return;
    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name :");
    String name = sc.nextLine();
    printMyName(name);

        sc.close();
    }
}
