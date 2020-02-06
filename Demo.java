/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem2;

/**
 *
 * @author NgushcarlWAn
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Demo  extends JFrame implements ActionListener{
    JFrame jf;
   JButton btn;
   Container contentPane;
   public Demo(){
       super("Dialoge Box");
       setVisible(true);
       setSize(900,900);
       setLayout(new FlowLayout());
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       btn= new JButton("SAve");
       btn.addActionListener(this);
       add(btn);
       contentPane= getContentPane();
       contentPane.setBackground(Color.GREEN);
   
   }
 public void actionPerformed(ActionEvent e){
     String a = e.getActionCommand();
     
     if(a.equals("SAve")){
         JOptionPane.showMessageDialog(jf,"Connect TO Database ??");
         JOptionPane.showMessageDialog(null,"Enter Text: \n one \n two \n three");
         String Input= JOptionPane.showInputDialog("Enter Text:");
         JOptionPane.showMessageDialog(null,"COnnected SuccessFully");
         JOptionPane.showMessageDialog(null,"GOODBYE");
         System.exit(0);
     }
 }
     
       
     
   
      public static void main(String[]args){
          Demo d = new Demo();
           
       }
  
    
    
}
