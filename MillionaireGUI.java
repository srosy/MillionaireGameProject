/*********************************
* Author: Spencer Rosenvall
* GUI for game play
**********************************/

import javax.swing.*;
import java.awt.Color;

public class MillionaireGUI{

public int moneyWon = 2000;//test int moneyWon
//public int questionNumber = object.getQuestionNumber();

    public JPanel createContentPane (){

        // We create a bottom-most JPanel to place everything on
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        // Panel to contain the title labels
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(40, 10);
        titlePanel.setSize(700, 100);
        totalGUI.add(titlePanel);

        JLabel redLabel = new JLabel("Who wants to be a Millionaire!");
        redLabel.setFont (redLabel.getFont ().deriveFont (40.0f));
        redLabel.setLocation(0, 0);
        redLabel.setSize(700, 100);
        redLabel.setHorizontalAlignment(0);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);
        
        
         // Label for score
         JPanel scorePanel = new JPanel();
         scorePanel.setLayout(null);
         scorePanel.setLocation(200, 350);
         scorePanel.setSize(350, 150);
         totalGUI.add(scorePanel);
         
         JLabel scoreLabel = new JLabel("Money Won: $" + moneyWon + "!");
         scoreLabel.setFont (scoreLabel.getFont ().deriveFont (25.0f));
         scoreLabel.setLocation(0,0);
         scoreLabel.setSize(350, 150);
         scoreLabel.setHorizontalAlignment(0);
         scoreLabel.setForeground(Color.red);
         scorePanel.add(scoreLabel);
 
       
        // Creation of a label to contain all the JButtons.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(50, 550);
        buttonPanel.setSize(700, 200);
        totalGUI.add(buttonPanel);

        // Buttons 
        JButton aButton = new JButton("A");
        aButton.setLocation(0, 0);
        aButton.setSize(150, 75);
        buttonPanel.add(aButton);

        JButton bButton = new JButton("B");
        bButton.setLocation(170, 0);
        bButton.setSize(150, 75);
        buttonPanel.add(bButton);

        JButton cButton = new JButton("C");
        cButton.setLocation(345, 0);
        cButton.setSize(150, 75);
        buttonPanel.add(cButton); 
        
        JButton dButton = new JButton("D");
        dButton.setLocation(515, 0);
        dButton.setSize(150, 75);
        buttonPanel.add(dButton);
        
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void showGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Who wants to be a Millionaire");
        
        

        //Create and set up the content pane.
        MillionaireGUI gui = new MillionaireGUI();
        frame.setContentPane(gui.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }
        });
    }
}