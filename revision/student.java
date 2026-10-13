public class student {
    public int id;
    public int age;
    public String name;
    public int no_of_subjects;

    // Default constructor
    public student(){
        System.out.println("Student default constructor");
    }

    //  Methods
    public void study(){
        System.out.println(name + " is studying");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void bunk(){
        System.out.println(name + " is bunking");
    }

    // Parameterized constructor
    public student(int id , int age , String name, int nos){
        System.out.println("This is a parameterized constructor");
        this.id = id;
        this.age = age;
        this.name = name ;
        this.no_of_subjects = nos;
    }

    // copy constructor
    public student(student s){
        System.out.println("This is a copy constructor");
        this.id = s.id;
        this.age = s.age;
        this.name = s.name ;
        this.no_of_subjects = s.no_of_subjects;
    }
}
