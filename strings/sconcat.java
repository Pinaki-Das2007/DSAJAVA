
public class sconcat {
    public static void main(String[] args) {
        String firstName = "Tony ";
        String lastName = "Stark" ;
        String fullName =  firstName + lastName;
        System.out.println("Full name is: " + fullName);

        String firstname1 = "Harry ";
        String lastname1 = "Potter";
        String fullname1 = firstname1.concat(lastname1);
        System.out.println(("Full name after concatination method is    "+fullname1));
    }
}
