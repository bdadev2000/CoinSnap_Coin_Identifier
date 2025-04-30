package com.bytedance.sdk.openadsdk.rV.zp;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.Lij;

/* loaded from: classes.dex */
public class HWF {
    public static boolean zp(View view, int i9) {
        return zp(view, false, i9);
    }

    public static boolean zp(View view, boolean z8, int i9) {
        if (view == null) {
            return false;
        }
        return Lij.zp(view, z8 ? 30 : 50, i9);
    }
}
