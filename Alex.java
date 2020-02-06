
package javasem2;
import javax.swing.*;
import java.awt.*;

public class Alex extends JFrame
{
    JPanel bigPanel;
    JLabel image;
    JButton btn1;
   public Alex(){
       super("JPanel demo");
       setSize(900,900);
       setVisible(true);
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
    ImageIcon n = new ImageIcon("catgif"));
    image.setBounds(20,30,50,50); 
    bigPanel.add(image);
    btn1 = new JButton(new ImageIcon("cat.gif"));
    btn1.setBounds(20,30,50,50); 
    bigPanel.add(btn1);
       
       add(bigPanel);
       
   }
    
    
    public static void main(String[]args){
        new Alex();
    }
}
