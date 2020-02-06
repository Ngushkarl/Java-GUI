

package javasem2;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SimpleCalculator extends JFrame implements ActionListener {
 JTextField tf1,tf2,tf3; 
 JButton btn1,btn2,btn3,btn4,btn5,btn6; 
 double result= 0.0;
 Container contentPane;
    
  
    

 
   SimpleCalculator(){ 
       super("Simple Calculator");
      setSize(600,600); 
        setLayout(null); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane =getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);
       
 
  
        tf1=new JTextField("Enter First Number "); 
        tf1.setBounds(40,50,150,50); 
  
        tf2=new JTextField("Enter Second Number then"); 
        tf2.setBounds(230,50,150,50);
       
        tf3=new JTextField("Select Operation Then  = "); 
        tf3.setBounds(80,140,200,50);
        tf3.setEditable(false);
           
    
    
        btn1=new JButton("+"); 
        btn1.addActionListener(this);  
        btn1.setBounds(70,200,50,50); 
  
        btn2=new JButton("-"); 
        btn2.addActionListener(this); 
        btn2.setBounds(150,200,50,50);
        
         btn3=new JButton("*"); 
        btn3.addActionListener(this); 
        btn3.setBounds(220,200,50,50);
        
          btn4=new JButton("/");
      btn4.addActionListener(this); 
        btn4.setBounds(70,270,50,50);
        
         btn5=new JButton("RESET");
      btn5.addActionListener(this); 
        btn5.setBounds(130,270,80,50);
        
         btn6=new JButton("=");
      btn6.addActionListener(this); 
        btn6.setBounds(220,270,50,50);
        
        
     
  
  
        add(tf1);add(tf2);add(tf3);
        add(btn1);add(btn2); add(btn3);add(btn4);add(btn5);add(btn6);
  
  
    }        
    public void actionPerformed(ActionEvent e) { 
        String s=e.getActionCommand();//record the string command
      
     
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
         //  result= stringToDouble(tf1.getText()) + stringToDouble(tf2.getText());
         contentPane.setBackground(Color.CYAN);
         btn1.setText("ON");
        }
        if(a.equals("ON")){
         //  result= stringToDouble(tf1.getText()) + stringToDouble(tf2.getText());
         contentPane.setBackground(Color.RED);
         btn1.setText("+");
        }
        else if(a.equals("-")){
             result= stringToDouble(tf1.getText()) - stringToDouble(tf2.getText());
           
            
        }
         else if(a.equals("*")){
             result= stringToDouble(tf1.getText()) * stringToDouble(tf2.getText());
          
            
        }
          else if(a.equals("/")){
             result= stringToDouble(tf1.getText()) / stringToDouble(tf2.getText());
           
            
        }
         else if(a.equals("=")){
            
            tf3.setText(Double.toString(result));
            
        }
        else if (a.equals("RESET")){
             tf1.setText("Enter First Number ");
            tf2.setText("Enter First Second then ");
              tf3.setText("Select Operation Then  =");
            
        }
        
           
    }    
    public static double stringToDouble(String stringobject)
    {// change string to double method
        return Double.parseDouble(stringobject.trim());
        
    }
}
   

