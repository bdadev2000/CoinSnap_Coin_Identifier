package com.bytedance.sdk.component.HWF.zp.zp.zp;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes.dex */
public class HWF {
    public static String lMd(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }

    public static String zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
