import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* <Applet code="pro1" width="500" height="500"></Applet> */
public class pro1 extends JApplet implements ActionListener{
    Container con;
    JLabel lbl1;
    JTextField txt1;
    JButton prime, factorial, reverse;

    // @Override
    public void init() {
        con = getContentPane();
        con.setLayout(new GridLayout(3,2));

        lbl1 = new JLabel("Enter No.");
        con.add(lbl1);
        txt1 = new JTextField(10);
        con.add(txt1);

        prime = new JButton("Prime");
        prime.addActionListener(this);
        con.add(prime);

        factorial = new JButton("factorial");
        factorial.addActionListener(this);
        con.add(factorial);

        reverse = new JButton("reverse");
        reverse.addActionListener(this);
        con.add(reverse);
    }

    public void actionPerformed(ActionEvent ae){
        int a = Integer.parseInt( txt1.getText());
        if(ae.getSource() == prime){
                int i;
                    for(i = 2; i <= a; i++){
                        if(a%i == 0){
                            break;
                        }
                        
                    }
                    if(i == a){
                        JOptionPane.showMessageDialog(this, a+" Prime number");
                    }else{
                        JOptionPane.showMessageDialog(this, a+" Not Prime number");
                        
                    }
                }
             if(ae.getSource() == factorial){
                 int b=1;
                    for(int c = a; c>=1; c-- ){
                        b = b*c;

                    } 
                    
                    JOptionPane.showMessageDialog(this, b+" Factorial number");
            }
    }
}