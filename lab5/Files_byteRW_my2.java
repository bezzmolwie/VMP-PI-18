package lab5alternative;

import java.io.*;
import java.util.Scanner;

public class Files_byteRW_my2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite imya fayla = > ");
        String fname =sc.nextLine();
        try{
            File f1 = new File(fname);
            f1.createNewFile();
            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            System.out.println("polniy put fayla : "+f1.getAbsolutePath());

            System.out.println("vvedite kol-vo strok dlya zapisi v fail => ");
            int n=sc.nextInt();
            // Создается поток для записи с учетом типа данных – DataOutputStream,
            // и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for(int i=0;i<n;i++){
                System.out.println("vvedite stroku dlya zapisi v fayl => ");
                String s =sc.nextLine();
                dOut.writeUTF(s );
            }
            dOut.flush();
            dOut.close();
            // Чтение и вывод данных из созданного файла
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true){
                System.out.println(rd.readUTF());
            }
        }catch (Exception e ){
            System.out.println(""+e);
        }
    }
}
