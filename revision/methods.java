public class methods {
    public static void print2Table(int n){
        int i = 1 ;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }
    }

    public static void noParametered(){
        int a = 1 ;
        int b = 2 ;
         System.out.println(a+b);
    }

    public static void parametered(int a , int b){
        System.out.println(a+b);
    }

    static void printMultiplication(int a , int b ){
        int ans = a * b;
        System.out.println(ans);
        
    }

    static int sub(int a , int b){
        int answer = a - b;
        System.out.println(answer);
        return answer ;
    }

    public static void main(String[] args){
        print2Table(5);
        noParametered();
        parametered(2, 3);
        printMultiplication(2, 3);
    }
}
