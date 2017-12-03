

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener{
	JButton lottery;
	public static void main(String[] args) {
		new LotteryNumbers().makeButtons();
	}
	public void makeButtons(){
		JFrame chuckle = new JFrame();
		JPanel clicker = new JPanel();
		chuckle.setVisible(true);
		chuckle.setTitle("ChuckleClicker");
	    lottery = new JButton();
		lottery.setText("click for numbers");
		lottery.addActionListener(this);
		clicker.add(lottery);
		chuckle.add(clicker);
		chuckle.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random number = new Random();
		int lotterynumber1 = number.nextInt(9);
		int lotterynumber2 = number.nextInt(9);
		int lotterynumber3 = number.nextInt(9);
		int lotterynumber4 = number.nextInt(9);
		int lotterynumber5 = number.nextInt(9);
		if(e.getSource() == lottery  && lotterynumber1 == lotterynumber2) {
			JOptionPane.showMessageDialog(null, "here are your numbers " + lotterynumber1 + ", " + lotterynumber2 + ", " + lotterynumber3 + ", " + lotterynumber4 + ", " + lotterynumber5);
		}
		
	}
}
