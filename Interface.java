
package javasem2;
import javax.swing.*;
import java.awt.*;


public class Interface extends JFrame{
 JPanel jp1,jp2,jp3;
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;
    public Interface(){
        super("Graphical user Interface(GUI)");
        setVisible(true);
        setSize(900,900);
        //setLayout(new BorderLayout());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jp1= new JPanel();
        jp1.setLayout(new GridLayout(1,2));
        //jp1.setBackground(Color.DARK_GRAY);
        
        add(jp1);
        
        jp2= new JPanel();
        jp2.setBackground(Color.CYAN);
       l1= new JLabel("Loan Amount:");
        l2= new JLabel("Interest Rate:");
        l3= new JLabel("Loan Period:");
        
        tf1= new JTextField();
        tf2= new JTextField();
        tf3= new JTextField();
        
        l1.setBounds(20,30,200,30);
        l2.setBounds(20,100,200,30);
        l3.setBounds(20,170,200,30);
        
        tf1.setBounds(20,50,200,30);
        tf2.setBounds(20,120,200,30);
        tf3.setBounds(20,190,200,30);
        
        
        jp2.add(l1);jp2.add(l2);jp2.add(l3);
        jp2.add(tf1);jp2.add(tf2);jp2.add(tf3);
        
        jp1.add(jp2);
        
        jp3= new JPanel();
        jp3.setBackground(Color.red);
        jp1.add(jp3);
        
        
        
        
    }
    public static void main(String[]args){
        Interface i = new Interface();
    }
}
