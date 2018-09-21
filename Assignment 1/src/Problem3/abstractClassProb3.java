package Problem3;

public class abstractClassProb3 
{
	static class Node
	{
		 char ch;
		 Node next;
	}
	
	private static Node top;
	static int size;
	private void ArbitraryQueue()
	{
		size=0;
		top=null;
	}
	private static void Push(char c)
	{
		Node topold=top;
		top=new Node();
		top.ch=c;
		top.next=topold;
	}
	private static char Pop()
	{
		Node topold=top;
		top=top.next;
		return topold.ch;
	}

}