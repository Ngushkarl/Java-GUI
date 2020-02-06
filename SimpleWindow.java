/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow extends JFrame implements ActionListener {
    
    JFrame jf;
    JPanel jp;
    JTextArea ta1;
    JLabel l1,l2;
    
    JComboBox cbo1;
    JButton btn1,btn2,btn3;
    public SimpleWindow(){
        setSize(500,400);
       setLayout(null);
        setTitle("SIMPLE WINDOW");
        setVisible(true);
        jf= new JFrame();
        jp= new JPanel();
        ta1=new JTextArea();
        
        l1= new JLabel("SIMPLE WINDOW");
        l2 = new JLabel();
        l2.setBounds(300,300,50,50);
        //image.setSize(50, 50);
        add(l2);
        String yr[]= {"one","two"};
        cbo1= new JComboBox(yr);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn1= new JButton("CLICK ME");
        btn1.addActionListener(this);
        btn2= new JButton("SAVE");
        btn3= new JButton("EXIT");
        
        l1.setBounds(300,10,300,30);
        btn1.setBounds(300, 50, 100, 30);
        btn2.setBounds(100, 200, 100, 30);
        btn3.setBounds(300, 200, 100, 30);
        cbo1.setBounds(300,100,100,30);
         ta1.setBounds(300,150,200,30);
         
         btn1.setBackground(Color.BLUE);
         btn2.setBackground(Color.RED);
         btn3.setBackground(Color.YELLOW);
             cbo1.setBackground(Color.blue);
                 ta1.setBackground(Color.YELLOW);
                    
        
        add(btn1);add(btn2);add(btn3);
        add(cbo1);
        add(ta1);
        add(l1);
        getContentPane().setBackground(Color.CYAN);
        //jp.setBackground(Color.RED);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String a= e.getActionCommand();
        
        if(a.equals("CLICK ME"))
            btn1.setText("ttt");
                  
    else
            //System.out.println("Something Went Wrong");
        getContentPane().setBackground(Color.red);
        JOptionPane.showMessageDialog(jf,"gg");
        JOptionPane.showMessageDialog(null,"Enter Text : \n gg\n yy");
     // MessageDialog.setBackground(Color.YELLOW);
     //  String input;
       
       String input=JOptionPane.showInputDialog(null,"Enter text:");
       
       JOptionPane.showMessageDialog(null,"GoodBye");
       System.exit(0);
            }
   
    
    public static void main(String[]args){
        SimpleWindow s = new SimpleWindow();
    }
}
