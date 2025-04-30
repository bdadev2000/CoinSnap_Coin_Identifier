package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class cW {
    private long lMd;
    public long zp;

    private cW(boolean z8) {
        if (z8) {
            jU();
        }
    }

    public static cW lMd() {
        return new cW(false);
    }

    public static cW zp() {
        return new cW(true);
    }

    public boolean COT() {
        if (this.lMd > 0) {
            return true;
        }
        return false;
    }

    public long KS() {
        return SystemClock.elapsedRealtime() - this.lMd;
    }

    public void jU() {
        this.zp = System.currentTimeMillis();
        this.lMd = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return String.valueOf(this.zp);
    }

    public long zp(cW cWVar) {
        return Math.abs(cWVar.lMd - this.lMd);
    }
}
