/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author kamaal
 */
public class Guiexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myframe = new JFrame("my gui application");

        JButton okButton = new JButton();
        okButton.setText("okay");
        okButton.setToolTipText("this is the okay bitton");
        okButton.setSize(100, 150);

        JButton Button2 = new JButton("cancel");
        Button2.setToolTipText("this is the button2");
        Button2.setSize(100, 110);

        myframe.add(Button2);
        myframe.add(okButton);

        myframe.setSize(600, 400);
        myframe.setLocationRelativeTo(null);
        myframe.setLayout(new GridLayout(2, 5));
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }

}
