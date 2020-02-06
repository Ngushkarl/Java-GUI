/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem2;
import javax.swing.*;
import java.awt.*;



public class BorderDemo extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    Container contentPane;
    public BorderDemo(){
        setSize(900,900);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
         contentPane= getContentPane();
         contentPane.setBackground(Color.BLUE);
        
       l1= new JLabel("North label");
       add(l1, BorderLayout.NORTH);
       
       l2= new JLabel("south label");
       add(l2, BorderLayout.SOUTH);
       
       l3= new JLabel("East label");
       add(l3, BorderLayout.EAST);
       
       l4= new JLabel("WEST label");
       add(l4, BorderLayout.WEST);
       
       l5= new JLabel("Centered label");
       add(l5, BorderLayout.CENTER);
        
        
        
        
    }
    
    public static void main(String[]args){
        BorderDemo b = new BorderDemo();
    }
}
