import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the  string: ");
        int size = sc.nextInt();

        String[] str = new String[size]; 

        int i = 0 , totallength = 0;

        for(i = 0 ; i < size ; i ++){
            System.out.println("Enter the string: ");
            str[i] = sc.next();
            totallength += str[i].length();
        }


        System.out.println("The total lenght of the string is: " + totallength);



        sc.close();
    }
}
