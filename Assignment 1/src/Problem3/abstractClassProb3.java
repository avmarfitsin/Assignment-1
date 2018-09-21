package Problem3;

public class abstractClassProb3 
{
	static class Node
	{
		 int in;
		 Node next;
	}
	
	private static Node top;
	static int size;
	void ArbitraryQueue()
	{
		size=0;
		top=null;
	}
	static void Push(int i)
	{
		Node topold=top;
		top=new Node();
		top.in=i;
		top.next=topold;
	}
	static int Pop()
	{
	try
	{
		Node topold=top;
		top=top.next;
		return topold.in;
	}
	catch(Exception e)
	{
		System.out.println("Can't pop on empty queue");
	}
	return 0;
	}
	static int Peek()
	{
		return top.in;
	}

}