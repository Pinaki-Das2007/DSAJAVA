/*
Write a function to pront the sum of all odd numbers from 1 to n
*/



import java.util.Scanner;
public class p2 {
   public static int add (int n){
    int start = 0;
    int sum ;
    for (int i = 1 ; i<=n ; i++){
        if (i % 2 != 0) {
            sum = start + i;
            start = sum ;
            
        }
        }
        return start ;

   }


   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range of the odd number:");
    int n = sc.nextInt();
    add(n);

    System.out.println("The sum of the odd numbers from 1 to " + n +"is:"+ add(n));

    sc.close();
   }


    }

