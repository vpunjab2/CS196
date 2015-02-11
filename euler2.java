
public class euler2 
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		int c = 0;
		int d = 2;
		while (a+b<4000000)
		{
			c= a+b;
			
			if(c%2==0)
			{
				d = d+c;
			}
			a=b;
			b=c;
			}
		System.out.println(d);
	}

}


