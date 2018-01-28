import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SpamAlot implements ActionListener{
	JButton button1;
	JButton button2;
	JTextField field1;
	
	static final String FAKE_USERNAME = "leagueofamazing@gmail.com";
	static final String FAKE_PASSWORD = "code5life";
	public static void main(String[] args) {
		new SpamAlot().MakeButtons();
	}
	public void MakeButtons() {
		Frame f1 = new Frame();
		Panel p1 = new Panel();
		button1 = new JButton();
		button2 = new JButton();
		field1 = new JTextField(20);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		field1.addActionListener(this);
		
		button1.setText("BAD");
		button2.setText("GOOD");
		
		p1.add(field1);
		p1.add(button1);
		p1.add(button2);
		f1.add(p1);
		f1.setVisible(true);
		f1.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			String text;
		   text = field1.getText();
			sendSpam(text,"blah","Im not your friend anymore");
		}else if(e.getSource() == button2) {
			String text;
			   text = field1.getText();
				sendSpam(text,"blah","Im so haaaaapyyyyy");
			}
		
	}
	
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}

	
	
}
