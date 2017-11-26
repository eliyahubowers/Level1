
// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeapordy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton; 
	private JButton fourthButton;

	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeapordy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeapordy for not so smart people ... ... so they to can feel great");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel panel = createHeader("easy stuff");
		// 4. Add the header component to the quizPanel
		quizPanel.add(panel);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("1");
		// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		// 8. Write the code inside the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.
		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		secondButton = createButton("10,000");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below
		
		thirdButton = createButton("100,000");
		quizPanel.add(thirdButton);
		thirdButton.addActionListener(this);
		
		fourthButton = createButton("1000,000");
		quizPanel.add(fourthButton);
		fourthButton.addActionListener(this);		

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a
	 * question
	 */

	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton BLA_BLA = new JButton();
		// Set the text of the button to the dollarAmount

		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
		// Return your new button instead of the temporary button
		return new JButton("$" + dollarAmount);
	}

	public void actionPerformed(ActionEvent arg0) {

		// Use the method that plays the jeopardy theme music.
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("tictock.wav"));
		sound.play();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if (arg0.getSource() == firstButton) {
			askQuestion("what is 1+1?", "2", 1);
			firstButton.setText("");
		}
		// Fill in the askQuestion() method. When you play the game, the score should
		// change.
		// Or if the buttonPressed was the secondButton
		else if (arg0.getSource() == secondButton) {
		// Call the askQuestion() method with a harder question
			askQuestion("what is the prime factorization of 91","7 13", 10000);
		// Clear the button text (set the button text to nothing)
			secondButton.setText("");
			}
		else if (arg0.getSource() == thirdButton) {
			askQuestion("do I have glasses", "yes", 1000000);
			thirdButton.setText("");
		}
		else if (arg0.getSource() == fourthButton) {
			askQuestion("good luck", "kincfuhekcfuherkcui", 10000000);
			fourthButton.setText("");
		}
		
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		String Answer = JOptionPane.showInputDialog(null, question);
		// If the answer is correct
		if (Answer.equals(correctAnswer)) {
			// Increase the score by the prizeMoney
			score += prizeMoney;
			// Call the updateScore() method
			updateScore();
			// Pop up a message to tell the user they were correct
		}
		// Otherwise
		else{
		// Decrement the score by the prizeMoney
			score-= prizeMoney;
		// Pop up a message to tell the user the correct answer
		}
		// Call the updateScore() method
		updateScore();
	}

	public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
