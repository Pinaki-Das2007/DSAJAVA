/*
Enter 3 numbers from the user & make a function to print their average
*/


import java.util.Scanner;
public class p1 {
    public static int avg(int a , int b , int c){
        int sum = a+b+c;
        int avg = sum /3;

        return avg;
   }
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number :");
    int a = sc.nextInt();

    System.out.print("Enter the second number :");
    int b = sc.nextInt();

    System.out.print("Enter the third number :");
    int c = sc.nextInt();

    int average = avg( a ,  b ,  c);
    System.out.println("The average of 3 numbers is :"+ average);


    sc.close();
       }
    }
