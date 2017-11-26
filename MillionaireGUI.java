/*********************************
* Author: Spencer Rosenvall
* GUI for game play
**********************************/

/******************************************************************************************************************************
* NOTES: 
* -Money updated fixed, got rid of preceding "$" sign, added commas for clarity
* -Created moneyLabel and added it to the GUI
* -got rid of label discoloration bug
* -fixed bug where crash at end if user continues to click buttons after winning
* -added restart button and restart funcitonality
* -in price.java added resetPrice method
* -Possibly add music thread
* -added gameover method
*******************************************************************************************************************************/
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MillionaireGUI {

	static MillionairApp app = new MillionairApp();

	static Question q = new Question();
	static Price p = new Price();

	private static String currentMoney = ("Money Won: " + p.getPrice() + "!");
	private static String correctAnswer = app.q1.getCorrectOption();
	private static String message = app.q1.getQuestionContent();
	private static String answerA = app.q1.getOption1();
	private static String answerB = app.q1.getOption2();
	private static String answerC = app.q1.getOption3();
	private static String answerD = app.q1.getOption4();

	private static int questionRound = 1; // game starts on round 1

	private static boolean isGameOver = false; // control bit for buttons

	public static JFrame frame = new JFrame("Who wants to be a Millionaire");
	public static JTextArea questionLabel = new JTextArea();
	public static JLabel scoreLabel = new JLabel(currentMoney);
	public static JLabel titleLabel = new JLabel();
	public static JTextArea answerALabel = new JTextArea();
	public static JTextArea answerBLabel = new JTextArea();
	public static JTextArea answerCLabel = new JTextArea();
	public static JTextArea answerDLabel = new JTextArea();

	public static JPanel createContentPane() {

		// We create a bottom-most JPanel to place everything on
		JPanel totalGUI = new JPanel();

		totalGUI.setLayout(null);

		// Panel to contain the title labels
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(40, 10);
		titlePanel.setSize(800, 100);
		totalGUI.add(titlePanel);

		titleLabel.setText("Who wants to be a Millionaire!");
		titleLabel.setFont(titleLabel.getFont().deriveFont(40.0f));
		titleLabel.setLocation(0, 0);
		titleLabel.setSize(700, 100);
		titleLabel.setHorizontalAlignment(0);
		titleLabel.setForeground(Color.red);
		titlePanel.add(titleLabel);

		JButton startButton = new JButton("restart");
		startButton.setLocation(650, 40);
		startButton.setSize(75, 25);
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				restartGame();
			}
		});
		titlePanel.add(startButton);

		// Label for text output
		JPanel messagePanel = new JPanel();
		messagePanel.setLayout(null);
		messagePanel.setLocation(75, 125);
		messagePanel.setSize(600, 350); // 600 x 400
		totalGUI.add(messagePanel);

		// JTextArea questionLabel
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

		// Text area for answerA
		answerALabel.setText("A: " + answerA);
		answerALabel.setSize(300, 50);
		answerALabel.setLocation(0, 150);
		answerALabel.setWrapStyleWord(true);
		answerALabel.setLineWrap(true);
		answerALabel.setOpaque(false);
		answerALabel.setEditable(false);
		answerALabel.setFocusable(false);
		answerALabel.setBackground(UIManager.getColor("Label.background"));
		answerALabel.setFont(UIManager.getFont("Label.font"));
		answerALabel.setBorder(UIManager.getBorder("Label.border"));
		answerALabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerALabel.setForeground(Color.blue);

		messagePanel.add(answerALabel);

		// Text area for answerB
		answerBLabel.setText("B: " + answerB);
		answerBLabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerBLabel.setLocation(0, 300);
		answerBLabel.setSize(300, 50);
		answerBLabel.setForeground(Color.blue);
		answerBLabel.setWrapStyleWord(true);
		answerBLabel.setLineWrap(true);
		answerBLabel.setOpaque(false);
		answerBLabel.setEditable(false);
		answerBLabel.setFocusable(false);
		answerBLabel.setBackground(UIManager.getColor("Label.background"));
		messagePanel.add(answerBLabel);

		// Text area for answerCLabel
		answerCLabel.setText("C: " + answerC);
		answerCLabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerCLabel.setLocation(300, 150);
		answerCLabel.setSize(300, 50);
		answerCLabel.setForeground(Color.blue);
		answerCLabel.setWrapStyleWord(true);
		answerCLabel.setLineWrap(true);
		answerCLabel.setOpaque(false);
		answerCLabel.setEditable(false);
		answerCLabel.setFocusable(false);
		answerCLabel.setBackground(UIManager.getColor("Label.background"));
		messagePanel.add(answerCLabel);

		// Text area for answerDLabel
		answerDLabel.setText("D: " + answerD);
		answerDLabel.setFont(questionLabel.getFont().deriveFont(20.0f));
		answerDLabel.setLocation(300, 300);
		answerDLabel.setSize(300, 50);
		answerDLabel.setForeground(Color.blue);
		answerDLabel.setWrapStyleWord(true);
		answerDLabel.setLineWrap(true);
		answerDLabel.setOpaque(false);
		answerDLabel.setEditable(false);
		answerDLabel.setFocusable(false);
		answerDLabel.setBackground(UIManager.getColor("Label.background"));
		messagePanel.add(answerDLabel);

		// Panel for score (money won)
		JPanel scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(200, 490);
		scorePanel.setSize(350, 25);
		totalGUI.add(scorePanel);

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
		buttonPanel.setSize(675, 200);
		totalGUI.add(buttonPanel);

		// Buttons
		JButton aButton = new JButton("A");
		aButton.setLocation(0, 0);
		aButton.setSize(150, 75);

		aButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkAnswer("A");
			}
		});

		buttonPanel.add(aButton);

		JButton bButton = new JButton("B");
		bButton.setLocation(170, 0);
		bButton.setSize(150, 75);

		bButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkAnswer("B");
			}
		});

		buttonPanel.add(bButton);

		JButton cButton = new JButton("C");
		cButton.setLocation(345, 0);
		cButton.setSize(125, 75);

		cButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkAnswer("C");
			}
		});
		buttonPanel.add(cButton);

		JButton dButton = new JButton("D");
		dButton.setLocation(515, 0);
		dButton.setSize(125, 75);
		dButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkAnswer("D");
			}
		});
		buttonPanel.add(dButton);

		totalGUI.setOpaque(true);
		return totalGUI;
	}

	private static void showGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);

		// Create and set up the content pane.
		MillionaireGUI gui = new MillionaireGUI();
		frame.setContentPane(gui.createContentPane());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 700);
		frame.setVisible(true);
	}

	public static void startGame() {
		// startMusic(); TODO: create a music thread
		// if button gets correct answer, go to question 2....12. Else, you lose.
		// if question 12 gets correct answer, winGame();

	}

	public static void nextQuestion(int i) {
		switch (i) {
		case 2:
			System.out.println("Next Question!");
			message = app.q2.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q2.getOption1();
			answerB = app.q2.getOption2();
			answerC = app.q2.getOption3();
			answerD = app.q2.getOption4();
			correctAnswer = app.q2.getCorrectOption();
			update();
			break;

		case 3:
			message = app.q3.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q3.getOption1();
			answerB = app.q3.getOption2();
			answerC = app.q3.getOption3();
			answerD = app.q3.getOption4();
			correctAnswer = app.q3.getCorrectOption();
			update();
			break;

		case 4:
			message = app.q4.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q4.getOption1();
			answerB = app.q4.getOption2();
			answerC = app.q4.getOption3();
			answerD = app.q4.getOption4();
			correctAnswer = app.q4.getCorrectOption();
			update();
			break;

		case 5:
			message = app.q5.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q5.getOption1();
			answerB = app.q5.getOption2();
			answerC = app.q5.getOption3();
			answerD = app.q5.getOption4();
			correctAnswer = app.q5.getCorrectOption();
			update();
			break;

		case 6:
			message = app.q6.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q6.getOption1();
			answerB = app.q6.getOption2();
			answerC = app.q6.getOption3();
			answerD = app.q6.getOption4();
			correctAnswer = app.q6.getCorrectOption();
			update();
			break;

		case 7:
			message = app.q7.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q7.getOption1();
			answerB = app.q7.getOption2();
			answerC = app.q7.getOption3();
			answerD = app.q7.getOption4();
			correctAnswer = app.q7.getCorrectOption();
			update();
			break;

		case 8:
			message = app.q8.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q8.getOption1();
			answerB = app.q8.getOption2();
			answerC = app.q8.getOption3();
			answerD = app.q8.getOption4();
			correctAnswer = app.q8.getCorrectOption();
			update();
			break;

		case 9:
			message = app.q9.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q9.getOption1();
			answerB = app.q9.getOption2();
			answerC = app.q9.getOption3();
			answerD = app.q9.getOption4();
			correctAnswer = app.q9.getCorrectOption();
			update();
			break;

		case 10:
			message = app.q10.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q10.getOption1();
			answerB = app.q10.getOption2();
			answerC = app.q10.getOption3();
			answerD = app.q10.getOption4();
			correctAnswer = app.q10.getCorrectOption();
			update();
			break;

		case 11:
			message = app.q11.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q11.getOption1();
			answerB = app.q11.getOption2();
			answerC = app.q11.getOption3();
			answerD = app.q11.getOption4();
			correctAnswer = app.q11.getCorrectOption();
			update();
			break;

		case 12:
			message = app.q12.getQuestionContent();
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			answerA = app.q12.getOption1();
			answerB = app.q12.getOption2();
			answerC = app.q12.getOption3();
			answerD = app.q12.getOption4();
			correctAnswer = app.q12.getCorrectOption();
			update();
			break;

		case 13:
			currentMoney = ("Money Won: $" + p.getPrice() + "!");
			endGame();

		default:
			return;
		}
	}

	public static void gameOver() {
		isGameOver = true;
		questionLabel.setText("Game Over, total money won: " + p.getPrice());
		answerALabel.setText("You");
		answerBLabel.setText("A");
		answerCLabel.setText("Are");
		answerDLabel.setText("Loser!");
	}

	public static void checkAnswer(String c) {
		if (isGameOver) {
			return;
		} else if (c == correctAnswer) {
			isCorrect();
		} else {
			isIncorrect();
		}
	}

	public static void isCorrect() {
		questionRound++; // question round increments correctly
		System.out.println("Correct!");
		p.setPrice(); // increase the price
		System.out.println(p.getPrice());
		nextQuestion(questionRound); // to the next question
	}

	public static void isIncorrect() {
		System.out.println("Incorrect! GAMEOVER! Money Won: " + p.getPrice());
		gameOver();
	}

	public static void restartGame() {
		System.out.println("restarting game...");
		message = app.q1.getQuestionContent();
		p.resetPrice();
		isGameOver = false;
		currentMoney = ("Money Won: $" + p.getPrice() + "!");
		answerA = app.q1.getOption1();
		answerB = app.q1.getOption2();
		answerC = app.q1.getOption3();
		answerD = app.q1.getOption4();
		correctAnswer = app.q1.getCorrectOption();
		update();
	}

	// - - - -Update GUI - - - - -//
	public static void update() {
		questionLabel.setText(message);
		scoreLabel.setText(currentMoney);
		answerALabel.setText("A: " + answerA);
		answerBLabel.setText("B: " + answerB);
		answerCLabel.setText("C: " + answerC);
		answerDLabel.setText("D: " + answerD);
	}

	public static void endGame() {
		isGameOver = true;
		questionLabel.setText("CONGRATULATIONS! WINNER!!! MILLIONAIRE!!");
		scoreLabel.setText(currentMoney);
		answerALabel.setText("You");
		answerBLabel.setText("A");
		answerCLabel.setText("Are");
		answerDLabel.setText("Millionaire!");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				showGUI();
			}
		});
	}
}
