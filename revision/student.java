public class student {
    public int id;
    public int age;
    public String name;
    public int no_of_subjects;


    public student(){
        System.out.println("Student default constructor");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void bunk(){
        System.out.println(name + " is bunking");
    }
}
