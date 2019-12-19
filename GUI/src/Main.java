import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        JFrame abc = new JFrame("AWT Counter");
        abc.setSize(400,300);
        JButton b1 = new JButton("Count");
        JTextArea t1 = new JTextArea(" dfgdfgfgfg  ");
        t1.setSize(50,50);
        abc.getContentPane().add(b1);
        abc.getContentPane().add(t1);






        abc.setVisible(true);
        b1.setVisible(true);
        t1.setVisible(true);

    }
}
