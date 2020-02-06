
package javasem2;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

public class SwingCalculator extends JFrame implements ActionListener{ 
    JTextField tf1,tf2,tf3; 
    JButton btn1,btn2,btn3,btn4; 
    //double result=0.0;
    Container contentPane;
  
    

 
   SwingCalculator(){ 
       
        setSize(600,600); 
        setLayout(null); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        contentPane =getContentPane();
        contentPane.setBackground(Color.BLUE);
       
 
  
        tf1=new JTextField(); 
        tf1.setBounds(50,50,150,20); 
  
        tf2=new JTextField(); 
        tf2.setBounds(50,100,150,20);
  
        tf3=new JTextField(); 
        tf3.setBounds(50,150,150,20);
          tf3.setEditable(false);  
    
    
        btn1=new JButton("+"); 
        btn1.addActionListener(this);  
        btn1.setBounds(20,200,50,50); 
  
        btn2=new JButton("-"); 
        btn2.addActionListener(this); 
        btn2.setBounds(80,200,50,50);
        
         btn3=new JButton("RESET"); 
        btn3.addActionListener(this); 
        btn3.setBounds(150,200,80,50);
        
        btn4=new JButton("="); 
        btn4.addActionListener(this); 
        btn4.setBounds(270,200,50,50);
        
        
        
     
  
  
        add(tf1);add(tf2);add(tf3);
        add(btn1);add(btn2); add(btn3);add(btn4);
  
  
    }  
  /* switch(operation){
             case "+";
                 c=a+b;
                 break;
                 
                
            }*/
    public void actionPerformed(ActionEvent e) { 
        String s=e.getActionCommand();
        String s1=tf1.getText(); 
        String s2=tf2.getText(); 
       
        int a=Integer.parseInt(s1); 
        int b=Integer.parseInt(s2); 
        int c=0;
        int d=0;
         
        if(e.getSource()==btn4){ 
           
            c=a+b;
             String result=String.valueOf(c); 
         tf3.setText(result);
             
             
        }else if(e.getSource()==btn4){ 
            
            c=a-b;
             String result=String.valueOf(d); 
         tf3.setText(result);
            
        } 
        
        else if (s.equals("RESET")){
            
          tf1.setText("");
            tf2.setText("");
              tf3.setText("");
        }
        
        
    } 
public static void main(String[] args) { 
    new SwingCalculator(); 
} }