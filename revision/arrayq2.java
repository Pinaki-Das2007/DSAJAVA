public class arrayq2 {
    public static void main(String [] args){
        int arr[] = {10,20,30,40,50 };
        int mult = 1 ;
        for(int i = 0 ; i <= arr.length -1 ; i ++){
            mult = mult * arr[i];
        }
        System.out.println(mult);
    }
    
}
