import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	JFrame FF ;
	JPanel PP ;
	JButton BB ;
	JButton BM ;
	static int r;
	int HowDorky = 0;
	public static void main(String[] args) {
		r = new Random().nextInt(24);  
		 new WhackAMole().Moles(r);
	}
	void Moles(int random) {
		FF = new JFrame();
		PP = new JPanel();
		FF.add(PP);
		for(int i = 0 ; i <= 23 ; i++) {
			if(random == i) {
				BM = new JButton();
				BM.setText("MOLE");
				BM.addActionListener(this);
				PP.add(BM);
			}else {
				BB = new JButton();
				BB.addActionListener(this);
				PP.add(BB);
			}
		}
		FF.setVisible(true);
		FF.setSize(350, 250);
		FF.setTitle("WHACK THE MOLE");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==BM) {
			FF.dispose();
			r = new Random().nextInt(25);  
			new WhackAMole().Moles(r);
		}else{
			HowDorky ++ ;
			callDork(HowDorky);
		}
		
	}
	
	void callDork(int dorkyness) {
		if(dorkyness == 1) {
		    speak("dork");
		}else{
			speak("moron");
		}
	}
	
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	
	
}
