package com.bykv.vk.openvk.preload.a.b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j {
    public static DateFormat a(int i9, int i10) {
        return new SimpleDateFormat(a(i9) + " " + b(i10), Locale.US);
    }

    private static String b(int i9) {
        if (i9 != 0 && i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i9)));
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    private static String a(int i9) {
        if (i9 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i9 == 1) {
            return "MMMM d, yyyy";
        }
        if (i9 == 2) {
            return "MMM d, yyyy";
        }
        if (i9 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i9)));
    }
}
