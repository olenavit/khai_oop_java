package com.ua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int lengthOfArray = sc.nextInt();
        int[] inputArray = new int[lengthOfArray];
        for(int i =0; i<inputArray.length; i++){
            inputArray[i]=sc.nextInt();
        }
        int numOfNumbers = sc.nextInt();
        String[] arraySum= new String[numOfNumbers];
        for(int i =0; i< numOfNumbers; i++){
            int x1= sc.nextInt();
            int x2= sc.nextInt();
            if(x1<0||x1>=inputArray.length||x2<0||x2>=inputArray.length){
                arraySum[i]="Error";
            }
            else arraySum[i]= Integer.toString(inputArray[x1]+inputArray[x2]);
        }
        for(int i = 0; i<arraySum.length; i++){
                System.out.println(arraySum[i]);
        }
    }
}