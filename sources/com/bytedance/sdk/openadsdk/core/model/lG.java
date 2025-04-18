package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes.dex */
public class lG {
    private long YFl = 10000;
    private long Sg = 10000;
    private long tN = 10;
    private long AlY = 20;
    private String wN = "";

    public long AlY() {
        return this.AlY;
    }

    public long Sg() {
        return this.Sg;
    }

    public long YFl() {
        return this.YFl;
    }

    public long tN() {
        return this.tN;
    }

    public String wN() {
        return this.wN;
    }

    public void AlY(long j3) {
        if (j3 < 0) {
            this.AlY = 20L;
        } else {
            this.AlY = j3;
        }
    }

    public void Sg(long j3) {
        if (j3 < 0) {
            this.Sg = 20L;
        } else {
            this.Sg = j3;
        }
    }

    public void YFl(long j3) {
        if (j3 <= 0) {
            this.YFl = 10L;
        } else {
            this.YFl = j3;
        }
    }

    public void tN(long j3) {
        if (j3 <= 0) {
            this.tN = 10L;
        } else {
            this.tN = j3;
        }
    }

    public void YFl(String str) {
        this.wN = str;
    }
}
