
public class Euler5 {
	
	public static void main(String[] args)
	{
		for(int i=1; i<=1000000000; i++)
		{
			int count=0;
			for(int j=1; j<=20; j++)
			{
				if (i%j==0)
				{
					count=count+1;
				}
			}
		if (count==20)
		{
			System.out.println(i);
			break;
		}
		}
	}
}
