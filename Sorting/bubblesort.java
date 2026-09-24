public class bubblesort {

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int n = arr.length - 1;


        // Time complexity of bubble sort in O^(n^2 )
        for (int i = 0; i < n; i++) {
            for(int j =0 ; j < n-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
