package lab6;

import java.io.*;

public class third {
    public static void readAllByByte(Reader in)throws IOException{
        while (true){
            int oneByte=in.read(); // 4itaet 1 byte
            if(oneByte!=-1){//priznak konca fayla
                System.out.println((char)oneByte);
        }else {
                System.out.println("\n"+"конец");
                break;
            }
    }
}

    public static void main(String[] args) {
        try{
            // s potokom svyazan fayl
            InputStream inFile = new FileInputStream("C:\\kasawka.txt");
            Reader rFile=new InputStreamReader(inFile,"cp1251");
            readAllByByte(rFile);
            System.out.println("\n\n\n");
            inFile.close();
            rFile.close();
        }catch (IOException e){
            System.out.println("FATALL ERORR"+e);
        }
    }
    }
