import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BianaryConverter implements ActionListener{
	JButton JButton1;
	JFrame JFrame1;
	JPanel JPanel1;
	JTextField answer;
	JTextField input;
	static String base10 = "";
	static String base2 = "";
	
	
	public static void main(String[] args) {
		new BianaryConverter().makeButtons();
	}
	void makeButtons() {
		JFrame1 = new JFrame();
		JFrame1.setVisible(true);
		JFrame1.setTitle("base 10-2");
		JPanel1 = new JPanel();
		answer = new JTextField(20);
		input = new JTextField(20);
		JButton1 = new JButton();
		JButton1.addActionListener(this);
		JButton1.setText("convert");
	    JPanel1.add(input);
		JPanel1.add(JButton1);
		JPanel1.add(answer);
		JFrame1.add(JPanel1);
		JFrame1.pack();
	}
	
	 String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 //char theLetter = (char) asciiValue;
	   	 //return "" + theLetter;
	   	 
	   	return "" + asciiValue;
	    }

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==JButton1) {
			base10 = input.getText();
			base2 =  convert(base10);
			answer.setText(base2); 
		}
		
	}
	
}
