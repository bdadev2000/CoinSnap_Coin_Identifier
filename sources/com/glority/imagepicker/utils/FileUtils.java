package com.glority.imagepicker.utils;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;

/* loaded from: classes6.dex */
public class FileUtils {
    private static final String JPEG_FILE_PREFIX = "IMG_";
    private static final String JPEG_FILE_SUFFIX = ".jpg";
    private static String TEMP_FOLDER = ".temp";

    public static Uri createEmptyUri(Context context) {
        String str = JPEG_FILE_PREFIX + System.currentTimeMillis() + JPEG_FILE_SUFFIX;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", MimeTypes.IMAGE_JPEG);
        contentValues.put(Args.title, str);
        return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    public static File getTmepDir(Context context) {
        File cacheDir;
        if (Environment.getExternalStorageState().equals("mounted")) {
            cacheDir = context.getExternalCacheDir();
        } else {
            cacheDir = context.getCacheDir();
        }
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, TEMP_FOLDER);
        if (file.exists()) {
            return file;
        }
        file.mkdir();
        return file;
    }
}
