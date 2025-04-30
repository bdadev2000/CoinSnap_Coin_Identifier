package com.bytedance.sdk.component.ku.KS;

/* loaded from: classes.dex */
public abstract class lMd implements Comparable<lMd>, Runnable {
    private long COT;
    private long HWF;
    private Runnable KS;
    private long jU;
    private String lMd;
    private int zp;

    public lMd(String str) {
        this.zp = 5;
        this.lMd = str;
    }

    public long COT() {
        return this.HWF;
    }

    public long HWF() {
        return this.COT - this.jU;
    }

    public long KS() {
        return this.jU;
    }

    public long QR() {
        return this.HWF - this.COT;
    }

    public long jU() {
        return this.COT;
    }

    public Runnable ku() {
        return this.KS;
    }

    public String lMd() {
        return this.lMd;
    }

    public void zp(int i9) {
        this.zp = i9;
    }

    public void KS(long j7) {
        this.HWF = j7;
    }

    public void lMd(long j7) {
        this.COT = j7;
    }

    public int zp() {
        return this.zp;
    }

    @Override // java.lang.Comparable
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public int compareTo(lMd lmd) {
        if (zp() < lmd.zp()) {
            return 1;
        }
        return zp() >= lmd.zp() ? -1 : 0;
    }

    public lMd(int i9, String str) {
        this.zp = i9;
        this.lMd = str;
    }

    public void zp(long j7) {
        this.jU = j7;
    }

    public lMd(String str, Runnable runnable) {
        this.zp = 5;
        this.lMd = str;
        this.KS = runnable;
    }
}
