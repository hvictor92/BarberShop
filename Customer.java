
public class Customer 
{
  //variables
	private int arrivalTime;
	private int serviceTime;
	private String name;
	private Customer next;
/**********************************************************************************************************/	
  // constructors 
	public Customer(int initArrival, int initService, String initName)
    {
    	name = initName;
    	serviceTime = initService;
    	arrivalTime = initArrival;
    }
    
    public Customer(int initArrival, int initService, String initName, Customer nextCust)
    {
    	name = initName;
    	serviceTime = initService;
    	arrivalTime = initArrival;
    	next = nextCust;
    }
    
  /**********************************************************************************************************/   
   //methods
    public void setArrivalTime(int newArrival)
    {
    	arrivalTime = newArrival;
    }
    
    public void setAServiceTime(int newService)
    {
    	serviceTime = newService;
    }
    
    public int getArrivalTime()
    {
    	return arrivalTime;
    }
    
    public int getServiceTime()
    {
    	return serviceTime;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public void printCustomer()
    {
    	System.out.println(name+": "+"Arrival: "+arrivalTime+" Service: "+serviceTime);
    }
    
    public void setNext(Customer nextCust)
    {
    	next = nextCust;
    }
    
    public Customer getNext()
    {
    	return next;
    }

	
}
