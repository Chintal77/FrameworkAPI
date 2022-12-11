package mailTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.utilities.MonitoringMail;
import com.utilities.TestConfig;

public class TestMail {

	static  String messageBody;
	
	public static void main(String[] args) throws AddressException, MessagingException {
		// TODO Auto-generated method stub

		try {
			messageBody="http://"+InetAddress.getLocalHost().getHostAddress()+":8080/job/APITestingFramework/Extent_20Reports/";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MonitoringMail mm = new MonitoringMail();
		mm.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
		
	}

}
