import java.util.Scanner;

class twodimensionalArray{

    public static void main(String[] args) {

        System.out.println("Enter the number of Students and courses");
        students = myinput.nextInt();
        courses = myinput.nextInt();
        myarray = new double[students][courses];

        readData();
        displayData();
        
    }

    static Scanner myinput = new Scanner(System.in);
    static int students, courses;
    
    static double[][] myarray;

    static void readData(){
        int count = 0;
        
        for (int i = 0; i < students; i++) {
            
            count = 0;
            while (count < courses) {
                System.out.println("Enter Score of Student : " + i);
                myarray[i][count] = myinput.nextDouble();            
                count = count + 1;
            }
            
        }
    }
    static void displayData(){
        int stucount = 0;
        do {
            System.out.println("Score for Student " + stucount + " is given as: ");

            for (int j = 0; j < courses; j++) {
                System.out.print(" " + myarray[stucount][j]);
            }
            stucount = stucount + 1;
        } while (stucount < students);
    }

}