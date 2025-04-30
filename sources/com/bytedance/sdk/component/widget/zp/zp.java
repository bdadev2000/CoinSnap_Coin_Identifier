package com.bytedance.sdk.component.widget.zp;

/* loaded from: classes.dex */
public class zp {
    private static volatile zp lMd;
    private volatile lMd zp;

    private zp() {
    }

    public static zp zp() {
        if (lMd == null) {
            synchronized (zp.class) {
                try {
                    if (lMd == null) {
                        lMd = new zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    public lMd lMd() {
        return this.zp;
    }

    public void zp(lMd lmd) {
        this.zp = lmd;
    }
}
