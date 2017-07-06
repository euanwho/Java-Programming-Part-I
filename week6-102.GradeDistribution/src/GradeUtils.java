/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euanwilliams
 */
public class GradeUtils {

    public static void print(int[] grades) {
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Acceptance Percentage: " + acceptancePercentage(grades));
    }

    public static double acceptancePercentage(int[] grades) {
        int accepted = 0;
        int allScores = 0;
        for (int i = 0; i < grades.length; i++) {
            allScores += grades[i];
            if (i != 0) {
                accepted += grades[i];
            }
        }
        return (100.0 * accepted) / allScores;
    }

    public static void gradeDistribution(int[] grades, int grade) {
        if (grade < 0 || grade > 60) {
            
        } else if (grade <= 29) {
            grades[0]++;;
        } else if (grade > 29 && grade < 35) {
            grades[1]++;
        } else if (grade > 34 && grade < 40) {
            grades[2]++;
        } else if (grade > 39 && grade < 45) {
            grades[3]++;
        } else if (grade > 44 && grade < 50) {
            grades[4]++;
        } else if (grade > 49 && grade < 61) {
            grades[5]++;
        }
    }
}
