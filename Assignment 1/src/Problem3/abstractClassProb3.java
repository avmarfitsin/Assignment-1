package Problem3;


public class abstractClassProb3 
{
	static class Node
	{
		 Object obj;
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
	
	
	public static void Push(Object o)
	{
		Node oldfront=front;
		front=new Node();
		front.obj=o;
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
	
	
	
	public static Object Pop()
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
		Object tempo;
		tempo=front.obj;
		front=front.next;
		size--;
		return tempo;
	}
	catch(Exception e)
	{
		System.out.println("Cannot pop on empty Stack");
	}
	return null;
	}
	
	public static Object Peek()
	{
		return front.obj;
	}

}