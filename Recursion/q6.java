public class q6 {
    public static int calcpower(int x , int n){
        if ( n ==0){
            return 1;
        }
        else{
            return x * calcpower(x, n-1);
        }
    }
 
    public static void main(String[] args){
        
        int x = 2;
        int n = 3;
        int result = calcpower(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
