package Problem1;

abstract class abstractClassProb1 {
	static class Node
	{
		 Object obj;
		 Node next;
		 Node last;
	}
	
	
	private static Node rear;
	private static Node front;
	static int size;
	public void ArbitraryQueue()
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
	
	
	public static void Enqueue(Object o)
	{
		Node oldrear=rear;
		rear=new Node();
		rear.obj=o;
		rear.next=null;
		rear.last=oldrear;
		size++;
		if(size==1)
		{
			if(rear!=null)
			front=rear;
			else if(front!=null)
			rear=front;
		}
		if(size>1&&oldrear!=null)
		oldrear.next=rear;
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
		System.out.println("Cannot dequeue on empty ArbitraryQueue");
	}
	return null;
	}
	
	
	public static Object Dequeue()
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
		tempo=rear.obj;
		rear=rear.last;
		size--;
		return tempo;
	}
		catch (Exception e)
		{
			System.out.println("Cannot dequeue on empty ArbitraryQueue");
		}
		return null;
	}
	
	
	public static Object Traverse(int index)
	{
		try{
		Node point=new Node();
		if(index==0)
		{
			return front.obj;
		}
		else
			point=front;
			for(int i=0; i<index; i++)
			{
				point=point.next;
			}
			return point.obj;
		}
		catch(Exception e)
		{
			System.out.println("Index out of bounds");
		}
		return null;
	}
}
