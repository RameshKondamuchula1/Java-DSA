package org.java.dsa.arrays.problems;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] validBoard = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] invalidBoard = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(" Is valid Sudoku: " + validSudoku(validBoard));

        System.out.println(" Is valid Sudoku: " + validSudoku(invalidBoard));
    }

    static boolean validSudoku(char[][] sudoku) {
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for(int i=0; i<9;i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }

        for(int i=0; i<9;i++) {
            for(int j=0; j<9;j++) {
                int gridNumber = j/3 + ((i/3)*3);
                if(sudoku[i][j] != '.') {
                    boolean isRowPresent = rowSet[i].contains(sudoku[i][j]);
                    boolean isColPresent = colSet[j].contains(sudoku[i][j]);
                    boolean isGridPresent = gridSet[gridNumber].contains(sudoku[i][j]);
                    if(isRowPresent || isColPresent || isGridPresent) {
                        return false;
                    }
                }
                rowSet[i].add(sudoku[i][j]);
                colSet[j].add(sudoku[i][j]);
                gridSet[gridNumber].add(sudoku[i][j]);
            }
        }
        return true;
    }
}
