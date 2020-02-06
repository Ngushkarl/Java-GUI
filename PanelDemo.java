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
public class PanelDemo extends JFrame implements ActionListener{
    
   JPanel redPanel;
   JPanel bluePanel;
   JPanel whitePanel;
   JPanel biggerPanel;
   JButton redButton,blueButton,whiteButton;
    public PanelDemo(){
        super("PANEL DEMONSTARTION");
        setLayout(new BorderLayout());
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
         biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,3));
        
        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);
        
        bluePanel= new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);
        
        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);
        
        add(biggerPanel, BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());
        
        redButton = new JButton("RED");
        redButton.setBackground(Color.red);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);
        
         blueButton = new JButton("BLUE");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);
        
         whiteButton = new JButton("WHITE");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanel.add(whiteButton);
        
        add(buttonPanel, BorderLayout.SOUTH);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
       String a = e.getActionCommand();
       
       if(a.equals("RED")){
           redButton.setText("CYAN");
           redButton.setBackground(Color.CYAN);
          redPanel.setBackground(Color.CYAN);
            //redPanel.setActionCommand("Next item");
          }
       else if(a.equals("CYAN")){
           redButton.setText("RED");
           redButton.setBackground(Color.red);
           redPanel.setBackground(Color.RED);
       }
       
       else if(a.equals("BLUE")){
            blueButton.setText("BLACK");
            blueButton.setBackground(Color.BLACK);
           bluePanel.setBackground(Color.BLACK);
        }
        else if(a.equals("BLACK")){
            blueButton.setText("BLUE");
            blueButton.setBackground(Color.BLUE);
            bluePanel.setBackground(Color.BLUE);
        }
        else if(a.equals("WHITE")){
            whiteButton.setText("GREEN");
            whiteButton.setBackground(Color.GREEN);
           whitePanel.setBackground(Color.GREEN);
        }
       else if(a.equals("GREEN")){
                   whiteButton.setText("WHITE");
                  whiteButton.setBackground(Color.WHITE);
                 
                  whitePanel.setBackground(Color.WHITE);
       } 
        else{
           System.out.println("Unexpected Error");
           
        }    
         
                
        
        
    }
    
    
    
   public static void main(String[]args){
       PanelDemo p= new PanelDemo(); 
   } 
}
