public class q2 {
    public static void printnumber1(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            
        }

    }

    public static void printnumber2(int m){
        if (m == 6) {
            return ;
        }

        System.out.println(m);
        printnumber2(m + 1);
    }





    public static void main(String[] args) {
        int n = 5;
        System.out.println("Method 1 : Using for loop  ");
        printnumber1(n);

        System.out.println("-------------------");

        int m = 1 ;

        System.out.println("Method 2 : Using If condition");
        printnumber2(m);
    }
}
