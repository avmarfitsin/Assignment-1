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
		arr[i]=out[i-1];
	}
	}
	out=arr;
}


static Object Pop()
{
try
{
	Object temp=out[0];
size--;
Object[] arr=new Object[size];
for(int i=0; i<size;i++)
{
	arr[i]=out[i+1];
}
out=arr;
return temp;
}
catch (Exception e)
{
	System.out.println("Empty array");
}
return null;
}


static void Enqueue(Object o)
{
	size++;
	Object[] arr=new Object[size];
	for(int i=0;i<size-1;i++)
	{
		arr[i]=out[i];
	}
	arr[size-1]=o;
	out=arr;
}


static Object Dequeue()
{
try
{
	Object temp=out[size-1];
	size--;
	Object[] arr=new Object[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=out[i];
	}
	out=arr;
	return temp;
}
catch (Exception e)
{
	System.out.println("Empty array");
}
return null;
}

static Object Traverse(int i)
{
try
{
	return out[i];
}
catch (Exception e)
{
System.out.println("Invalid input");
}
return null;
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
