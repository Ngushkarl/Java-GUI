
package javasem2;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends JFrame implements ActionListener {
    
    JPanel panel1,btnpanel2;
    private static final int digits = 50;
    private JTextField input;
    private double result= 0.0;
    JButton addB,sub, reset;
    
    public Calculator(){
        super("simple calculator");
        setSize(900,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        
        panel1= new JPanel();
        panel1.setLayout(new FlowLayout());
        input = new JTextField("Enter Number Here",digits);
        input.setBackground(Color.WHITE);
        panel1.add(input);
        add(panel1,BorderLayout.NORTH);
        
        btnpanel2= new JPanel();
        btnpanel2.setBackground(Color.BLUE);
        btnpanel2.setLayout(new FlowLayout());
        
        addB= new JButton("+");
        addB.addActionListener(this);
        btnpanel2.add(addB);
        sub= new JButton("-");
        sub.addActionListener(this);
        btnpanel2.add(sub);
        reset =new JButton("RESET");
        reset.addActionListener(this);
        btnpanel2.add(reset);
        add(btnpanel2,BorderLayout.CENTER);
        
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            assumingCorrectNumberFormats(e);
        }
        
        catch(NumberFormatException e2)
        {
            input.setText("Error: Reenter Number.");
            
        }}
    public void assumingCorrectNumberFormats(ActionEvent e){
        String a= e.getActionCommand();
        
        if(a.equals("+")){
            result= result+ stringToDouble(input.getText());
            input.setText(Double.toString(result));
        }
        else if(a.equals("-")){
             result= result+ stringToDouble(input.getText());
            input.setText(Double.toString(result));
            
        }
        else if (a.equals("RESET")){
            result= 0.0;
            input.setText("0.0");
        }
        else
            input.setText("Unexpected Error");
    }    
    public static double stringToDouble(String stringobj)
    {// change string to double method
        return Double.parseDouble(stringobj.trim());
        
    }
    public static void main(String[]args){
        new Calculator();
    }
    
    
}
