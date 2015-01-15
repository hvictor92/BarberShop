import java.util.Scanner;
import java.io.*;

public class ArrivalQueue 
{
	// variables
	 
			private Customer front, back, curr;
			private int count, size, backNum;
			public Customer cust1, cust2, cust3, cust4, cust5, cust6, cust7, cust8;
			
			Scanner fileInput;
	/**********************************************************************************************************/		
		// constructor
			public ArrivalQueue (int queueSize)
			 {
			 	size = queueSize;
			 	front = null;
			 	back = null;
			 	count = 0;
			 	backNum = queueSize;
			  }
	/**********************************************************************************************************/
		//Scanner
			public void openFile()
			 {
			  try
			     {
				  fileInput = new Scanner(new File("BarberShop.txt"));
			     }
			  catch (Exception e)
			     {
				  System.out.println("could not find file");
			     }
			 }

			public void readFile(ArrivalQueue arrival)
			{
				while(fileInput.hasNext())
				{
					int cust1Arrival = Integer.parseInt(fileInput.next());
					int cust1Service = Integer.parseInt(fileInput.next());
					String cust1Name = fileInput.next();
					cust1 = new Customer(cust1Arrival, cust1Service, cust1Name);
					arrival.enqueue(cust1);
					/*System.out.println(cust1.getArrivalTime());
					System.out.println(cust1.getServiceTime());
					System.out.println(cust1.getName());*/
					
					int cust2Arrival = Integer.parseInt(fileInput.next());
					int cust2Service = Integer.parseInt(fileInput.next());
					String cust2Name = fileInput.next();
					cust2 = new Customer(cust2Arrival, cust2Service, cust2Name);
					arrival.enqueue(cust2);
					/*System.out.println(cust2.getArrivalTime());
					System.out.println(cust2.getServiceTime());
					System.out.println(cust2.getName());*/

					int cust3Arrival = Integer.parseInt(fileInput.next());
					int cust3Service = Integer.parseInt(fileInput.next());
					String cust3Name = fileInput.next();
					cust3 = new Customer(cust3Arrival, cust3Service, cust3Name);
				    arrival.enqueue(cust3);
					
					int cust4Arrival = Integer.parseInt(fileInput.next());
					int cust4Service = Integer.parseInt(fileInput.next());
					String cust4Name = fileInput.next();
					cust4 = new Customer(cust4Arrival, cust4Service, cust4Name);
					arrival.enqueue(cust4);
					
					int cust5Arrival = Integer.parseInt(fileInput.next());
					int cust5Service = Integer.parseInt(fileInput.next());
					String cust5Name = fileInput.next();
					cust5 = new Customer(cust5Arrival, cust5Service, cust5Name);
					arrival.enqueue(cust5);
					
					int cust6Arrival = Integer.parseInt(fileInput.next());
					int cust6Service = Integer.parseInt(fileInput.next());
					String cust6Name = fileInput.next();
					cust6 = new Customer(cust6Arrival, cust6Service, cust6Name);
					arrival.enqueue(cust6);
					
					int cust7Arrival = Integer.parseInt(fileInput.next());
					int cust7Service = Integer.parseInt(fileInput.next());
					String cust7Name = fileInput.next();
					cust7 = new Customer(cust7Arrival, cust7Service, cust7Name);
					arrival.enqueue(cust7);
					
					int cust8Arrival = Integer.parseInt(fileInput.next());
					int cust8Service = Integer.parseInt(fileInput.next());
					String cust8Name = fileInput.next();
					cust8 = new Customer(cust8Arrival, cust8Service, cust8Name);
					arrival.enqueue(cust8);
			    }
			}

			public void closeFile()
			{
				fileInput.close();
			}
	/**********************************************************************************************************/	
		// methods
			  
			  public boolean isEmpty()
			  {
				  if(front == null)
				    return true;
				  else
					return false;
			  }
			  
			  public boolean isFull ()
			  {
				  if(back !=null)
			  	    return true;
			  	  else
			  	   	return false;
			  }
			  
			  public void enqueue (Customer newItem)
			  {
			  	if (front == null)
			  	{
			  		front = newItem;
			  		count++;
			  	}
			  	else if(front.getNext() == null)
			  	{
			  		front.setNext(newItem);
			  		curr = front.getNext();
			  		count++;
			  	}
			  	else if (count++ == backNum)
			  	{
			  		back = newItem;
			  	    count = backNum;
			  	}
			  	else if (curr.getNext() == null)
			  	{
			  		curr.setNext(newItem);
			  		curr = curr.getNext();
			  		count++;
			  	}
			  	else
			  	{
			  		
			  		System.out.println("Queue is full, "+newItem.getName()+" left");
			  	}
			  }
			  
			  public void enqueueAll(ArrivalQueue newQueue)
			   {
				  newQueue.enqueue(cust1);
				  newQueue.enqueue(cust2);
				  newQueue.enqueue(cust3);
				  newQueue.enqueue(cust4);
				  newQueue.enqueue(cust5);
				  newQueue.enqueue(cust6);
				  newQueue.enqueue(cust7);
				  newQueue.enqueue(cust8);
				  
			   }
			  public void dequeue() 
			  {
			  	if (front != null)
			  	{
			  		front = front.getNext();	
			  		count--;
			  	}
			  	else
			  	{
			  		System.out.println("Queue is empty");
			  	} 
			  		
			  }
			  
			  public void dequeueAll()
			  {
			  	front = null;
			 	back = null;
			 	count = 0;
			  }
			  
			  public Customer peek()
			  {
			  	if (!isEmpty())
			  		return front;	  		
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
			  		System.out.println("Arrival List: ");
			  		
			  		curr = front;
			  		while(curr != null)
			  			{
			  			   curr.printCustomer();
                           curr = curr.getNext();
			  		    }
			        	System.out.println();
			  	 }
			  	else
			  	 {
			  		System.out.println("Arrival Queue is empty");
			  	 } 
			  	
			  }
			  
	   public void toWaiting(ArrivalQueue aq, WaitingQueue wq)
	   {
		   Customer x;
		   x = aq.peek();
		   aq.dequeue();
		   wq.enqueue(x);
	   }
		
	  
		

}
