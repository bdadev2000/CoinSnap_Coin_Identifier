package com.bytedance.sdk.component.adexpress.jU;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class lMd {
    public static boolean zp(Context context) {
        if (context == null || TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) != 1 || (context.getApplicationInfo().flags & 4194304) != 4194304) {
            return false;
        }
        return true;
    }
}
