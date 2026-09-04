import java.util.Scanner ;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int number[] = new int[size];
        
        for(int i = 0 ; i < size; i ++){
            System.out.print("Enter the number at index " + i + ":");
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search inside the array:   ");
        int search = sc.nextInt();
        boolean found = true ;
        for(int i = 0 ; i < size; i++){
            if(number[i] == search){
                System.out.print("The number is found at index " + i);
                found = false ;
                break ;
            }
        }
        if(found){
            System.out.println("The number is not found inside the array");
        }   



    sc.close();
 }
}
