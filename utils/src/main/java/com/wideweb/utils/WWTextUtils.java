package com.wideweb.utils;


import android.content.Context;
import android.graphics.Typeface;

import java.text.DecimalFormat;

public class WWTextUtils
{
    public static Typeface getTypeface(Context context, String path) // path sample - "icomoon.ttf"
    {
        return Typeface.createFromAsset(context.getAssets(), path);
    }


    public static String get2Decimal(double dbl)
    {
        return new DecimalFormat("##,##0.00").format(dbl).replace('.', ' ');
    }
}
