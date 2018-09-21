package Problem3;


public class abstractClassProb3 
{
	static class Node
	{
		 int in;
		 Node next;
		 Node last;
	}
	
	
	private static Node rear;
	private static Node front;
	static int size;
	public void Stack()
	{
		size=0;
		rear=null;
		front=null;
		
	}
	
	
	public static void Push(int i)
	{
		Node oldfront=front;
		front=new Node();
		front.in=i;
		front.next=oldfront;
		front.last=null;
		size++;
		if(size==1)
		{
			if(rear!=null)
			front=rear;
			else if(front!=null)
			rear=front;
		}
		if(size>1)
		oldfront.last=front;
	}
	
	
	
	public static int Pop()
	{
	try
	{
		if(size==1)
		{
			if(rear!=null)
			front=rear;
			else if(front!=null)
			rear=front;
		}
		int tempo;
		tempo=front.in;
		front=front.next;
		size--;
		return tempo;
	}
	catch(Exception e)
	{
		System.out.println("Cannot pop on empty Stack");
	}
	return 0;
	}
	
	public static int Peek()
	{
		return front.in;
	}

}