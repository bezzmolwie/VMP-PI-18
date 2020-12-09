package lab11;

import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        Triangle treug = new Triangle(4,5,6);
        treug.showInfo();
        treug.showPerimetr();
        treug.showSquare();
        Rectangle pryamoug = new Rectangle (4,5);
        pryamoug.showInfo();
        pryamoug.showPerimetr();
        pryamoug.showSquare();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива => ");
        int k = sc.nextInt();
        Arrays mass = new Arrays(k);
        mass.setArray();
        mass.showArray();
        mass.massSort();
        mass.showArray();
    }
}
