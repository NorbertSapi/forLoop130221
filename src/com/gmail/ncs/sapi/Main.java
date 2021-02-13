/*
This is a small project to practise for loop in java.
SOLVE THE PROBLEM! Issue: create a for loop to iterate 1-1000. Return the first 5 numbers which could be divided by 3
and 5.
*/

package com.gmail.ncs.sapi;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // create variables
        int count = 0;
        int sum = 0;

    // for loop to count 1 - 1000
        for(int i = 1; i < 100; i++) {
            // condition % 3 and % 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                System.out.println("number = " + i);
                sum += i;
            }
            //condition if 5 counts
            if(count == 5){
                break;
            }
        }
    System.out.println(sum);
    }
}
/*

PSEUDO CODE - CounterApp                                            count       number
    for loop -> number +1                                   1.          0           0
        int count = 0                                       2.          0           0
        if number -> TRUE             -> %3 && %5           3.          0           0
            for loop -> count +1                            4.          1           15
                if count < 5          -> count < 5          5.          1           15
                    break                                   6.          1           15
*/
