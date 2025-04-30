package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;

/* loaded from: classes.dex */
public class cz {
    public static String zp(Context context) {
        int zp = com.bytedance.sdk.component.utils.yRU.zp(context, 0L);
        if (zp != 2) {
            if (zp != 3) {
                if (zp != 4) {
                    if (zp != 5) {
                        if (zp != 6) {
                            return "mobile";
                        }
                        return "5g";
                    }
                    return "4g";
                }
                return "wifi";
            }
            return "3g";
        }
        return "2g";
    }
}
