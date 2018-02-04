import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor  implements KeyListener{
	JLabel L;
	JPanel P;
	char currentLetter;
	public static void main(String[] args) {
		new TypingTutor().frame();
	}
	
	public void frame() {
		JFrame J = new JFrame();
		J.setVisible(true);
		J.setTitle("TYPE  OR  DIE !!!");
		P = new JPanel();
		L = new JLabel();
		currentLetter = generateRandomLetter();
		L.setText("  "+currentLetter+"  ");
		L.setFont(L.getFont().deriveFont(900.0f));
		L.setVerticalAlignment(JLabel.CENTER);	
		P.add(L);
		J.add(P);
		J.addKeyListener(this);
		J.setSize(1600, 1600);
	}
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
		
	}

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {	
		if(e.getKeyChar()==currentLetter) {
			P.setBackground(Color.green);
		}else {
			P.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		L.setText("  "+currentLetter+"  ");	
		L.setVerticalAlignment(JLabel.CENTER);	
	}

}
