package com.wideweb.utils;


import android.os.Environment;
import android.util.Log;

import java.io.File;

public class WWFileUtils
{
    public static final String TAG = WWFileUtils.class.getSimpleName();

    public static boolean deleteFile(File file)
    {
        boolean fileDeleted = false;
        try
        {
            if(file != null && file.exists())
            {
                fileDeleted = file.delete();
            }
        }
        catch (Exception e)
        {
            Log.e(TAG, "deleteFile Exception", e);
        }
        return fileDeleted;
    }

    public static String getFileNameFromURL(String url)
    {
        if(url != null && !url.isEmpty()){
            return url.substring(url.lastIndexOf('/') + 1, url.length());
        }
        return "unnamed";
    }

    public static boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }

    public boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state);
    }
}
