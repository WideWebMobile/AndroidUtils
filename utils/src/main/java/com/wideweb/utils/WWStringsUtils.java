package com.wideweb.utils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;


public class WWStringsUtils
{
    public static String get2Decimal(double dbl)
    {
        return new DecimalFormat("##,##0.00").format(dbl).replace('.', ' ');
    }

    public static ArrayList<String> convertStringArrayToArrayList(String[] stringArray) {
        if(stringArray != null && stringArray.length > 0){
            return new ArrayList<>(Arrays.asList(stringArray));
        }else{
            return null;
        }
    }
}
