package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class wXo {
    private static volatile String YFl;

    public static String YFl() {
        if (!TextUtils.isEmpty(YFl)) {
            return YFl;
        }
        String str = Build.MODEL;
        YFl = str;
        return str;
    }
}
