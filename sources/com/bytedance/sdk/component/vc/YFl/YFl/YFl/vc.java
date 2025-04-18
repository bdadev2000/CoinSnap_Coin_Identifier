package com.bytedance.sdk.component.vc.YFl.YFl.YFl;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes.dex */
public class vc {
    public static String Sg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }

    public static String YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
