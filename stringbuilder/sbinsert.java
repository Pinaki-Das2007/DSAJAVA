public class sbinsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(4,'n');
        System.out.println(sb);
    }
}
