package interfaces;

public class CustomerManager {
	//loosly - tightly couply (gevþek/sýký baðlama)
	
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers=loggers;
		
	}
	

   public void add(Customer customer) {
	   System.out.println("Müþteri eklendi:" +customer.getFirstName() );
	  // DatabaseLogger logger = new DatabaseLogger();
	  // logger.log(customer.getFirstName()+ "veri tabanýna loglandý");
    // Utils.runLoggers(loggers, customer.getFirstName());
     Utils.runLoggers(loggers, customer.getFirstName());
     
   
     
   
   public void delete(Customer customer) {
	   System.out.println("müþteri silindi"+customer.getFirstName());
	  // DatabaseLogger logger = new DatabaseLogger();
	   //logger.log(customer.getFirstName()+ "veri tabanýna loglandý");
	   Utils.runLoggers(loggers, customer.getLastName());
   }
}
