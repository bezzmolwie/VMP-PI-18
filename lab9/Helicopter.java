package lab9;

import java.util.Scanner;

public class Helicopter extends Aircraft {
    private String model,gosnum;
    private int numPeople;

    public Helicopter(){
        super();
        model="";
        numPeople=0;
    }
    public Helicopter(String firma, int speed,String gosn, String name, int n){
        super(firma,speed,gosn);
        model=name;
        numPeople=n;
        gosnum=gosn;

    }
    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setNumPeople(int n){
        numPeople=n;
    }
    public int getNumPeople(){
        return numPeople;
    }
    public void setGosnum(String gosnumber){ gosnum=gosnumber;}
    public String getGosnum(){ return gosnum; }
    public void setAllInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фирму-производитель вертолета => ");
        String nazv=sc.nextLine();
        setFirm(nazv);
        System.out.println("Введите максимальную скорость вертолета => ");
        int s=sc.nextInt();
        sc.nextLine();
        setMaxSpeed(s);
        System.out.println("Введите модель вертолета => ");
        nazv=sc.nextLine();
        setModel(nazv);
        System.out.print("Введите гос номер самолета => ");
        String gosnumber=sc.nextLine();
        setGosnomer(gosnumber);
        sc.nextLine();
        System.out.println("Введите вместительность людей в вертолете =>");
        s=sc.nextInt();
        sc.nextLine();
        setNumPeople(s);
    }
    public String toString(){
        return "\n\tВертолет"+"\n\t"+"Фирма: "+getFirm()+"\n\t"+"Максимальная скорость: "
                +getMaxSpeed()+ "\n\t"+"Модель: "+ model+"\n\t"+"Гос номер: "+getGosnomer()+"\n\t"+"Вместительность: "+getNumPeople()+"\n";
    }
}
