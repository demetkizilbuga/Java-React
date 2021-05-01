package interfaces;

public class SmsLogger implements Logger{ //logger ý smslogger a uyarla demek

	@Override
	public void log(String message) {
		System.out.println("sms gönderildi: "+message);		
	}
	

}
