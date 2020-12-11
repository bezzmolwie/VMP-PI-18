package lab77;
import java.io.*;
import java.util.Scanner;


class Ludi implements Serializable{
    String fam,im,pol;
    int rost;
}

public class Main2 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Scanner sc = new Scanner(System.in,"cp1251");
        File folder = new File("C:\\KonstantinovPI18\\lab7");
        if (!folder.exists())
            folder.mkdir();
        File f1 = new File("C:\\KonstantinovPI18\\lab7\\lab7serializable.txt");
        f1.createNewFile();
        FileOutputStream fos=new FileOutputStream(f1);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream(f1);
        ObjectInputStream oin = new ObjectInputStream(fis);
        File f2= new File("C:\\KonstantinovPI18\\lab7\\lab7serializable2.txt");
        f2.createNewFile();
        FileOutputStream fos2 = new FileOutputStream(f2);
        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);

        FileInputStream fis2 = new FileInputStream(f2);
        ObjectInputStream oin2 = new ObjectInputStream(fis2);

        System.out.println("Введите кол-во людей => ");
        int kol = sc.nextInt();
        sc.nextLine();
        Ludi []ludi = new Ludi[kol];
        System.out.println("Введите информацию о каждом человеке => ");
            for(int i=0;i<ludi.length;i++){
                ludi[i]=new Ludi();
                System.out.println("Введите фамилию "+(i+1)+" человека => ");
                ludi[i].fam=sc.nextLine();
                System.out.println("Введите его имя => ");
                ludi[i].im=sc.nextLine();
                System.out.println("Введите его пол => ");
                ludi[i].pol=sc.nextLine();
                System.out.println("Введите его рост => ");
                ludi[i].rost=sc.nextInt();
                sc.nextLine();
                oos.writeObject(ludi[i]);
            }
            int g=0;
            Ludi[]p_ludi=new Ludi[kol];
            for (int i=0;i<ludi.length;i++){
                p_ludi[i]=(Ludi)oin.readObject();
                if (p_ludi[i].rost >= 170){
                    g++;
                    oos2.writeObject((p_ludi[i]));
                }
            }
            oos.flush();
            oos.close();

            Ludi[]r_ludi = new Ludi[kol];
        System.out.println("Люди, выше 170 см роста:");
            for (int i=0;i<g;i++){
                r_ludi[i]=(Ludi)oin2.readObject();
                System.out.println(r_ludi[i].fam+" "+r_ludi[i].im+" "+r_ludi[i].pol+" "+r_ludi[i].rost+" см");
            }
            oos2.flush();
            oos2.close();

    }
}
