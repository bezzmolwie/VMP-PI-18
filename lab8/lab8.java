package lab8;

public class lab8 {
    public static void main(String[] args) {
        People human1 = new People("Aleksandr","Konstantinov",21);
        human1.run();
        human1.walk();
        human1.voice();
        Student student1 = new Student("Ivan","Ivanov",69);
        student1.learn();
        Teacher teacher1= new Teacher("Мария","Ивановна",65);
        teacher1.teach();
    }
}
