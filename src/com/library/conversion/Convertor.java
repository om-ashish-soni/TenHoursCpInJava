package com.library.conversion;

import java.util.ArrayList;

public class Convertor {
    public static  <T extends Number> long[] toLongArray(ArrayList<T> lst){
        return lst.stream().mapToLong((num)->{
            return num.longValue();
        }).toArray();
    }
    public static <T extends Number> int[] toIntArray(ArrayList<T> lst){
        return lst.stream().mapToInt((num)->{
            return num.intValue();
        }).toArray();
    }
}
