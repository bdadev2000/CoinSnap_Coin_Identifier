package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class dT {
    private static String zp;

    public static String zp() {
        if (TextUtils.isEmpty(zp)) {
            StringBuilder sb = new StringBuilder();
            sb.append(com.bykv.vk.openvk.component.video.api.KS.zp().getCacheDir());
            zp = AbstractC2914a.h(sb, File.separator, "proxy_cache");
        }
        return zp;
    }

    public static void zp(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
