package lab14;
import java.awt.*;
import java.awt.event.*;
public class lab14 implements ActionListener {
    Frame f=new Frame();
    Label l1=new Label("Первое число");
    Label l2=new Label("Второе число");
    Label l3=new Label("Сумма чисел");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    Button b1=new Button("Посчитать");
    Button b2=new Button("Очистить");

    lab14(){
        l1.setBounds(100,100,100,20);
        l2.setBounds(100,140,100,20);
        l3.setBounds(100,180,100,20);
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);
        b1.setBounds(130,230,100,20);
        b2.setBounds(130,260,100,20);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setTitle("mini-calculator");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,350);
        f.setLocation(500, 200);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
    public void actionPerformed(ActionEvent e) {

        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());

        if(e.getSource()==b1){
            t3.setText(String.valueOf(n1+n2));
        }
        if(e.getSource()==b2){
            t2.setText(String.valueOf(""));
            t1.setText(String.valueOf(""));
            t3.setText(String.valueOf(""));
        }
    }
    public static void main(String[] args){
        new lab14();
    }
}
