package lab6;

import java.io.*;

public class fourth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try{
            //sozdanie potokov
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\kasawka.txt"),"cp1251"));
            PrintWriter out1 = new PrintWriter("C:\\kasawkaotvet.txt","cp1251");
            //perenos infi iz odnogo fayla v drugoi
            int lineCount=0;
            String s;
            while ((s=br.readLine())!=null){
                lineCount++;
                out1.println(lineCount+": "+s);
            }
        }catch (IOException e ){
            System.out.println("OSHIBKA!");
        }finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
