public class WaitingQueue 
{
		 // variables
	private int maxSize, size;
	private int front, back;
	private Customer[] queue;
/**********************************************************************************************************/	
 
		 // constructor
		 
	public WaitingQueue (int queueSize)	{
		size = queueSize;
		front = 0;
		back = queueSize;
		size = 0;
		queue = new Customer[queueSize];
	}

/**********************************************************************************************************/	
		  // methods

     public void enqueue (Customer newItem)
     {
    	 if (queue[front] == null)
 	      {
 	  		queue[front] = newItem;
 	  		size++;
 	  	  }
    	 else if(queue[front+1] == null|| queue[front] != null)
  	      {
    		 queue[front+1] = newItem;
    		 size++;
  	      }
    	 else if(queue[back] == null || queue[front] != null || queue[front+1] != null)
    	 {	 
  		   queue[back] = newItem;
  		   size++;
  		 }
  	    else
  	     {
  		   System.out.println("Queue is full");
         }
  }
		  
     public boolean isEmpty()
	  {
		  if(queue[0] == null)
		    return true;
		  else
			return false;
	  }
	  
	  public boolean isFull ()
	  {
	  	return back == size;
	  }
	  
	  
	
	  public void dequeue(Customer newItem) 
	  {
	  	if (queue[front] != null || queue[front++] != null)
	  	{
	  		queue[front] =queue[front++];	
	  		size--;
	  	}
	  	else if(queue[front] != null || queue[front++] == null)
	  	{
	  		queue[front] = null;
	  	}
	  	else
	  	{
	  		System.out.println("Queue is empty");
	  	} 
	  		
	  }
	  
	  public void dequeueAll()
	  {
	  	queue[front] = null;
	 	size = 0;
	  }
	  
	  public Customer peek()
	  {
	  	if (!isEmpty())
	  		return queue[front];	  		
	  	else
	  	{
	  		System.out.println("Queue is empty");
	  		return null;
	  	} 
	  }
	  
	  public void display()
	  {
	  	if (!isEmpty())
	  	 {
	  		System.out.println("Waiting Chairs: ");
	  		  if(queue[front] != null||queue[front++] == null)
	  		  {
	  			queue[front].printCustomer();
	  		  }
	  		  
	  		  else if(queue[front] != null||queue[front++] != null)
	  		  {
	  			queue[front].printCustomer();
	  			queue[front++].printCustomer();
	  		  }
	  		
	  		  else 
	  		  {
	  			queue[front].printCustomer();
	  			queue[front++].printCustomer();
	  			queue[back].printCustomer();
	  		  }
	  		  
	  		System.out.println();
	  	 }
	  	else
	  	 {
	  		System.out.println("Waiting Queue is empty");
	  	 } 
	  	
	  }	

	  public void toChair(WaitingQueue wq, Customer cus, TheChair tc)
	  {
		  tc.enqueue(cus);
		  wq.dequeue(cus);
	  }
} 
