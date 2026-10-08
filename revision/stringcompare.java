import java.util.Scanner;
public class stringcompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String name1 = "Pinaki";
        String name2 = "Pinaki";

        if(name1== name2){
            System.out.println(("Both are same."));
        }

        if(name1.equals(name2)){
            System.out.println("Both are same.");
        }

        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Both are same.");
        }

        String name3 = sc.next();
        String name4 = sc.nextLine();

        System.out.println(name3);
        System.out.println(name4);

        sc.close();
    }
}
