import java.io.*;
class prime  
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number:");
		int num=Integer.parseInt(br.readLine());
		System.out.println("The Prime Numbers are:");
		for (int i=1;i<num ;i++ )
		{
			for (int j=2;j<num ;j++ )
			{
				int n=i%j;
				if (n==0)
				{
					break;
				}
				if (i==j)
				{
					System.out.println(" "+n);
				}
			}
		}
	}
}
