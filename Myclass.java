import java.util.*;

public class Myclass {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt(),z=1;
		for(int row=input;row>=1;row--)
		{
			int y=input;
			if(row!=input)
			{
				for(int j=1;j<=(z-1);j++)
				{
					System.out.print(y+" ");
					y--;
				}
			}
			for (int j = input; j >= z; j--)
            {
                System.out.print(row+" ");
            }
			z++;
			System.out.println();
		}
		sc.close();
	}

}
