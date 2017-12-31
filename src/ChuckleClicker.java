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

public class ChuckleClicker implements ActionListener{
	JButton joke;
	JButton punchline;
	public static void main(String[] args) {
		
		new ChuckleClicker().makeButtons();
	}
	
	public void makeButtons(){
		JFrame chuckle = new JFrame();
		JPanel clicker = new JPanel();
		chuckle.setVisible(true);
		chuckle.setTitle("ChuckleClicker");
	    joke = new JButton();
		joke.setText("joke");
		joke.addActionListener(this);
	    punchline = new JButton();
		punchline.setText("punchline");
		punchline.addActionListener(this);
		clicker.add(joke);
		clicker.add(punchline);
		chuckle.add(clicker);
		chuckle.pack();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "Theres only 1 reason I dont break you in half ");
		}else if (e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "I dont want 2 of you around");
		}
		
	}

}

















