/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem2;

import javax.swing.*;
import java.awt.*;
public class Colour extends JFrame {
    
    JButton btn1,btn2,btn3;
    public Colour(){
        super("colour demo");
        setVisible(true);
        setSize(900,900);
      setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn1= new JButton("save");
        btn2= new JButton("ve");
        btn3= new JButton("sa");
       btn1.setBounds(200,50,200,30);
        btn2.setBounds(200,100,200,30);
     btn3.setBounds(200,150,200,30);
        getContentPane().setBackground(Color.CYAN);
       add(btn1);
   //  add(btn2);
    // add(btn3);
    }
    public static void main(String[]args){
        Colour c = new Colour();
    }
}
