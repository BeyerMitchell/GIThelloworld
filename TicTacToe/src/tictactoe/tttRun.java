package tictactoe;
import java.awt.*;
public class tttRun {

    public static void main(String[] args) {//Runs file and sets the frame size
        Color[] cols = {new Color(25,25,120),Color.darkGray};
        tttFrame f = new tttFrame();
        f.setBounds(50,50,537,450);
        f.getContentPane().setBackground(Color.darkGray);  
        f.setVisible(true);
       
    }
}
     