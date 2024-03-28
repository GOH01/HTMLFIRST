package p0828;
class Calc{
	static int abs(int n)
	{
		if(n<0)
		{
			return -1*n;
		}
		else
		{
			return n;
		}
	}
	static int max(int a, int b)
	{
		return a>b?a:b;
	}
	static int min(int x, int y)
	{
		return x<y?x:y;
	}
}
public class CalcEx {

	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));

	}

}
