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
		arr[i]=out[i-1];	//copying is shifted one over - arr[1] is out of 0 because of the new element at the front of arr
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
	arr[i]=out[i+1];	//copying over everything "one over", index 0 of arr is index 1 of out, so on because of the removed object
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
		arr[i]=out[i];	//copying is symmetrical because new element can simply be added at the end
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
		arr[i]=out[i];	//copying is symmetrical because the object was just removed from the end
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
	return out[i];	//just need to return object at the given index - with arrays it's easy
}
catch (Exception e)
{
System.out.println("Invalid input");
}
return null;
}


static void Print()	//helper method to see what's going on in the arbitraryqueue
{
	System.out.println("Out:");
	for(int i=0;i<out.length;i++)
	{
	System.out.println(out[i]);
	}
}
}
