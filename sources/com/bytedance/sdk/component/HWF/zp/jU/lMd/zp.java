package com.bytedance.sdk.component.HWF.zp.jU.lMd;

/* loaded from: classes.dex */
public class zp {
    private int lMd;
    private int zp;

    public zp(int i9, int i10, long j7) {
        if (i10 >= i9) {
            this.zp = i9;
            this.lMd = i10;
            return;
        }
        throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
    }

    public static zp COT() {
        return new zp(3, 100, 172800000L);
    }

    public static zp KS() {
        return new zp(1, 100, 172800000L);
    }

    public static zp jU() {
        return new zp(1, 100, -1L);
    }

    public int lMd() {
        return this.lMd;
    }

    public int zp() {
        return this.zp;
    }
}
