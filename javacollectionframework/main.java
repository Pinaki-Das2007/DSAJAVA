import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();


        // Add
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr);

        arr.add(40);
        System.out.println(arr);

        //  Remove
        arr.remove(2);
        System.out.println(arr);

        // addAll
        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);

        arr.addAll(list);
        System.out.println(arr);

        // removeAll
        arr.removeAll(list);
        System.out.println(arr);

        // clear
        arr.clear();
        System.out.println(arr);


        
        // Collection<Integer> collection = new ArrayList<>();

    }
}
