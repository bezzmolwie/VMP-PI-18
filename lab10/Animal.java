package lab10;

abstract class Animal {
    protected int _dlina;
    protected double _visota;

    abstract void run(int dlina);
    abstract void jump(double visota);

    static void showResult(Object obj, boolean result) {
        System.out.println(obj.getClass().getName() + " : " + result);
    }
}

class Cat extends Animal {

    void run(int dlina) {
        boolean result = dlina <= 200;
        if (result) _dlina = dlina;
        showResult(this,result);
    }

    void jump(double visota) {
        boolean result = visota <= 2;
        if (result) _visota = visota;
        showResult(this,result);
    }

}

class Dog extends Animal {
    private int _dlinaSwim;
    private int maxDlina;

    Dog() {
        maxDlina = Math.random() > 0.5 ?  400 : 600;
    }

    int getMaxDlina() {
        return maxDlina;
    }

    void swim(int dlina) {
        boolean result = dlina <= 10;
        if (result) _dlinaSwim = dlina;
        showResult(this,result);
    }
    void run(int dlina) {
        boolean result = dlina <= maxDlina;
        if (result) _dlina = dlina;
        showResult(this,result);
    }
    void jump(double visota) {
        boolean result = visota <= 0.5;
        if (result) _visota = visota;
        showResult(this,result);
    }
}

