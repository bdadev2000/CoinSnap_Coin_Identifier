package com.bytedance.sdk.component.HWF.zp.zp.zp;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.HWF.zp.zp.zp.lMd;

/* loaded from: classes.dex */
public class zp extends lMd {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile zp zp;

    private zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.lMd
    public /* bridge */ /* synthetic */ lMd.C0075lMd zp() {
        return super.zp();
    }

    public static zp zp(Context context) {
        if (zp == null) {
            synchronized (zp.class) {
                try {
                    if (zp == null) {
                        zp = new zp(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }
}
