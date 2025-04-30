package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.HWF;

/* loaded from: classes.dex */
public class COT extends HWF {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile COT zp;

    private COT(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.HWF
    public /* bridge */ /* synthetic */ HWF.KS zp() {
        return super.zp();
    }

    public static COT zp(Context context) {
        if (zp == null) {
            synchronized (COT.class) {
                try {
                    if (zp == null) {
                        zp = new COT(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }
}
