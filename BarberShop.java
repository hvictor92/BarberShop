//Barber Shop
//Henry Victor and Aaron Stone
//CSC 111
//Pro. Hoffman
public class BarberShop
{	

    public static void main(String[] args) {

    	//variables
		TheChair chair = new TheChair();
		ArrivalQueue arrival = new ArrivalQueue(7);
		WaitingQueue waiting = new WaitingQueue(7);
		int time = 0;
	/**********************************************************************************************************/
	  //Scanner files
		arrival.openFile();
		arrival.readFile(arrival);
		//arrival.display(); test to see if queue is was properly filed
		
	/**********************************************************************************************************/
		
        //main loop
						
		while(time < 23)
        {  //System.out.println()
			System.out.println("Time = " + time);
			
			  if(time == 0)
			  {
				 System.out.println("The barber is on a break"); 
				 chair.isEmpty();
				 System.out.println();
				 arrival.display();
				 System.out.println("______________________________________________");
				 
			  }
			  else if(time == 1)
			  {
				  System.out.println("The barber is on a break"); 
				  chair.isEmpty();
				  waiting.enqueue(arrival.peek()); 
				  arrival.dequeue();
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      
				  
			  }
			  else if(time == 2)
			  {
				  chair.enqueue(waiting.peek());
				  waiting.dequeue(waiting.peek());
				   if(arrival.peek().getArrivalTime() == time)
				   {
					   waiting.enqueue(arrival.peek()); 
					   arrival.dequeue();
				   }
				   
				   if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
				   }
				   
				   
				   waiting.display();
				   arrival.display();
				   System.out.println("______________________________________________");
				   

			  }
			  else if(time == 3)
			  {
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek().getName());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			     

			  }
			  else if(time == 4)
			  {
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek().getName());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 5)
			  {
				  chair.dequeue();
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   chair.isEmpty();
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 6)
			  {
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 7)
			  {
				  chair.dequeue();
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				 
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   chair.isEmpty();
					   System.out.println();
				   }
				  else
				   { 	   
				      System.out.println("In the Barber's Chair: ");
				      System.out.println("Barber Chair: "+chair.peek());
				   }
				 
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 8)
			  {
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   chair.isEmpty();
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 9)
			  {
				  chair.dequeue();
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   chair.isEmpty();
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 10)
			  {
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 11)
			  {
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			  }
			  else if(time == 12)
			  {
				  if(arrival.peek().getArrivalTime() == time)
				   {
					  waiting.enqueue(arrival.peek()); 
					  arrival.dequeue();
				   }
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 13)
			  {
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 14)
			  {
				  
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 15)
			  {
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 16)
			  {
				  chair.dequeue();
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 17)
			  {
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  else
				   { 	   
				      System.out.println("In the Barber's Chair: ");
				      System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 18)
			  {
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  
				  waiting.display();
				  arrival.display();
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 19)
			  {
				  chair.dequeue();
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   chair.isEmpty();
				   }
				  
			      System.out.println("______________________________________________");
			      

			  }
			  else if(time == 20)
			  {
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				  
				  System.out.println("______________________________________________");
			      

			  }
			  else if(time == 21)
			  {
				  if(chair.peek() == null)
				   {
					   waiting.toChair(waiting, waiting.peek(), chair);
					   System.out.println("Barber Chair: "+chair.peek());
				   }
				 
				 System.out.println("______________________________________________");
			      

			  }
			  else if(time == 22)
			  {
				  chair.dequeue();
				  System.out.println("The Barber is done for the day!");
				  
				  System.out.println("______________________________________________");
			      

			  }
			  
				 time++;
		 }	
	}
	
				 

		
	
}

		

