package Me;
import java.util.Scanner;

public class _0525_Q2 {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Get number of students
        int numberOfStudents = 0;

        double[] scores = new double[20]; // Array scores
        int best = 0; // The best score

        int score = input.nextInt();
        while (score != 0) {
            scores[numberOfStudents] = score;
            numberOfStudents++;
            if (best < score) {
                best = score;
            }
            score = input.nextInt();
        }
        // Debug: check num of scores and the best score
        System.out.println("Enter " + numberOfStudents + " scores and best=" + best);

        // Declare and initialize output string
        char[] grades = {'A', 'B', 'C', 'D', 'E'};
        int[] gradeCount = new int[grades.length];

        // Assign and display grades
        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= best - 5) {
                gradeCount[0]++;
            } else if (scores[i] >= best - 10) {
                gradeCount[1]++;
            } else if (scores[i] >= best - 20) {
                gradeCount[2]++;
            } else if (scores[i] >= best - 30) {
                gradeCount[3]++;
            } else {
                gradeCount[4]++;
            }
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + ":" + gradeCount[i]);
        }
    }
}

