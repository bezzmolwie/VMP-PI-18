package laba;
import java.sql.SQLOutput;
import java.util.Scanner;
class Chelovek{
    String fam,im,pol;
    int rost,kol;
}
public class People {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество человек:");
        int kol = sc.nextInt();
        sc.nextLine();//очистка буфера
        Chelovek[] chel = new Chelovek[kol];//получена ссылка на массив человек
        System.out.println("Введите информацию о человеке:");
        for (int i = 0; i < chel.length; i++) {//Ввод данных о человеке
            chel[i] = new Chelovek();
            System.out.print("Введите фамилию " + (i + 1) + " человека:");
            chel[i].fam = sc.nextLine();
            System.out.print("Введите имя " + (i + 1) + " человека:");
            chel[i].im = sc.nextLine();
            System.out.print("Введите пол " + (i + 1) + " человека(m/f):");
            chel[i].pol = sc.nextLine();
            System.out.print("Введите рост " + (i + 1) + " человека:");
            chel[i].rost = sc.nextInt();
            sc.nextLine();
        }
        //Средний рост мужчин и средний рост женщин
        int kolm = 0;
        int kolf = 0;
        int sum_rost = 0;
        int sum_rostf = 0;
        for (int i = 0; i < chel.length; i++) {
            if (chel[i].pol.equals("m")) {
                kolm++;
                sum_rost = sum_rost + chel[i].rost;
            }
        }
        for (int j = 0; j < chel.length; j++) {
            if (chel[j].pol.equals("f")) {
                kolf++;
                sum_rostf = sum_rostf + chel[j].rost;
            }
        }
        if (kolm > 0) {
            System.out.println("Средний рост мужчин=" + sum_rost / kolm + "см");
        }
        if (kolf > 0) {
            System.out.println("Средний рост женщин=" + sum_rostf / kolf + "см");
        }
        //Самый высокий мужчина
        int nommax = 0; // номер элемента для человека с маx ростом(нач знач)
        int max = chel[nommax].rost; // мах рост(нач знач)
        for (int i = 0; i < chel.length; i++) {
            if ((chel[i].pol.equals("m")) & (chel[i].rost > max)) {
                max = chel[i].rost;
                nommax = i;
            }
        }
        System.out.println("Самый высокий мужчина - " + chel[nommax].im + " "+ chel[nommax].fam +" "+ chel[nommax].rost+" см");
        //Сортировка по возрастанию роста
        for (int i=0;i<chel.length-1;i++)
            for (int j=0;j<chel.length-1-i;j++)
                if (chel[j].rost>chel[j+1].rost){
                    Chelovek rab=chel[j]; // rab-рабочая переменная для перестановки
                    chel[j]=chel[j+1];
                    chel[j+1]=rab;
                }
        System.out.println("\nОтсортированный список по росту:");
        for(int i=0;i<chel.length;i++){
            System.out.println(""+chel[i].im+" "+chel[i].fam+" "+chel[i].rost+" см");
        }
        //Поиск по фамилии
        System.out.println("Введите фамилию искомого человека:");
        String fam=sc.nextLine();
        int nom=-1; // -1 - человек с искомой фамилией отсутсвует
        for (int i=0; i<chel.length;i++)
            if (fam.equalsIgnoreCase(chel[i].fam)) nom=i;
        if (nom!=-1){
            System.out.println("Такая фамилия имеется в списке!");
            System.out.println(chel[nom].fam+" "+chel[nom].im+" "+chel[nom].rost+" cм");
            System.out.println("Хотите ли вы изменить информацию y/n");
            String answer = sc.nextLine();
            if(answer.equals("y")){
                System.out.println("Какое из полей хотите поменять");
                System.out.println("1-Фамилия, 2-Имя, 3-пол, 4-рост");
                int indr =sc.nextInt();
                sc.nextLine();
                switch (indr){
                    case 1:{
                        System.out.println("Введите новую фамилию=>");
                        String newname = sc.nextLine();
                        chel[nom].fam =newname;
                        break;
                    }
                    case 2:{
                        System.out.println("Введите новое имя=>");
                        String newname1 =sc.nextLine();
                        chel[nom].im = newname1;
                        break;
                    }
                    case 3:{
                        System.out.println("Введите новый пол=>");
                        String newname2= sc.nextLine();
                        chel[nom].pol=newname2;
                        break;
                    }
                    case 4:{
                        System.out.println("Введите новый рост=>");
                        int newname3= sc.nextInt();
                        chel[nom].rost = newname3;
                        break;
                    }
                    default:
                        System.out.println("Неправильный индекс");
                }
                System.out.println("Исправленная информация " + chel[nom].fam+" "+chel[nom].im+" "+chel[nom].rost+" cм");
            }
        }
        else{
            System.out.println("Такой человек не найден!");
        }
    }
}