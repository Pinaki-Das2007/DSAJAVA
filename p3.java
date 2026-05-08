/*
Write a function which takes 2 numbers  and return the greater of those two.
*/

import java.util.Scanner;
public class p3 {
    public static int greater(int a , int b){
        if (a > b){
            System.out.println("The greater number is :"+ a);
            return a;

        }

        else {
            System.out.println("The greater number is :"+ b);
            return b ;
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first digit :");
            int a  = sc.nextInt();

            System.out.print("Enter the second digit :");
            int b = sc.nextInt();

            greater(a,b);


            
            sc.close();
        }



}
