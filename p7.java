import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        int positive = 0, negative = 0, zero = 0;
        char choise ;
    do{
        System.out.println("Enter a number :");
        num = sc.nextInt();

        if(num>0){
            positive ++;
        }

        else if (num<0){
            negative ++;

        }
        
        else{
            zero ++;
        }
        System.out.println("Do you want to enter another number ? (y/n)");
        choise = sc.next().charAt(0);
    }
     
    while (choise == 'y'|| choise == 'Y');
    System.out.println("\n Count of positive numbers is :"+ positive);
    System.out.println("\n Count of negative numbers is :"+ negative);
    System.out.println("\n Count of zero numbers is :"+ zero);
 
    sc.close();
    }
}
