package lab9;

import java.util.Scanner;

public class Plane extends  Aircraft {
    private String model,gosnum;
    private int numPeople;
    private int kg;

    public Plane(){
        super();
        model="";
        numPeople=0;
        kg=0;
    }
    public Plane(String firma,int speed,String name,String gosn,int n,int m){
        super(firma,speed,gosn);
        model=name;
        numPeople=n;
        kg=m;
        gosnum=gosn;
    }
    public void setModel1(String name2){
        model=name2;
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
    public void setKg(int m){
        kg=m;
    }
    public int getKg(){
        return kg;
    }
    public void setAllInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фирму-производитель самолета => ");
        String nazv=sc.nextLine(); //метод next() позволяет вводить строки, но без пробелов
        setFirm(nazv);
        System.out.print("Введите максимальную скорость самолета => ");
        int s=sc.nextInt();
        setMaxSpeed(s);
        System.out.print("Введите модель самолета => ");
        String model1=sc.nextLine();
        setModel1(model1);
        sc.nextLine();
        System.out.print("Введите гос номер самолета => ");
        String gosnumber=sc.nextLine();
        setGosnomer(gosnumber);
        System.out.print("Введите вместительность самолета =>");
        numPeople=sc.nextInt();
        System.out.print("Введите грузоподъемность самолета => (в кг)");
        kg=sc.nextInt();
        System.out.println();
    }
    public String toString(){
        return "\n\tCамолет"+"\n\t"+"Фирма: "+getFirm()+"\n\t"+"Максимальная скорость: "
                +getMaxSpeed()+ "\n\t"+"Модель: "+getModel()+"\n\t"+"Гос номер: "+getGosnomer()+"\n\t"+"Вместительность: "+numPeople+"\n\t"+"Грузоподъемность: "
                +kg+"\n";

    }
}
