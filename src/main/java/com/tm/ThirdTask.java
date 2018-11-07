package com.tm;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix;
        matrix = new int[4][4];

        for(int i = 0; i < 4; i++){
            String[] strArr = scanner.nextLine().split(" ");
            for(int j = 0; j < 4; j++){
                matrix[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        System.out.println("Max: " + getMaxValue(matrix));
        System.out.println("Min: " + getMinValue(matrix));
    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue ) {
                    minValue = numbers[j][i];
                }
            }
        }
        return minValue;
    }
}
