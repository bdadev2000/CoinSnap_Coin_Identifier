package com.glority.imagepicker.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public class TimeUtils {
    public static String timeFormat(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static String formatPhotoDate(long j) {
        return timeFormat(j, "yyyy-MM-dd");
    }

    public static String formatPhotoDate(String str) {
        File file = new File(str);
        if (file.exists()) {
            return formatPhotoDate(file.lastModified());
        }
        return "1970-01-01";
    }
}
