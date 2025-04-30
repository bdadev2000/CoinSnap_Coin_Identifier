package com.bytedance.sdk.component.HWF.zp.HWF;

import com.bytedance.sdk.component.HWF.zp.ku;

/* loaded from: classes.dex */
public class zp {
    private static volatile lMd zp;

    public static lMd zp() {
        if (zp == null) {
            synchronized (lMd.class) {
                try {
                    if (zp == null) {
                        zp = new KS(ku.QR().HWF(), new HWF(ku.QR().HWF()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }
}
