package com.bytedance.sdk.component.KS.zp;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class zp {
    long COT;
    long HWF;
    long KS;
    long QR;
    long jU;
    long ku;
    long lMd;
    long zp = SystemClock.elapsedRealtime();

    public void Bj() {
        this.QR = SystemClock.elapsedRealtime();
    }

    public void COT() {
        this.HWF = SystemClock.elapsedRealtime();
    }

    public long HWF() {
        return this.HWF;
    }

    public void KS() {
        this.COT = SystemClock.elapsedRealtime();
    }

    public long QR() {
        return this.KS;
    }

    public long YW() {
        return this.COT;
    }

    public void dQp() {
        this.lMd = SystemClock.elapsedRealtime();
    }

    public long dT() {
        return this.QR;
    }

    public long jU() {
        return this.zp;
    }

    public long ku() {
        return this.jU;
    }

    public void lMd() {
        this.jU = SystemClock.elapsedRealtime();
    }

    public long rV() {
        return this.lMd;
    }

    public void tG() {
        this.ku = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.zp + ", asyncCallExecTs=" + this.lMd + ", requestStartExecTs=" + this.KS + ", requestConnectStartTs=" + this.jU + ", requestConnectFinishTs=" + this.COT + ", reqCallServerStartTs=" + this.QR + ", reqCallServerFinishTs=" + this.ku + '}';
    }

    public long vDp() {
        return this.ku;
    }

    public void zp() {
        this.KS = SystemClock.elapsedRealtime();
    }
}
