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


public class Toggle extends JFrame implements ActionListener{
    JButton btn;
     Container contentPane;
    
    public Toggle(){
        setTitle("Toggle Colour");
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btn=new JButton("ON");
        btn.addActionListener(this);
       
        contentPane= getContentPane();
        contentPane.setBackground(Color.GRAY);
        
       add(btn);
    }
    public void actionPerformed(ActionEvent e){
        String a =e.getActionCommand();
        //String a is to record the action commands being passed
        
        if(a.equals("ON")){
            btn.setText("OFF");
        contentPane.setBackground(Color.WHITE);
        }
        else if(a.equals("OFF")){
            btn.setText("ON");
            contentPane.setBackground(Color.CYAN);
        }
        else 
            System.exit(0);
        
        
    }
    
    
    
   public static void main(String[]args){
       Toggle t = new Toggle();
   } 
}
 