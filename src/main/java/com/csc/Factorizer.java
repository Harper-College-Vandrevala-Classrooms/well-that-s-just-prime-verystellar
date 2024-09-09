package com.csc;
import java.util.ArrayList;

public class Factorizer {

ArrayList<Integer> nums = new ArrayList<Integer>();
int idx = 0;
int prime = 2;
public ArrayList exampleMethod(int someArgument) {
    if(prime<=someArgument){
        if(someArgument%prime==0){
            nums.add(prime);
            exampleMethod(someArgument/prime);
        }
        else{
            prime++;
            exampleMethod(someArgument);
        }
    }
        return nums;
}
}
