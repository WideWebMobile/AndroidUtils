package com.wideweb.utils;


import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

public class WWViewUtils
{
    public static void removeGlobalListeners(View target, ViewTreeObserver.OnGlobalLayoutListener listener)
    {
        if(Build.VERSION.SDK_INT > 16)
            target.getViewTreeObserver().removeOnGlobalLayoutListener(listener);
        else
            target.getViewTreeObserver().removeGlobalOnLayoutListener(listener);
    }
}
