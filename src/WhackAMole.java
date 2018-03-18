import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame FF;
	JPanel PP;
	JButton BB;
	JButton BM;
	static int molesW = 0;
	static int r;
	int HowDorky = 0;
	static Date TAS;

	public static void main(String[] args) {
		r = new Random().nextInt(25);
		new WhackAMole().Moles(r);

	}

	void Moles(int random) {
		FF = new JFrame();
		PP = new JPanel();
		FF.add(PP);
		for (int i = 0; i <= 25; i++) {
			if (random == i) {
				BM = new JButton();
				BM.setText("MOLE");
				BM.addActionListener(this);
				PP.add(BM);
			} else {
				BB = new JButton();
				BB.addActionListener(this);
				PP.add(BB);
			}
		}
		FF.setVisible(true);
		FF.setSize(340, 240);
		FF.setTitle("WHACK THE MOLE");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BM) {
			if (molesW == 0) {
				TAS = new Date();
			}
			molesW++;
			if (molesW >= 10) {
				new WhackAMole().endGame(TAS, molesW);
				molesW = 0;
			}
			FF.dispose();
			r = new Random().nextInt(25);
			new WhackAMole().Moles(r);
		} else {
			HowDorky++;
			callDork(HowDorky);
		}
		System.out.println(molesW);
	}

	void callDork(int dorkyness) {
		switch (dorkyness) {
		case 1:
			speak("dork ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha");
			break;
		case 2:
			speak("idiot");
			break;
		case 3:
			speak("moron");
			break;
		case 4:
			speak("you stink");
			break;
		case 5:
			speak("you are a complete waste of atoms");
			break;
		case 6:
			speak("you dont deserve to play this game");
			break;
		case 7:
			speak("one more and you are out");
			break;
		case 8:
			System.exit(0);
			break;
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
