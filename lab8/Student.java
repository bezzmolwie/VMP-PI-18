package lab8;


public class Student extends People {
    public Student (String name, String lastname, int age){
        super(name, lastname, age);
    }
    public void learn(){
        System.out.println("I am learnin'!");
    }
}
