// ## append() means adding something at the end of the stringbuilder object

public class sbappend {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        System.out.println("Before append: " + sb);
        sb.append("e");
        System.out.println("After append: " + sb);
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println("After doing all the appends:" + sb);
        }
}
