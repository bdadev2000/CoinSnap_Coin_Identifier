package com.bytedance.sdk.openadsdk.VOe.YFl;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.pq;

/* loaded from: classes.dex */
public class vc {
    public static boolean YFl(View view, int i10) {
        return YFl(view, false, i10);
    }

    public static boolean YFl(View view, boolean z10, int i10) {
        if (view == null) {
            return false;
        }
        return pq.YFl(view, z10 ? 30 : 50, i10);
    }
}
