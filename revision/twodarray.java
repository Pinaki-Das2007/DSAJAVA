public class twodarray {
    public static void main(String[] args){
        
        // int[] [] arr ;
        // arr = new int[3][4];
        
        int [] [] brr = {
            {1,2},
            {3,4},
            {5,6}
        };

        System.out.println(brr[1][1]);

        for(int row = 0 ; row <= brr.length -1 ; row++){
            for(int col = 0 ; col <= brr[row].length -1 ; col++){
                System.out.print(brr[row][col] + " ");
            }
            System.out.println();
        }
    }
    
}
