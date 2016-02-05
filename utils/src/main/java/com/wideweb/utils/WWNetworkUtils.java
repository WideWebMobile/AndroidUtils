package com.wideweb.utils;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class WWNetworkUtils
{
    public static boolean isNetworkAvailable(Context context)
    {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null)
        {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
            {
                return true;
            }
            else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
            {
                return true;
            }

            return false;
        }
        else
        {
            return false;
        }
    }
}
