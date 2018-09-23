package Problem3;

public class Prob3 extends abstractClassProb3
{
	public static void main(String[] args)
	{
		abstractClassProb3 lls=new abstractClassProb3(); //have to instantiate the abstract class to get a 
		//Stack object
		lls.Push(2);
		lls.Push(1);
		lls.Push(3);
		sortInsertion(lls);
		System.out.println(lls.Pop());
		System.out.println(lls.Pop());
		System.out.println(lls.Pop());
		
	}

}