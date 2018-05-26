import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	JFrame Framem ;
	JPanel Panelm ;
	
	JButton Tric;
	JButton Tret;

	public static void main(String[] args) {
		new NastySurprise().screen();
	}
	
	public void screen() {
		Framem = new JFrame();
		Panelm = new JPanel();
		
		Tric = new JButton("Trick!");
		Tret = new JButton("Treat!"
				+ "(click alot of times to get it)");
		
		Tric.addActionListener(this);
		Tret.addActionListener(this);
		
		Tric.setPreferredSize(new Dimension(400,200));
		Tret.setPreferredSize(new Dimension(300,50));
		
		Panelm.add(Tric);
		Panelm.add(Tret);
		
		Framem.add(Panelm);
		Framem.pack();
		Framem.setVisible(true);
	}
	
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==Tric) {
		showPictureFromTheInternet("https://static.boredpanda.com/blog/wp-content/uploads/2016/09/cartoon-characters-monsters-illustrations-dennis-carlsson-13-57eb660ca56c1__700.jpg");
	}else if(e.getSource()==Tret) {
		showPictureFromTheInternet("https://www.groundzeroweb.com/dennis-carlsson-artist-scary-cartoon-monsters/");
	}
}

}