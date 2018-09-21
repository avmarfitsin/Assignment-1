package Problem4;


public class abstractClassProb4 {
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
	public static String ProblemFourA(String s)
	{
	try
	{
		String out="";
		for(int i=0;i<s.length();i++)
		{
			Push(s.charAt(i));
		}
		for(int i=0;i<s.length();i++)
		{
			out+=Pop();
		}
		return out;
	}
	catch (Exception e)
	{
		System.out.println("Input invalid");
		return null;
	}
}
}
