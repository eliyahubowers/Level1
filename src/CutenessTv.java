import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTv  implements ActionListener{
	JButton button1;
	JButton button2;
	JButton button3;	
public static void main(String[] args) {
		
		new CutenessTv().makeButtons();
	}
	public void makeButtons(){
		JFrame TV = new JFrame();
		JPanel cute = new JPanel();
		TV.setVisible(true);
		TV.setTitle("TV cute");
	    button1 = new JButton();
		button1.setText("1");
		button1.addActionListener(this);
		button2 = new JButton();
		button2.setText("2");
		button2.addActionListener(this);
		button3 = new JButton();
		button3.setText("3");
		button3.addActionListener(this);
		cute.add(button1);
		cute.add(button2);
		cute.add(button3);
		TV.add(cute);
		TV.pack();
	}
	public void actionPreformed(ActionEvent arg0) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(e.getSource() == button1) {
			showDucks();
		}else if (e.getSource() == button2) {
			showFrog();
		}else if (e.getSource() == button3) {
			showFluffyUnicorns();
		}
		
	}
	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
