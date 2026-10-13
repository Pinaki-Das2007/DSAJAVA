public class oops {
    public static void main(String[] args){
        // Default constructor
        
        // student s1 = new student();
        // s1.id = 101 ;
        // s1.age = 20 ;
        // s1.name = "Pinaki" ;
        // s1.no_of_subjects = 5 ;
        // System.out.println("Student id is:"+s1.id);
        // System.out.println("Student age is:"+s1.age);
        // System.out.println("Student name is:"+s1.name);
        // s1.study();
        // s1.sleep();
        // s1.bunk();

        // Parameterized constructor
        student s2 = new student(1, 20, "Pinaki", 5);
        System.out.println("Student id is:"+s2.id);
        System.out.println("Student age is:"+s2.age);
        System.out.println("Student name is:"+s2.name);
        System.out.println("Student no of subjects is:"+s2.no_of_subjects);
        student s3 = new student(s2);
        System.out.println("Student id is:"+s3.id);
        System.out.println("Student age is:"+s3.age);
        System.out.println("Student name is:"+s3.name);
        System.out.println("Student no of subjects is:"+s3.no_of_subjects);
    }   
}
