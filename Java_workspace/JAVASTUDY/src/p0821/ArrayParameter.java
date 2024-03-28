package p0821;

public class ArrayParameter {
static void printCharArray(char []c)
{
	for(int i=0; i<c.length; i++)
	{
		System.out.print(c[i]);
	}
	System.out.println();
}
static void replaceSpace(char []c)
{
	for(int i=0; i<c.length; i++)
	{
		if(c[i]==' ')
		{
			c[i]=',';
		}
	}
}
	public static void main(String[] args) {
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};e
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
