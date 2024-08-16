/*
Internships: CodeSoft
Task-2 Students Grade Calculator
*/
import java.util.Scanner;

public class StudentGrade { 
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // To scan
        
        System.out.print("Enter the subjects number: ");
        int numSubjects = myObj.nextInt();
        
        int[] marks = new int[numSubjects];
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the subject as marks" + (i + 1) + ": ");
            marks[i] = myObj.nextInt();
        }
        
        int totalMarks = calculateTotalMarks(marks);
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
        char grade = calculateGrade(averagePercentage);
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average %: " + averagePercentage + "100%");
        System.out.println("Grade: " + grade);
        
        myObj.close();
    }

public static int calculateTotalMarks(int[] marks) {
int total = 0;
for (int mark : marks) {
total += mark;
}
return total; // total
}

public static double calculateAveragePercentage(int totalMarks, int numSubjects) {
return ((double) totalMarks / (numSubjects * 100)) * 100; // return to total marks
}

public static char calculateGrade(double averagePercentage) {
if (averagePercentage >= 90) {
return 'A';
} else if (averagePercentage >= 80) {
return 'B';
} else if (averagePercentage >= 70) {
return 'C';
} else if (averagePercentage >= 60) {
return 'D';
} else {
return 'F';
}
}
}