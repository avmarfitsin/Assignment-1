package Problem2;

public class abstractClassProb2 {
	public static Object[] out;
	static int size=0;
static void Push(Object o)
{
	size++;
	Object[] arr= new Object[size];
	//System.out.println("size"+size);
	//System.out.println("arr length"+arr.length);
	arr[0]=o;
	if(arr.length!=1)
	{
	for(int i=1;i<size;i++)
	{
		//System.out.println(i);
		arr[i]=out[i-1];
	}
	}
	out=arr;
}
static Object Pop()
{
	
	Object temp=out[0];
	Object[] arr= {size-1};
	size--;
	for(int i=0;i<size-1;i++)
	{
		arr[i]=out[i+1];
	}

	out=arr;
	return temp;
}
static void Enqueue()
{
	
}
static void Dequeue()
{
	
}
static void Print()
{
	System.out.println("Out:");
	for(int i=0;i<out.length;i++)
	{
	System.out.println(out[i]);
	}
}
}
