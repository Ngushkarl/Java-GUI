
package javasem2;




import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Main {
public static void main(String[] args) {
    
    SwingUtilities.invokeLater(new Runnable(){public void run(){// these is to remove run time errors 
                                                                    //for one to be able multiple threads
        new SimpleCalculator();
     
    }
    });
}
    }