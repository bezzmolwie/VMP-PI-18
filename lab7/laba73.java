package lab7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class laba73 {
    public static void main(String[] args) {
        try{
            File folder = new File("C:\\Mymy");
            if (!folder.exists())
                folder.mkdir();
            File f1=new File("C:\\Mymy\\rec_RAF.txt");
            f1.createNewFile();
            RandomAccessFile rf = new RandomAccessFile(f1,"rw");
            long fSize = rf.length();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите кол-во сотрудников для записи в файл\n"+"=> ");
            int kol=sc.nextInt();
            sc.nextLine();
            String fam,doljnost;
            int oklad;
            //----ЗАПИСЬ ИНФОРМАЦИИ О СОТРУДНИКАХ В ФАЙЛ----
            for (int i=0;i<kol;i++){
                System.out.println("Введите фамилию "+(i+1)+" сотрудника => ");
                fam=sc.nextLine();
                rf.seek(rf.length());
                rf.writeUTF(fam);
                for(int j=0;j<20-fam.length();j++)
                    rf.writeByte(1);
                System.out.println("Введите его должность => ");
                doljnost=sc.nextLine();
                rf.writeUTF(doljnost);
                for (int j=0;j<20-doljnost.length();j++)
                    rf.writeByte(1);
                System.out.println("Введите его оклад => ");
                oklad=sc.nextInt();
                sc.nextLine();
                rf.writeInt(oklad);
            }
            rf.close();
            //----ЧТЕНИЕ ИНФОРМАЦИИ О СОТРУДНИКАХ ИЗ ФАЙЛА----
            rf = new RandomAccessFile(f1,"r");
            rf.seek(0);
            System.out.println("Информация о сотрудниках");
            System.out.println("Фамилия \t\t Должность \t\t Оклад");
            for (int i=0;i<kol;i++){
                fam=rf.readUTF();
                for (int j=0;j<20-fam.length();j++)
                    rf.readByte();
                doljnost = rf.readUTF();
                for(int j=0;j<20-doljnost.length();j++)
                    rf.readByte();
                oklad=rf.readInt();

                System.out.println(fam+"\t\t\t"+doljnost+"\t\t\t"+oklad);
            }
            rf.close();
        }catch (IOException e ){
            System.out.println("End of file "+e);
        }
    }
}

