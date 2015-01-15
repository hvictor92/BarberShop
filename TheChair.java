
public class TheChair 
{
	private Customer[] queue = null;
	
    public TheChair()
    {
    	queue = new Customer[1];
    }
    
    public void enqueue( Customer newItem)
    {
    	if(queue[0] == null)
    	{
    		queue[0] = newItem;
    	}
    	else
    	{
    		System.out.println("The chair is full.");
    	}
    }
	
    public void dequeue()
    {
    	System.out.println(queue[0].getName() + " has left");
    	queue[0] = null;
    }
    
    public boolean isEmpty()
    {
    	if(queue[0] == null)
    	{
    		System.out.println("The Barber's chair is empty");
    		System.out.println();
    		return true;
    	}
       else
    	{
    			System.out.println("The Barber's chair is occupied by: ");
    			System.out.println(queue[0].getName());
    			return false;
        }
    }
    
    public Customer peek()
	  {
	  	if (!isEmpty())
	  		return queue[0];	  		
	  	else
	  	{
	  		return null;
	  	} 
	  }

}
