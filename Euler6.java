
public class Euler6 {
	public static void main(String[] args)
	{
		int sumofs = 0;
		int squareofs = 0;
		for (int i=1; i<101; i++)
		{
			sumofs = sumofs + (i*i);
			squareofs = squareofs + i;
		}
		System.out.println((squareofs*squareofs)-sumofs);
	}
}
