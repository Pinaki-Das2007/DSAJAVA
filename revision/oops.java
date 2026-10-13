public class oops {
    public static void main(String[] args){
        student s1 = new student();
        s1.id = 101 ;
        s1.age = 20 ;
        s1.name = "Pinaki" ;
        s1.no_of_subjects = 5 ;
        System.out.println("Student id is:"+s1.id);
        System.out.println("Student age is:"+s1.age);
        System.out.println("Student name is:"+s1.name);
        s1.study();
        s1.sleep();
        s1.bunk();
    }   
}
