package lab5alternative;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class jestka {
    public static void readAllByByte(InputStream in)throws IOException {
        //Метод для чтения данных из потока по байтам с выводом
        while(true){
            int oneByte=in.read(); //читает 1 байт
            if(oneByte!=-1){//признак отсутствия конца файла
                System.out.println((char)oneByte);
        }else{
                System.out.println("\n"+"end");
                break;
            }
    }
}

    public static void main(String[] args)throws IOException {
        try {
            //с потоком связан файл
            InputStream inFile = new FileInputStream("C:\\Papka1\\sos.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();
            //с потоком связана интернет стрница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();


            // С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка!" + e);
        }
    }}
