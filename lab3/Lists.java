package lab3;

public class Lists {
    public static void main(String[] args) {
        Node head=new Node(0,null);
        Node tail=head;
        for (int i=0;i<9;i++){
            tail.next=new Node(i+1,null);
            tail=tail.next;
        }

        head=new Node(228,head);//добавление элемента в начало списка

        Node newtail=new Node(123,null); // добавление элемента в конец списка
        Node ref1=head;
        while (ref1.next!=null) {//пока не последний элемент
            ref1 = ref1.next;
        }
        ref1.next=newtail;

        Node newNode=new Node(44,null);
        Node ref2=head;
        int k=1;
        //поиск нужного положения узла для вставки
        while (ref2.next!=null&&(k<6)){
            ref2=ref2.next;
            k++;
        }
        //переброска ссылок при вставке элемента
        newNode.next=ref2.next.next;
        ref2.next=newNode;


        head=head.next;//удаление элемента с начала списка(с головы)
        //удаление последнего элемента списка
        Node ref3=head;
        //перемещаемся на предпоследний элемент
        while (ref3.next.next!=null){
            ref3=ref3.next;
        }
        ref3.next=null;


        Node ref4=head;
        int j=1;
        while(ref4.next!=null&&(j<5)){
            ref4=ref4.next;
            j++;
        }
        ref4.next=ref4.next.next;

        Node ref=head; //вывод на экран
        while (ref!=null){
            System.out.print(" "+ref.value);
            ref = ref.next;
        }
    }
}

class Node {
    public int value;
    public Node next;

    public Node(int value, Node next){
        this.value=value;
        this.next=next;
    }
}
