package org.example.util;

import java.util.Arrays;

public class StringArrayUtils {

    public static boolean isNotPresent(String[] source, String value){
        for(String string : source){
            if(string.equalsIgnoreCase(value)){
                return false;
            }
        }
        return true;
    }

    public static String[] addToStringArray(String[] source, String value){
        String[] result = Arrays.copyOf(source, source.length +1);
        result[result.length-1] = value;
        return result;
    }

}
