package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {	new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer demet = new Customer(1," demet"," kýzýlbuða");
		customerManager.add(demet);

	}

}
