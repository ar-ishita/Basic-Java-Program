package com.work.is.Arrays;

public class FindDistinctElementProgram {

    public static int countCommonElements(int N, int[][] M) {
        // Assuming elements range from 1 to maxElement.
        // This range should be adjusted based on the problem's constraints.
        int maxElement = 1000;
        int[] count = new int[maxElement + 1];

        // First, mark all elements in the first row.
        for (int j = 0; j < N; j++) {
            count[M[0][j]] = 1;
            System.out.println( count[M[0][j]]);
        }

        // For remaining rows, only increment the count for elements that
        // were also found in previous rows (count > 0), but only once per row.
        for (int i = 1; i < N; i++) {
            boolean[] seenInThisRow = new boolean[maxElement + 1];
            for (int j = 0; j < N; j++) {
                if (count[M[i][j]] == i && !seenInThisRow[M[i][j]]) {
                    System.out.println("\nBefors : " +count[M[i][j]]);
                    count[M[i][j]]++;
                    System.out.print("After: " +count[M[i][j]]);
                    seenInThisRow[M[i][j]] = true;
                }
            }
        }

        // Count how many elements have a count equal to N.
        int commonElementsCount = 0;
        for (int i = 0; i <= maxElement; i++) {
            if (count[i] == N) {
                commonElementsCount++;
            }
        }

        return commonElementsCount;
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] M = {
                {2, 1, 4, 3},
                {1, 2, 3, 2},
                {3, 6, 2, 3},
                {5, 2, 5, 3}
        };

        System.out.println(countCommonElements(N, M));  // Output: 2
    }
}
