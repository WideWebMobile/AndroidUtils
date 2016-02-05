package com.wideweb.utils;

import android.content.Context;
import android.widget.Toast;

public class WWMessagesUtils
{
    public static void showMessageToast(Context context, String msg)
    {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
