// import java.util.*;

public class sb1 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony") ;
        System.out.println(sb);
        

        // charAt() method
        System.out.println(sb.charAt(0));

        // setCharAt() method
        sb.setCharAt(2,'m');
        System.out.println(sb);
    }
}
