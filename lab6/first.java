package lab6;

import java.io.*;

//Чтение из одного файла и запись в другой файл данных посимвольно.
public class first {
    public static void main(String[] args) throws IOException{
        Reader in=null;
        Writer out=null;
        try{
            in = new FileReader("C:\\kasawka.txt");
            out = new FileWriter("C:\\kasawkaotvet.txt",true);
            int oneByte;
            while((oneByte=in.read())!=-1){
                if ((char)oneByte=='а'){
                //out.write((char)oneByte); //// запись с уничтожением ранее
                // существующих данных
                out.append((char)oneByte); //// запись с добавлением данных в конец
            }}
        }catch(IOException e){
            System.out.println("FATAL ERROR!");
        }
        finally{
            in.close();
            out.close();
        }
    }
}
