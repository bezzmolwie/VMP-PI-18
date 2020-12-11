package lab8;

public class People {
    public People (String name, String lastname, int age){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        System.out.println("Привет, меня зовут "+name+" "+lastname+", и мне "+age+" лет");
    }
    protected String name,lastname;
    protected int age;

    void walk(){
        System.out.println("I am walkin'!");
    }
    void voice(){
        System.out.println("I am singin'!");
    }
    void run(){
        System.out.println("I am runnin'!");
    }
}
