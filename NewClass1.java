
package javasem2;
import java.awt.*;
import javax.swing.*;

public class NewClass1 extends JFrame {
    JLabel l1,l2,l3,l4,l5;
   Container contentPane;
   public  NewClass1(){
       setSize(900,900);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
       setLayout(new BorderLayout());
       
        contentPane  = getContentPane();
        contentPane.setBackground(Color.red);
        
        l1= new JLabel("NORTH JUSTIFIELD");
        add(l1, BorderLayout.NORTH);
        l2= new JLabel("SOUTH JUSTIFIELD");
        add(l2, BorderLayout.SOUTH);
        l3= new JLabel("CENTER JUSTIFIELD");
        add(l3, BorderLayout.CENTER);
        l4= new JLabel("EAST JUSTIFIELD");
        add(l4, BorderLayout.EAST);
        l5= new JLabel("WEST JUSTIFIELD");
        add(l5, BorderLayout.WEST);
       
       
   }
    
    public static void main(String[]args){
        NewClass1 n = new NewClass1();
    }
    
}
