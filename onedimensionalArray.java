import java.util.Scanner;

public class onedimensionalArray {
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
