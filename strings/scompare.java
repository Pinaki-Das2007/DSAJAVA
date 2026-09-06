public class scompare {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.compareTo(name2) == 0){
            System.out.println("Both names are equal");
        } else {
            System.out.println("Both names are not equal");

        }

        if (name1 == name2){
            System.out.println("Both names are equal");
        } else {
            System.out.println("Both names are not equal");
        }
    }
}
 