package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes.dex */
public class KVG {
    private long zp = 10000;
    private long lMd = 10000;
    private long KS = 10;
    private long jU = 20;
    private String COT = "";

    public String COT() {
        return this.COT;
    }

    public long KS() {
        return this.KS;
    }

    public long jU() {
        return this.jU;
    }

    public long lMd() {
        return this.lMd;
    }

    public long zp() {
        return this.zp;
    }

    public void KS(long j7) {
        if (j7 <= 0) {
            this.KS = 10L;
        } else {
            this.KS = j7;
        }
    }

    public void jU(long j7) {
        if (j7 < 0) {
            this.jU = 20L;
        } else {
            this.jU = j7;
        }
    }

    public void lMd(long j7) {
        if (j7 < 0) {
            this.lMd = 20L;
        } else {
            this.lMd = j7;
        }
    }

    public void zp(long j7) {
        if (j7 <= 0) {
            this.zp = 10L;
        } else {
            this.zp = j7;
        }
    }

    public void zp(String str) {
        this.COT = str;
    }
}
