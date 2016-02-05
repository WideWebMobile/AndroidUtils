package com.wideweb.utils;


import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Log;

public class WWResourceUtils
{
    public static final String TAG = WWResourceUtils.class.getSimpleName();

    public static Typeface getTypeface(Context context, String path) // path sample - "icomoon.ttf"
    {
        Typeface typeface = null;
        if(context != null){
            typeface = Typeface.createFromAsset(context.getAssets(), path);
        }
        return typeface;
    }

    public static TypedArray getTypedArrayResource(Context context, int resID) {
        TypedArray typedArray = null;
        try
        {
            if(context != null)
            {
                try
                {
                    typedArray = context.getResources().obtainTypedArray(resID);
                }
                catch (Resources.NotFoundException e)
                {
                    Log.e(TAG, "getAppResources Resources.NotFoundException", e);
                }
            }
        }
        catch (Exception e)
        {
            Log.e(TAG, "getTypedArrayResource Exception", e);
        }
        return typedArray;
    }

    public static String[] getStringArray(Context context, int arrayResId) {
        return context.getResources().getStringArray(arrayResId);
    }

    public static int[] getIntArray(Context context, int arrayResId) {
        return context.getResources().getIntArray(arrayResId);
    }

    public static Bitmap getBitmapByResourceID(Context context, int resID) {
        return BitmapFactory.decodeResource(context.getResources(), resID);
    }


}
