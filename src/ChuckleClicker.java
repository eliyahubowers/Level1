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

public class ChuckleClicker {
	JButton joke;
	JButton punchline;
	public static void main(String[] args) {
		
		new ChuckleClicker().makeButtons();
	}
	
	public void makeButtons(){
		JFrame chuckle = new JFrame();
		JPanel clicker = new JPanel();
		chuckle.setVisible(true);
		chuckle.add(clicker);
		chuckle.setTitle("ChuckleClicker");
	    joke = new JButton();
		joke.setText("joke");
		joke.addActionListener(this);
	    punchline = new JButton();
		punchline.setText("punchline");
		clicker.add(joke);
		clicker.add(punchline);
	}
	
	public void actionPreformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		//if(arg0.getSource() == joke) {
			
		//}
		
	}
}

















