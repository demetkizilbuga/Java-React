package interfaces;

public class SmsLogger implements Logger{ //logger � smslogger a uyarla demek

	@Override
	public void log(String message) {
		System.out.println("sms g�nderildi: "+message);		
	}
	

}
