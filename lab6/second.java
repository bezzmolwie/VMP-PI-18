package lab6;

import java.io.*;

public class second {
    public static void main(String[] args)throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in = new BufferedReader(new FileReader("C:\\kasawka.txt"),1024);
            out = new BufferedWriter(new FileWriter("C:\\kasawkaotvet.txt"));
            int lineCount=0; //s4et4ik strok

            String s ;
            while ((s=in.readLine())!=null){
                lineCount++;
                System.out.println(lineCount+": "+s);
                out.write(s);
                out.newLine();
            }
        }catch (IOException e ){
            System.out.println("FATAL ERROR!");
        }
        finally{
            in.close();
            out.flush();
            out.close();
        }
    }
}
