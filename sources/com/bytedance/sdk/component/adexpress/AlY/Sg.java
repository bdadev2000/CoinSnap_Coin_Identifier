package com.bytedance.sdk.component.adexpress.AlY;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class Sg {
    public static boolean YFl(Context context) {
        boolean z10;
        if (context == null) {
            return false;
        }
        if (TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (context.getApplicationInfo().flags & 4194304) != 4194304) {
            return false;
        }
        return true;
    }
}
