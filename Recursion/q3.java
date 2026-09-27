public class q3 {
    public static int sum1(int n ){
        if ( n == 0){
            return 0;
        }
        return n + sum1(n-1);

    }


    public static int sum2(int n){
        int i ;
        int sumn = 0;
        for (i= 0; i <= n;i++){
            sumn += i;
            
        }
        return sumn;

    }


    public static void main(String[] args) {
        int n = 5;
        int result = sum1(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);


        int result2 = sum2(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result2);

    }
    }

