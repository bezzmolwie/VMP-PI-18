package lab77;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try
        {
            File f1 = new File("rec_RAF.txt");
            if (!f1.exists()) f1.createNewFile();
            RandomAccessFile rf = new RandomAccessFile(f1,"rw");

            File f2 = new File("rec_RAF2.txt");
            if (!f2.exists()) f2.createNewFile();
            RandomAccessFile rf2 = new RandomAccessFile(f2,"rw");

            long fSize = rf.length();
            long fSize2 = rf2.length();

            Scanner sc = new Scanner(System.in, "cp1251");
            System.out.print("Введите  количество  людей  для  записи  в  файл\n"+ "=>  ");
            int kol = sc.nextInt();
            sc.nextLine();
            String fam, im;
            int pol,rost;
            for(int i = 0; i < kol; i++)
            {
                System.out.print("Введите фамилию " + (i + 1) + " человека => ");
                fam= sc.nextLine();
                rf.seek(rf.length());
                rf.writeUTF(fam);
                for(int j= 0; j< 20 -fam.length(); j++)
                    rf.writeByte(1);
                System.out.print("Введите его имя => ");
                im = sc.nextLine();
                rf.writeUTF(im);
                for (int j = 0; j < 20 -im.length(); j++)
                    rf.writeByte(1);
                System.out.print("Введите его пол(1-muj,0-jen) => ");
                pol= sc.nextInt();
                sc.nextLine();
                rf.writeInt(pol);
                System.out.print("Введите его рост => ");
                rost= sc.nextInt();
                sc.nextLine();
                rf.writeInt(rost);
            }
            rf.close();
            int k = 0;
            rf = new RandomAccessFile(f1, "r");
            rf.seek(0);
            for(int i = 0; i < kol; i++) {
                fam = rf.readUTF();
                for (int j = 0; j < 20 - fam.length(); j++)
                    rf.readByte();
                im = rf.readUTF();
                for (int j = 0; j < 20 - im.length(); j++)
                    rf.readByte();
                pol = rf.readInt();
                rost = rf.readInt();
                if (rost > 170) {
                    k++;
                    rf2.seek(rf2.length());
                    rf2.writeUTF(fam);
                    for (int j = 0; j < 20 - fam.length(); j++)
                        rf2.writeByte(1);
                    rf2.writeUTF(im);
                    for (int j = 0; j < 20 - im.length(); j++)
                        rf2.writeByte(1);
                    rf2.writeInt(pol);
                    rf2.writeInt(rost);
                }
            }

            rf2.seek(0);
            System.out.println("Информация об отобранных людях");
            System.out.println("Фамилия \t\t  Имя \t\t   Пол \t\t   Рост");
            for(int i1 = 0; i1 < k; i1++)
            {
                fam = rf2.readUTF();
                for (int j = 0; j < 20 -fam.length(); j++)
                    rf2.readByte();
                im = rf2.readUTF();
                for (int j = 0; j < 20 -im.length(); j++)
                    rf2.readByte();
                pol = rf2.readInt();
                rost = rf2.readInt();
                System.out.println(i1);
                System.out.println(fam + "\t\t\t" + im + "\t\t\t" + pol + "\t\t\t" + rost);
            }
            rf.close();
            rf2.close();

        }catch (IOException e){
            System.out.println("End of file  " + e);
        }
    }
}