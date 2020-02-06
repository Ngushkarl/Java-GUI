/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MenuDemo extends JFrame implements ActionListener
{

   JPanel redPanel;
   JPanel whitePanel;
   JPanel bluePanel;
   
    
    
    JMenuItem red;
    JMenuItem white;
    JMenuItem blue;
    public MenuDemo()
    {
    super("MENU DEMONSTRATION EXAMPLE");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(700,700);
    setLayout(new GridLayout(1,3));
    
    
    redPanel = new JPanel();
   redPanel.setBackground(Color.LIGHT_GRAY);
    add(redPanel);
    
    whitePanel = new JPanel();
   whitePanel.setBackground(Color.LIGHT_GRAY);
    add(whitePanel);
    
    bluePanel= new JPanel();
    bluePanel.setBackground(Color.LIGHT_GRAY);
    add(bluePanel);
    
    
    
    JMenu Menu = new JMenu("Color choice");
    
    red = new JMenuItem("Red Choice");
    red.setBackground(Color.red);
   
    red.addActionListener(this);
    Menu.add(red);
    
     white = new JMenuItem("White Choice");
     white.setBackground(Color.WHITE);
    white.addActionListener(this);
    Menu.add(white);
    
    blue = new JMenuItem("Blue Choice");
    blue.setBackground(Color.BLUE);
    blue.addActionListener(this);
    Menu.add(blue);
    
    JMenuBar b = new JMenuBar();
    b.add(Menu);
    setJMenuBar(b);
            
    
    
    
   
    }
    
    public void actionPerformed(ActionEvent e)
            
    {
        String a = e.getActionCommand();
        
        if (a.equals("Red Choice")){
              red.setText("Cyan Choice");
              red.setBackground(Color.CYAN);
            redPanel.setBackground(Color.CYAN);
            
         
        }
       else if(a.equals("Cyan Choice")){
           red.setText("Red Choice");
           red.setBackground(Color.red);
           redPanel.setBackground(Color.red);
           
           
        }
        else if(a.equals("White Choice")){
            white.setText("Black Choice");
            white.setBackground(Color.BLACK);
            whitePanel.setBackground(Color.BLACK);
            
            
        }
         
        else if(a.equals("Black Choice")){
           white.setText("White Choice");
           white.setBackground(Color.WHITE);
           whitePanel.setBackground(Color.WHITE);
          
        }
       
        else if(a.equals("Blue Choice")){
            blue.setText("Green Choice");
            blue.setBackground(Color.GREEN);
            bluePanel.setBackground(Color.GREEN);
            
        }
         
        else if(a.equals("Green Choice")){
            blue.setText("Blue Choice");
            blue.setBackground(Color.BLUE);
            bluePanel.setBackground(Color.BLUE);
            setTitle("VERY GOOD");
          
        }
       
            
        
        
    }
    public static void main(String[]args)
    {
        MenuDemo d= new MenuDemo();
        } 
}
