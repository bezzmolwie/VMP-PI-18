package lab3;
import java.util.Scanner;

public class Lists2 {
    public static void main(String[] args) {
        Uzel.createHead();
        Uzel.createTail();
        System.out.println("Введите элемент которым хотите заменить =>");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Uzel.AddFirst(n);
        System.out.println("Введите элемент которым хотите заменить =>");
        int z =sc.nextInt();
        Uzel.AddLast(z);
        System.out.println("Введите элемент которым хотите заменить => ");
        int r =sc.nextInt();
        System.out.println("Введите номер нужного положения узла => ");
        int p = sc.nextInt();
        Uzel.Insert(r,p);
        Uzel.RemoveFirst();

    }
}
class Uzel {
    public int value;
    public Uzel next;

    public Uzel(int value,Uzel next){
        this.value=value;
        this.next=next;
    }

    public static void createHead (){
        Uzel head=new Uzel(0,null);
        Uzel tail=head;
        for(int i=0;i<20;i++){
            tail.next=new Uzel(i+1,null);
            tail=tail.next;
        }
        Uzel ref=head;
        while(ref!=null){
            System.out.print(" "+ref.value);
            ref=ref.next;
        }
        System.out.println("\n");
    }
    public static void createTail(){
        Uzel head=null;
        for (int i=9;i>=0;i--){
            head=new Uzel(i,head);
        }
        Uzel ref=head;
        while (ref != null) {
            System.out.print(" "+ref.value);
            ref=ref.next;
        }
        System.out.println("\n");
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Uzel head=null;
        for(int i=9;i>=0;i--){
            head=new Uzel(i,head);
        }
        Uzel ref=head;
        while(ref!=null){
            sb.append(ref.value);
            ref=ref.next;
        }
        System.out.println(sb);
        return "Finished";

    }
    public static void AddFirst(int n){
        Uzel head=new Uzel(0,null);
        Uzel tail=head;
        for(int i=0;i<9;i++){
            tail.next=new Uzel(i+1,null);
            tail=tail.next;
        }
        head=new Uzel(n,head);//добавление элемента в начало списка
        Uzel ref=head;
        while (ref!=null){
            System.out.print(" "+ref.value);
            ref=ref.next;
        }
        System.out.println("\n");
    }
    public static void AddLast(int n){
        Uzel head=new Uzel(0,null);
        Uzel tail=head;
        for(int i=0;i<9;i++){
            tail.next=new Uzel(i+1,null);
            tail=tail.next;
        }
        Uzel newtail=new Uzel(n,null);
        Uzel ref=head;
        while (ref.next!=null){
            ref=ref.next;
        }
        ref.next=newtail;
        Uzel ref1=head;
        while(ref1!=null){
            System.out.print(" "+ref1.value);
            ref1=ref1.next;
        }
        System.out.println("\n");
    }
    public static void Insert(int n,int s){
        Uzel head=new Uzel(0,null);
        Uzel tail=head;
        for(int i=0;i<9;i++){
            tail.next=new Uzel(i+1,null);
            tail=tail.next;
        }
        Uzel newUzel=new Uzel(n,null);
        Uzel ref=head;
        int k=1;
        while(ref.next!=null&&(k<s)){
            ref=ref.next;
            k++;
        }
        newUzel.next=ref.next.next;
        ref.next=newUzel;
        Uzel ref1=head;
        while(ref1!=null){
            System.out.print(" "+ref1.value);
            ref1=ref1.next;
        }
        System.out.println("\n");
    }
    public static void RemoveFirst(){
        Uzel head=new Uzel(0,null);
        Uzel tail=head;
        for(int i=0;i<9;i++){
            tail.next=new Uzel(i+1,null);
            tail=tail.next;
        }
        head=head.next;
        Uzel ref1=head;
        while(ref1!=null){
            System.out.print(" "+ref1.value);
            ref1=ref1.next;
        }
        System.out.println("\n");
    }


}
