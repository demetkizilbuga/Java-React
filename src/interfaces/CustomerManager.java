package interfaces;

public class CustomerManager {
	//loosly - tightly couply (gev�ek/s�k� ba�lama)
	
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers=loggers;
		
	}
	

   public void add(Customer customer) {
	   System.out.println("M��teri eklendi:" +customer.getFirstName() );
	  // DatabaseLogger logger = new DatabaseLogger();
	  // logger.log(customer.getFirstName()+ "veri taban�na logland�");
    // Utils.runLoggers(loggers, customer.getFirstName());
     Utils.runLoggers(loggers, customer.getFirstName());
     
   
     
   
   public void delete(Customer customer) {
	   System.out.println("m��teri silindi"+customer.getFirstName());
	  // DatabaseLogger logger = new DatabaseLogger();
	   //logger.log(customer.getFirstName()+ "veri taban�na logland�");
	   Utils.runLoggers(loggers, customer.getLastName());
   }
}
