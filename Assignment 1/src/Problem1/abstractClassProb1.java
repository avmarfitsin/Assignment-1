package Problem1;

abstract class abstractClassProb1 {
	static class Node
	{
		 Object obj;
		 Node next;
		 Node last;
	}
	
	
	private static Node rear=null;
	private static Node front=null;
	static int size=0;

	
	
	public static void Push(Object o)
	{
		Node oldfront=front;	//storing old position of front
		front=new Node();	//creating new front
		front.obj=o;
		front.next=oldfront;	//linking up old front and new
		front.last=null;
		size++;	//linked list gets bigger by 1 after Push
		if(size==1)	//this is here in case there's one node, in which case it's both front and rear
		{
			if(rear!=null)
			front=rear;
			else if(front!=null)
			rear=front;
		}
		if(size>1)
		oldfront.last=front;	//if more than one node, can link up normally
	}
	
	
	public static void Enqueue(Object o)
	{
		Node oldrear=rear;	//storing old position of rear
		rear=new Node();	//creating new rear
		rear.obj=o;
		rear.next=null;
		rear.last=oldrear;	//linking up old rear and new
		size++;	//linked list gains 1 in size after Enqueue
		if(size==1)	//if one node, it is both front and rear
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
		if(size==1)	//different handling for length 1, as front and rear are same
		{
			Object tempa;
			tempa=front.obj;
			front=null;
			rear=null;
			size--;
			return tempa;
		}
		Object tempo;
		tempo=front.obj;
		front=front.next;
		front.last=null;
		size--;	//linked list loses 1 in length after a Pop operation
		return tempo;
	}
	catch(Exception e)
	{
		System.out.println("Cannot pop on empty ArbitraryQueue");
	}
	return null;
	}
	
	
	public static Object Dequeue()
	{
		try
	{
			if(size==1)	//same provisions for the 1 node case as before
			{
				Object tempa;
				tempa=rear.obj;
				front=null;
				rear=null;
				size--;
				return tempa;
			}
		Object tempo;
		tempo=rear.obj;
		rear=rear.last;
		rear.next=null;
		size--;	//linked list loses 1 after dequeue

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
		if(index==0)	//if index passed is 0 user is referring to what is the front of the list
		{
			return front.obj;
		}
		else
			point=front;
			for(int i=0; i<index; i++)	//starting from the front, loop through linked list until given index
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
