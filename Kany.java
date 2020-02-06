
package javasem2;
import javax.swing.*;
import java.awt.*;

public class Kany extends JFrame
{
   JButton btn1; 
   JFrame jf;
    
public Kany(){
    
    super("kanyu 1");        
    setSize(900,900);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    jf = new JFrame();
    add(jf);
    
    btn1 = new JButton("ON");
    
    
    
    
    add(btn1);
    
}
public static void main(String[]args){
     new Kany();
    
}
}
