/*********************************
* Author: Spencer Rosenvall
* GUI for game play
**********************************/

/******************************************************************************************************************************
* NOTES: 
* -In getter/setters, use label.setText(var)to update the code, create update method that calls the setters and getters.
* -Possibly add music thread
* 
*******************************************************************************************************************************/
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MillionaireGUI
{

	MillionairApp app = new MillionairApp();
	//app.q1; //this line gives you access to the q1 object from the MillionaireApp class

	Question q = new Question();
	Price p = new Price();

	//public int questionNumber = object.getQuestionNumber(currentQuestionNum);
	//private String message = object.getMessageOutput(currentQuestion);
	private String moneyWon = p.getPrice();

	private String message = app.q1.getQuestionContent();
	private String answerA = app.q1.getOption1();
	private String answerB = app.q1.getOption2();
	private String answerC = app.q1.getOption3();
	private String answerD = app.q1.getOption4();

	private String correctAnswer = q.getCorrectOption();

	public JPanel createContentPane()
	{

		// We create a bottom-most JPanel to place everything on
		JPanel totalGUI = new JPanel();

		totalGUI.setLayout(null);

		// Panel to contain the title labels
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(40, 10);
		titlePanel.setSize(800, 100);
		totalGUI.add(titlePanel);

		JLabel titleLabel = new JLabel("Who wants to be a Millionaire!");
		titleLabel.setFont(titleLabel.getFont().deriveFont(40.0f));
		titleLabel.setLocation(0, 0);
		titleLabel.setSize(700, 100);
		titleLabel.setHorizontalAlignment(0);
		titleLabel.setForeground(Color.red);
		titlePanel.add(titleLabel);

		JButton startButton = new JButton("Start");
		startButton.setLocation(650, 40);
		startButton.setSize(75, 25);
		titlePanel.add(startButton);

		//Label for text output
		JPanel messagePanel = new JPanel();
		messagePanel.setLayout(null);
		messagePanel.setLocation(75, 125);
		messagePanel.setSize(600, 400); //600 x 400
		totalGUI.add(messagePanel);

		JTextArea questionLabel = new JTextArea();
		questionLabel.setText(message);
		questionLabel.setSize(570, 50);
		questionLabel.setLocation(25, 0);
		questionLabel.setWrapStyleWord(true);
		questionLabel.setLineWrap(true);
		questionLabel.setOpaque(false);
		questionLabel.setEditable(false);
		questionLabel.setFocusable(false);
		questionLabel.setBackground(UIManager.getColor("Label.background"));
		questionLabel.setFont(UIManager.getFont("Label.font"));
		questionLabel.setBorder(UIManager.getBorder("Label.border"));
		questionLabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		questionLabel.setForeground(Color.blue);

		messagePanel.add(questionLabel);

		// Label for answerA
		JLabel answerALabel = new JLabel("A: " + answerA);
		answerALabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerALabel.setLocation(0, 150);
		answerALabel.setSize(300, 50);
		answerALabel.setHorizontalAlignment(0);
		answerALabel.setForeground(Color.black);
		messagePanel.add(answerALabel);

		// Label for answerB
		JLabel answerBLabel = new JLabel("B: " + answerB);
		answerBLabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerBLabel.setLocation(0, 300);
		answerBLabel.setSize(300, 50);
		answerBLabel.setHorizontalAlignment(0);
		answerBLabel.setForeground(Color.black);
		messagePanel.add(answerBLabel);

		// Label for answerCLabel 
		JLabel answerCLabel = new JLabel("C: " + answerC);
		answerCLabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerCLabel.setLocation(300, 150);
		answerCLabel.setSize(300, 50);
		answerCLabel.setHorizontalAlignment(0);
		answerCLabel.setForeground(Color.black);
		messagePanel.add(answerCLabel);

		// Label for answerDLabel 
		JLabel answerDLabel = new JLabel("D: " + answerD);
		answerDLabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerDLabel.setLocation(300, 300);
		answerDLabel.setSize(300, 50);
		answerDLabel.setHorizontalAlignment(0);
		answerDLabel.setForeground(Color.black);
		messagePanel.add(answerDLabel);

		// Label for score (money won)
		JPanel scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(200, 475);
		scorePanel.setSize(350, 25);
		totalGUI.add(scorePanel);

		JLabel scoreLabel = new JLabel("Money Won: $" + moneyWon + "!");
		scoreLabel.setFont(scoreLabel.getFont().deriveFont(25.0f));
		scoreLabel.setLocation(0, 0);
		scoreLabel.setSize(350, 25);
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

	private static void showGUI()
	{

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Who wants to be a Millionaire");

		//Create and set up the content pane.
		MillionaireGUI gui = new MillionaireGUI();
		frame.setContentPane(gui.createContentPane());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 700);
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				showGUI();
			}
		});
	}
}