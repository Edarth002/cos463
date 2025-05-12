import java.util.Scanner;

public class add {
    public static void main(String args[])
			{
				int numb = 0;
				System.out.print("Enter an integer number : ");
				numb = myinput.nextInt();
				mymethod(numb);
				System.out.print("The result is : "+result);
			}
			static double result = 0.0;
			static Scanner myinput = new Scanner(System.in); 
			static void mymethod(int n)
			{
				int count = 1;
				double score = 0.0;
				while (count <= n)
				{
					System.out.print("Enter a score : ");
					score = myinput.nextDouble();
					result = result + score;
					count = count + 1;
				}
			}

}
