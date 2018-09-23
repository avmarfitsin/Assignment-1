package Problem4;


public class abstractClassProb4 {
	static class Node
	{
		 char ch;
		 Node next;
	}
	
	private static Node top=null;
	static int size=0;
	
	private static void Push(char c)	//familiar push function used in prob1 and 2
	{
		Node topold=top;
		top=new Node();
		top.ch=c;
		top.next=topold;
	}
	private static char Pop()	//similar pop too
	{
		Node topold=top;
		top=top.next;
		return topold.ch;
	}
	public static String ProblemFourA(String s)
	{
	try
	{
		String out="";	//creating a string we'll append to for output
		for(int i=0;i<s.length();i++)
		{
			Push(s.charAt(i));	//adding each character in input string one by one to stack
		}
		for(int i=0;i<s.length();i++)
		{
			out+=Pop();	//adding each character one by one from the stack to an output string
		}
		return out;	//because of stack's nature, the characters are popped in reverse order from their input
	}
	catch (Exception e)
	{
		System.out.println("Input invalid");
		return null;
	}
}
}
