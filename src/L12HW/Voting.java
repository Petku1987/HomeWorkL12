package L12HW;

import java.util.Scanner;

public class Voting {
    String[] problems = {"War situation\t\t",
            "The financial crisis",
            "Corruption\t\t\t",
            "European integration",
            "Education\t\t\t"};
    int nrRespondents;
    int[][] marks;

    Voting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nr of respondents: ");
        nrRespondents = scanner.nextInt();
        marks = new int[problems.length][nrRespondents];
        showProblemsAndVote();
        displayStatistics();
    }

    int putMarks() {
        int k;
        while (true) {
            k = (int) (Math.random() * 10);
//            k = scanner.nextInt();
            if (!(k < 11 && k > 0))
                System.out.println("Atention! Out of range 1-10. Please try again: ");
            else break;
        }
        return k;
    }

    void showProblemsAndVote() {
        System.out.println("Top 5 issues of the country:\n");
        for (int i = 0; i < problems.length; i++) System.out.println((i + 1) + ". " + problems[i]);
        System.out.println("\nPlease rate (on a scale of 1 to 10) the current issues listed above");

        int i, j;
        for (i = 0; i < nrRespondents; i++) {
            System.out.println("\n" + (i + 1) + " person, it's your turn to vote.");
            for (j = 0; j < problems.length; j++) {
                System.out.println("\nLet's rate " + (problems[j]) + ": ");
                marks[j][i] = putMarks();
            }
        }
        System.out.println();
    }
     void displayStatistics() {
        int sum, avg;
        int max, min;
        int gmax = 0;
        int gmin = 101;
        int currentMinIssue = 0;
        int currentMaxIssue = 0;

        System.out.print("Issue Type\t\t\t\t");
        for (int i = 0; i < nrRespondents; i++) System.out.print("\tP" + (i + 1));
         System.out.print("\t\tNr. marks\t\tAvg\t\tSum\t\tMin\t\tMax\n");

         for (int i = 0; i < marks.length; i++) {
            sum = 0;
            max = min = marks[0][0];
            System.out.print(problems[i] + "\t\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                sum += marks[i][j];
                if (marks[i][j] < min) min = marks[i][j];
                if (marks[i][j] > max) max = marks[i][j];
             }
            avg = sum / marks[i].length;

             System.out.print("\t\t" + marks[i].length + "\t\t\t" + avg + "\t\t" + sum + "\t\t" + min + "\t\t" + max + "\n");


            if (sum < gmin) {
                gmin = sum;
                currentMinIssue = i;
            }

            if (sum > gmax) {
                gmax = sum;
                currentMaxIssue = i;
            }
        }
        System.out.println();
        System.out.println("Minimum sum is : " + gmin + ". The least important is issue: " + problems[currentMinIssue]);
        System.out.println("Maximum sum is : " + gmax + ". The most important is issue: " + problems[currentMaxIssue]);
           }
    }


