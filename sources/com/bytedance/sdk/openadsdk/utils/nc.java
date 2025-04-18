package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import k5.d;
import vd.e;

/* loaded from: classes.dex */
public class nc {
    private static String YFl;

    public static String YFl() {
        if (TextUtils.isEmpty(YFl)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d.a.getCacheDir());
            YFl = e.h(sb2, File.separator, "proxy_cache");
        }
        return YFl;
    }

    public static void YFl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }
}
