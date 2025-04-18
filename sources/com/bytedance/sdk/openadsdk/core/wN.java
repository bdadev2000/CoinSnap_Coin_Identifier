package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.vc;

/* loaded from: classes.dex */
public class wN extends vc {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile wN YFl;

    private wN(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.vc
    public /* bridge */ /* synthetic */ vc.tN YFl() {
        return super.YFl();
    }

    public static wN YFl(Context context) {
        if (YFl == null) {
            synchronized (wN.class) {
                if (YFl == null) {
                    YFl = new wN(context);
                }
            }
        }
        return YFl;
    }
}
