package lab6;

import java.io.*;

public class lab6 {
    public static void main(String[] args)throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in = new BufferedReader(new FileReader("C:\\kasawka.txt"));
            out = new BufferedWriter(new FileWriter("C:\\kasawkaotvet1.txt"));
            int lineCount=1; //s4et4ik strok
            String s ;
            while ((s=in.readLine())!=null) {
                String[] words = s.split(" ");
                for (String word : words) {
                    if (word.charAt(0)==word.charAt(word.length()-1)&&(word.length()>1)){
                        System.out.println("Строка №"+lineCount+": *"+word+"* Кол-во слов в строке "+ words.length);}
                    lineCount++;
                }
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
    public static StringBuilder getLine(String ... words){
        StringBuilder sb = new StringBuilder();
        for (String word : words)
        {
            if (word.charAt(0) == word.charAt(word.length()-1)){
                sb.append(word).append(" ");
            }
        }
        return sb;
    }
}
