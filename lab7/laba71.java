package lab7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class laba71 {
    public static void main(String[] args) {
        try{
            File folder = new File("C:\\Mymy");
            if (!folder.exists())
                folder.mkdir();
            File f1=new File("C:\\Mymy\\num1Mart.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in);
            System.out.println("Сколько чисел записать в файл? \n => ");
            int count = sc.nextInt();
            RandomAccessFile rf= new RandomAccessFile(f1,"rw");
            System.out.println("Исходный размер файла в байтах ="+rf.length()+",указатель стоит на "
            +rf.getFilePointer()+"-м байте");
            System.out.println("Введите числа: ");
            for(int i=0;i<count;i++){
                rf.writeInt(sc.nextInt());
            }
            System.out.println("Новый размер файла в байтах =" + rf.length()
                    + ", указатель стоит на " + rf.getFilePointer() + "-м байте");
            System.out.println("Кол-во байт на 1 число = "+rf.length()/count);
            rf.close();
            rf=new RandomAccessFile(f1,"r");
            System.out.println("\n Числа в файле : ");
            for(int i=0;i<count;i++){
                rf.seek(i*4);
                System.out.println("Число "+i+": "+rf.readInt());
            }
            rf.seek(rf.getFilePointer()-4);//перевод указателя на последнее число
            System.out.println(" Количество чисел в файле= " + rf.length()/4
                    + ", последнее число= " + rf.readInt());
            // Поиск заданного числа в файле и определение его номера (номеров)
            System.out.println("\nВведите число, которое нужно найти в файле => ");
            int x = sc.nextInt();
            int kol=0;
            for(int i=0;i<count;i++){
                rf.seek(i*4);
                int number =rf.readInt();
                if(number==x){
                    kol++;
                    System.out.println("Номер "+i+", ");
                }
            }
            System.out.println("кол-во искомых чисел= "+kol);
            rf.close();
            // СОРТИРОВКА ЧИСЕЛ В ФАЙЛЕ МЕТОДОМ «ПУЗЫРЬКА»
            rf=new RandomAccessFile(f1,"rw");
            for(int k=0;k<count;k++){
                for(int i=0;i<count-k-1;i++){
                    rf.seek(i*4);
                    int number1=rf.readInt();
                    int number2=rf.readInt();
                    if (number1>number2){
                        rf.seek(i*4);
                        rf.writeInt(number2);
                        rf.writeInt(number1);
                    }
                }
            }
            System.out.println("\nЧисла, отсортированные в файле:");
            for (int i=0;i<count;i++){
                rf.seek(i*4);
                System.out.println(" "+rf.readInt());
            }
            rf.close();
        }catch (IOException e ){
            System.out.println("End of file "+e);
        }
    }
}
