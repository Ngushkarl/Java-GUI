
package javasem2;
import javax.swing.*;
import java.awt.*;
public class Numbers extends JFrame
{
   JButton btn1;
   JLabel l1;
    //Container contentPane;
    public Numbers(){
        setVisible(true);
        setSize(900,900);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JMenu menu= new JMenu("Numbers:");
        
        JMenu real = new JMenu("Real Numbers:");
        menu.add(real);
       JMenuItem n2= new JMenuItem("2.");
        real.add(n2);
         JMenuItem n3= new JMenuItem("3.");
        real.add(n3);
         JMenuItem n4= new JMenuItem("4.");
        real.add(n4);
         JMenuItem n5= new JMenuItem("5.");
        real.add(n5);
        
         l1 = new JLabel();
    l1.setBounds(20,30,50,50); 
    add(l1);
        
        btn1= new JButton(new ImageIcon("cat.gif"));
        btn1.setBounds(50,50,50,50);
        add(btn1);
        
        
        
        
        JMenu roman = new JMenu("Roman Numbers:");
        menu.add(roman);
         JMenuItem r1= new JMenuItem("i.");
        roman.add(r1);
        JMenuItem r2= new JMenuItem("ii."); 
        roman.add(r2);
        JMenuItem r3= new JMenuItem("iii.");
        roman.add(r3);
        JMenuItem r4= new JMenuItem("iv.");
        roman.add(r4);
        JMenuItem r5= new JMenuItem("v.");
        roman.add(r5);
        
        
        JMenu small = new JMenu("Small Letters:");
        menu.add(small);
        JMenu s1= new JMenu("a.");
        small.add(s1);
        JMenu s2= new JMenu("b.");
        small.add(s2);
        JMenuItem s3= new JMenuItem("c.");
        small.add(s3);
        JMenuItem s4= new JMenuItem("d.");
        small.add(s4);
        JMenuItem s5= new JMenuItem("e.");
        s5.setBackground(Color.BLUE);
        small.add(s5);
        
        JMenu s= new JMenu("hhh");
        s.setBackground(Color.CYAN);
        
        
        
        JMenuBar bar1 = new JMenuBar();
        bar1.add(menu);
        bar1.add(s);
        setJMenuBar(bar1);
        
        
        //contentPane = getContentPane();
       bar1.setBackground(Color.CYAN);
 
        
        
    }
    public static void main(String[]args){
      Numbers n= new Numbers();
    }
    
}
