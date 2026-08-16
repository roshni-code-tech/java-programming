import java.util.Scanner;

public class StudentGradeCalculator {

    static double calculateAverage(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.length;
    }

    static String calculateGrade(double average) {
        if (average >= 90)
            return "A+";
        else if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        double average = calculateAverage(marks);
        String grade = calculateGrade(average);

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
