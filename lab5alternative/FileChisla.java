package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileChisla {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("chisla");
        Scanner sc = new Scanner(file);
        String b = sc.nextLine();
        String [] massivstrok = b.split(" ");
        double[]numbers = new double[4];
        int i=0;
        for (String chislo : massivstrok){
            if (Double.parseDouble(chislo)>0){
            numbers[i++]= Double.parseDouble(chislo);
        }}
        double max = 0;
        for(int j=0;j<numbers.length;j++){
            if (numbers[j]>max){
                max = numbers[j];
            }
        }
        File file1 = new File ("chislaOtvet");
        PrintWriter pw=new PrintWriter(file1);
        pw.println(Arrays.toString((numbers))+"Максимальное число => "+max);
        pw.close();
        sc.close();
        System.out.println("Программа выполнена!");
    }
}
