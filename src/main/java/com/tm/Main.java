package com.tm;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < arr.length; i++) {
            String str = strArr[i];
            int val = Integer.parseInt(str);
            arr[i] = val;
        }

        int min = 0;
        int max = 0;
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        min = arr[0];
        System.out.println("Msx: " + max);
        System.out.println("Min: " + min);

    }
}
