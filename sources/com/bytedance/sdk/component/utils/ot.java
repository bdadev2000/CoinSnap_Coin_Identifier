package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class ot {
    private static volatile String zp;

    public static String zp() {
        if (!TextUtils.isEmpty(zp)) {
            return zp;
        }
        String str = Build.MODEL;
        zp = str;
        return str;
    }
}
