package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class zB {
    private long Sg;
    public long YFl;

    private zB(boolean z10) {
        if (z10) {
            AlY();
        }
    }

    public static zB Sg() {
        return new zB(false);
    }

    public static zB YFl() {
        return new zB(true);
    }

    public void AlY() {
        this.YFl = System.currentTimeMillis();
        this.Sg = SystemClock.elapsedRealtime();
    }

    public long tN() {
        return SystemClock.elapsedRealtime() - this.Sg;
    }

    public String toString() {
        return String.valueOf(this.YFl);
    }

    public boolean wN() {
        return this.Sg > 0;
    }

    public long YFl(zB zBVar) {
        return Math.abs(zBVar.Sg - this.Sg);
    }
}
