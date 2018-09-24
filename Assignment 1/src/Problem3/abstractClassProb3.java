package Problem3;

public class abstractClassProb3 
//class not tagged abstract in order to be able to be instantiated
{
	
	private Node top;

	public abstractClassProb3()
	{
		top = null;
	}

		class Node
		{
			public Node next;
			public int in;
		}

	
	public static void InsertionSort(abstractClassProb3 st) 
	{
		
		abstractClassProb3 st1 = new abstractClassProb3();//instantiating a second stack to use during sorting
	    
		if (st.top!=null) //make sure we're not sorting an empty stack
		{

	    while (st.top!=null) 
	    {
	    	//System.out.println("In loop1");
	      int temp = st.Pop();
	      
	      if (st1.top != null) 
	      {
	        int temp1 = st1.Peek();
	        
	        if (temp > temp1) 
	        {
	        	while (st1.top!=null) 
	        	{
	        		//System.out.println("In loop2");
	      	      int copy = st1.Pop();
	      	      st.Push(copy);
	      	      System.out.println("Swapped "+temp+" with "+temp1);
	      	    }
	        
	        }
	      }
	      
	      st1.Push(temp);
	      
	    }
	    while (st1.top!=null) 
	    {
	    	//System.out.println("In loop3");
		      int copy = st1.Pop();
		      st.Push(copy);
		}
	    
		}
	  }
	
	
	public void Push(int in)	//standard push method, like used in prob1
	{
		Node topold=top;
		top=new Node();
		top.in=in;
		top.next=topold;
	}
	
	
	public int Pop()	//similar pop to prob1 too
	{
		try
		{
			Node topold=top;
			top=top.next;
			return topold.in;
		}
		catch(Exception e)
		{
			System.out.println("Stack is empty");
		}
		return -1;
	}
	
	
	public int Peek()	//accesses the data in the top of the stack without popping it
	{
		try
		{
			int peekint=top.in;
			return peekint;
		}
		catch(Exception e)
		{
			System.out.println("Stack is empty");
		}
		return -1;
	}
}