package com.bytedance.sdk.component.vc.YFl.AlY.Sg;

/* loaded from: classes.dex */
public class YFl {
    private int Sg;
    private int YFl;

    public YFl(int i10, int i11, long j3) {
        if (i11 >= i10) {
            this.YFl = i10;
            this.Sg = i11;
            return;
        }
        throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
    }

    public static YFl AlY() {
        return new YFl(1, 100, -1L);
    }

    public static YFl tN() {
        return new YFl(1, 100, 172800000L);
    }

    public static YFl wN() {
        return new YFl(3, 100, 172800000L);
    }

    public int Sg() {
        return this.Sg;
    }

    public int YFl() {
        return this.YFl;
    }
}
