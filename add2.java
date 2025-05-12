import java.util.Scanner;

public class add2 {
    public static void main(String args[])
		{
			int numb = 0;
			Scanner myinput = new Scanner(System.in);
			System.out.print("Enter an integer number : ");
			numb = myinput.nextInt();
			mymethod(numb);
			System.out.print("The result is : "+result);
		}
		static int result = 0;
		static void mymethod(int n)
		{
			for(int i = 1; i <= n; i++)
			{
				result = result + i;
			}
		}

}
