import java.util.Scanner;

public class practice {
    
	
		// public static void main(String args[])
		// {
		// int numb = 0;
		// 	Scanner myinput = new Scanner(System.in);
		// 	System.out.print("Enter an integer number : ");
		// 	numb = myinput.nextInt();
		// 	mymethod(numb);
		// 	System.out.print("The result is : "+result);
		// }
		// static int result = 1;
		// static void mymethod(int n)
		// {
		// 	for(int i = 1; i <= n; i++)
		// 	{
		// 		result = result * i;
		// 	}
		// }


			// public static void main(String args[])
			// {
			// 	int numb = 0;
			// 	System.out.print("Enter an integer number : ");
			// 	numb = myinput.nextInt();
			// 	mymethod(numb);
			// 	System.out.print("The result is : "+result);
			// }
			// static double result = 0.0;
			// static Scanner myinput = new Scanner(System.in); 
			// static void mymethod(int n)
			// {
			// 	int count = 1;
			// 	double score = 0.0;
			// 	while (count <= n)
			// 	{
			// 		System.out.print("Enter a score : ");
			// 		score = myinput.nextDouble();
			// 		result = result + score;
			// 		count = count + 1;
			// 	}
			// }

		// public static void main(String args[])
		// {
		// 	int numb = 0;
		// 	Scanner myinput = new Scanner(System.in);
		// 	System.out.print("Enter an integer number : ");
		// 	numb = myinput.nextInt();
		// 	mymethod(numb);
		// 	System.out.print("The result is : "+result);
		// }
		// static int result = 0;
		// static void mymethod(int n)
		// {
		// 	for(int i = 1; i <= n; i++)
		// 	{
		// 		result = result + i;
		// 	}
		// }
// public static void main(String args[])
// 			{
// 				int numb = 0;
// 				System.out.print("Enter an integer number : ");
// 				numb = myinput.nextInt();
// 				System.out.print("The result is : "+mymethod(numb));
// 			}
// 			static Scanner myinput = new Scanner(System.in); 
// 			static double mymethod(int n)
// 			{
// 				double score = 0.0, result = 0.0;
// 				for(int i = 1; i <= n; i++)		
// 				{
// 					System.out.print("Enter a score : ");
// 					score = myinput.nextDouble();
// 					result = result + score;
// 				}
// 				return result;
// 			}
// public static void main(String args[])
// 			{
// 				System.out.print("Enter the number of data :");
// 				size = myinput.nextInt();
// 				myArray = new double[size];
// 				reaData();
// 				displayData();
// 			}
// 			static Scanner myinput = new Scanner(System.in);
// 			static double[] myArray;
// 			static int size;
// 			static void reaData()
// 			{
// 				int count = 0;
// 				while (count < size) 
// 				{ 
// 					System.out.print("Enter value for array: ");
// 					myArray[count] = myinput.nextDouble();
// 					count = count + 1; 
// 				}
// 			}
// 			static void displayData()
// 			{
// 				System.out.print("Scores in the array are : ");
// 				for(int i = 0; i < size; i++)
// 				{ 
// 					System.out.print("  "+myArray[i]);
// 				}
// 			}

public static void main(String[] args) {
	System.out.println("Enter size of Array");
	size = myinput.nextInt();
	myArray = new double[size];

	readData();
	displayData();


}

static Scanner myinput = new Scanner(System.in);
static double myArray[];
static int size;

static void readData(){
	int count = 0;
	while (count < size) {
		System.out.println("Enter a value for the array");
		myArray[count] = myinput.nextDouble();

		count = count + 1;
	}
		
}

static void displayData(){System.out.print("Here are the values of your array:    ");
	for (int i = 0; i < size; i++) {
		
		System.out.print("  "+ myArray[i]);
	}

}







	}

