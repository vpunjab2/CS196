
public class euler3 
{
	public static void main(String[] args)
	{
		long a = 600851475143L;
		for (int i=1; i<a; i++)
		{
			if(a%i==0)
			{
				int count=0;
				for(int j=1; j<=i; j++)
				{
					if(i%j==0)
					{
						count = count+1;
						
					}
				}
					
				if (count==2)
					{
						System.out.println(i);
				
					}
				}
			}
		}	
	}
