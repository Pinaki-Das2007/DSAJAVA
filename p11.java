import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the values of the array: ");
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("The array after entering the values are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.print("\nEnter the number to search inside the array for its position: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (num[i] == search) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The number you entered is not available inside the array. Kindly check the number and enter again.");
        }

        sc.close();
    }
}