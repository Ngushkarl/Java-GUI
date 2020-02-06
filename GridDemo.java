/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem2;

import javax.swing.*;
import java.awt.*;

public class GridDemo extends JFrame {
    
    JButton btn1, btn2,btn3, btn4,btn5;
    public GridDemo(){
        super("GridLayoutmanager");
         setLayout(new GridLayout(2,3));
         setSize(500,200);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         btn1= new JButton("Button 1");
         btn2= new JButton("Button 2");
         btn3= new JButton("Button 3");
         btn4= new JButton("Button 4");
         btn5= new JButton("Button 5");
          
         add(btn1); add(btn3); add(btn2); add(btn4); add(btn5);
    }
    public static void main(String[]args){
        GridDemo g= new GridDemo();
    }
    
}
