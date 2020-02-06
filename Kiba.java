
package javasem2;
import javax.swing.JFrame;
import javax.swing.JTextField;


import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Kiba extends JFrame implements ActionListener {
  JTextField tf1,tf2,tf3; 
    JButton btn1,btn2,btn3,btn4; 
    double result= 0.0;
    double result1= 0.0;
  
    

 
   Kiba(){ 
        super("Simple Calculator");
        setSize(600,600); 
        setLayout(null); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
 
  
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
        btn4.setBounds(250,200,50,50);
        
        
        
        
     
  
  
        add(tf1);add(tf2);add(tf3);
        add(btn1);add(btn2); add(btn3);add(btn4);
  
  
    }        
    public void actionPerformed(ActionEvent e) { 
       // String s=e.getActionCommand();//record the string command
      
     
         try
        {
            assumingCorrectNumberFormats(e);
        }
        
        catch(NumberFormatException e2)
        {
            tf3.setText("");
            

            
        }}
    public void assumingCorrectNumberFormats(ActionEvent e){
        String a= e.getActionCommand();
        
          
        if(a.equals("+")){
           result= stringToDouble(tf1.getText());
        }
        else if(a.equals("-")){
             result= stringToDouble(tf1.getText());
        }
         else if(a.equals("=")){
           result= stringToDouble(tf1.getText()) - stringToDouble(tf2.getText());
            
                tf3.setText(Double.toString(result));
                
                  result= stringToDouble(tf1.getText()) + stringToDouble(tf2.getText());
            
                tf3.setText(Double.toString(result));
            
            
        }
         
        else if (a.equals("RESET")){
             tf1.setText("");
            tf2.setText("");
              tf3.setText("0.0");
            
        }
        
           
    }    
    public static double stringToDouble(String stringobject)
    {// change string to double method
        return Double.parseDouble(stringobject.trim());
       
    }
    
    public static void main(String[]args){
        Kiba k = new Kiba();
        
    }
    
}
