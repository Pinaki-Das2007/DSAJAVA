public class arrayq4 {
    public static void main(String[] args){
        int arr[] = {-5,40,20,8,-75,1};

        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] <  min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
    }
}
