
package tictactoe;

//import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends BaseWindow{
    private List <Window> gameWindows = new ArrayList<>();
    
    public MainWindow(){
    JButton small= new JButton();
    small.setText("Basic");
    small.addActionListener(getActionListener(3));
    
    JButton medium= new JButton();
    medium.setText("intermediate");
    medium.addActionListener(getActionListener(4));
    

JButton Large= new JButton();
    Large.setText("Advance");
    Large.addActionListener(getActionListener(5));
    
    getContentPane().setLayout(
    new BoxLayout (getContentPane(), BoxLayout.Y_AXIS));
    
    getContentPane().add(small);
    getContentPane().add(medium);
    getContentPane().add(Large);
    
    }
    
    private ActionListener getActionListener(final int size){
    return new ActionListener(){
    @Override
    public void actionPerformed (ActionEvent e){
    Window window = new Window(size , MainWindow.this); 
    window.setVisible(true);
    gameWindows.add(window);
    }
    
    };
    } 
     public List<Window> getWindowList() {
        return gameWindows;
    }
    
    @Override
    protected void doUponExit() {
        System.exit(0);
    }
    
}
