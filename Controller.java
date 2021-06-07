package Controller;

import View.View;
import javax.swing.*;
import java.awt.*;

public class Controller extends JFrame {

    public Controller(){
        JPanel pan = new JPanel(new GridLayout(3, 3));
        this.setTitle("Le jeu du Ticktacktoe");
        this.setSize(450,450);
        this.setResizable(false);
        for(int x=0;x<3;x++){
            View[][] bouton = new View[3][3];
            for(int j = 0; j<3; j++)
                pan.add(bouton[x][j]= new View(x,j));
        }
        pan.setBackground(Color.WHITE);
        this.add(pan,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
