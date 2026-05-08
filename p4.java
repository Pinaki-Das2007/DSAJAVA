/*
Write a function which takes in the radius as input and returns the circumfference of a circle.
*/
import java.util.Scanner;
import  java.lang.Math;
public class p4{
    public static double radius(double r){
        double circumference = 2*Math.PI*r;

        return circumference;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double r = sc.nextDouble();
        radius(r);
        System.out.println("The circumference of the circle is :"+ radius(r));
        sc.close();
    }
}