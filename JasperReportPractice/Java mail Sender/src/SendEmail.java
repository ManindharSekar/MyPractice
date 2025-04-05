import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail {
	
	 public static void main(String [] args)  
	   { 
		 String host = "smtp.gmail.com";  // Gmail SMTP server
	        final String user = "m121027001@gmail.com";  // Sender's email address
	        final String password = "bjib irby mrbg rcsk";  // Sender's email password
	        String to = "manindharvlr@gmail.com";  // Recipient's email address

	        // Set properties
	        Properties properties = new Properties();
	        properties.put("mail.smtp.host", host);
	        properties.put("mail.smtp.port", "587");  // For TLS
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.starttls.enable", "true");

	        // Get the default Session object
	        Session session = Session.getInstance(properties, new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(user, password);
	            }
	        });

	        try {
	            // Create a default MimeMessage object
	            Message message = new MimeMessage(session);

	            // Set the from address
	            message.setFrom(new InternetAddress(user));

	            // Set the recipient address
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

	            // Set the subject
	            message.setSubject("Manindhar Test Email from Java");

	            // Set the email content
	            message.setText("Hello Manindhar, this is a test email sent from Java!");

	            // Send the message
	            Transport.send(message);

	            System.out.println("Email sent successfully!");

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	   }

}
