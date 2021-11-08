package tictactoe;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import javax.swing.JOptionPane;
import static  javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class BaseWindow extends JFrame {

    public BaseWindow(){
        setTitle("Tic-Tac-Toe");
        setSize(400,500);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new WindowAdapter(){
        
            @Override 
            public void windowClosing(WindowEvent e){
        showExitConfirmation();
        }
        
        });
        URL url= Window.class.getResource("icon.png");
        setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        
        
        
}
     
    
    private void showExitConfirmation(){
    
        int n=JOptionPane.showConfirmDialog(this, "Do want to quit?", "Really)",JOptionPane.YES_NO_OPTION);
        if (n==JOptionPane.YES_OPTION){
        doUponExit();}
        
    }
    protected void doUponExit(){
    this.dispose();}
}
