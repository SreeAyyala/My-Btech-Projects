import java.lang.*;
import java.io.*;
import java.util.Stack;
class stack 
{
	public static void main(String[] args) throws IOException
	{
	char c;	
		Stack s= new Stack();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*****Welcome to stack implementation!*****");
		do
		{
		System.out.println("Choose operation");
		System.out.println("1.push");
		System.out.println("2.pop");
		int ch=Integer.parseInt(br.readLine());
		switch (ch)
		{
		case 1:
		String str=br.readLine();
		int b=Integer.parseInt(str);	
		for (int i=0;i<10 ;i++ )
				{
				s.push(b);
				}
		break;
		case 2:for (int i=0;i<10 ;i++ )
				{
				System.out.println(s.pop());
				}
		break;
		}
		System.out.println("do you want to cont..Y/N");
	 c=(char)br.read();
		}	
		while(c=='y');
	}
}
