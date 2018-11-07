package com.tm;

import java.util.Scanner;
import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < arr.length; i++) {
            String str = strArr[i];
            int val = Integer.parseInt(str);
            arr[i] = val;
        }

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
