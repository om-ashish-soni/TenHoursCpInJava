package com.library.algo;

import java.util.Arrays;

public class BinarySearch {
    public static int lowerBound(int num[],int key){
        int index= Arrays.binarySearch(num,key);
        if(index>=0) return index;
        return Math.abs(index+1);
    }
    public static int lowerBound(long num[],long key){
        int index= Arrays.binarySearch(num,key);
        if(index>=0) return index;
        return Math.abs(index+1);
    }
    public static <T> int lowerBound(double num[],double key){
        int index= Arrays.binarySearch(num,key);
        if(index>=0) return index;
        return Math.abs(index+1);
    }
    public static <T> int lowerBound(float num[],float key){
        int index= Arrays.binarySearch(num,key);
        if(index>=0) return index;
        return Math.abs(index+1);
    }
    public static <T> int lowerBound(char num[],char key){
        int index= Arrays.binarySearch(num,key);
        if(index>=0) return index;
        return Math.abs(index+1);
    }
    public static <T> int lowerBound(T num[],T key){
        int index= Arrays.binarySearch(num,key);
        if(index>=0) return index;
        return Math.abs(index+1);
    }
}
