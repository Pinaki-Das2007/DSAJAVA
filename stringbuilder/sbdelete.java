public class sbdelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tonny");
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);
    }
}
