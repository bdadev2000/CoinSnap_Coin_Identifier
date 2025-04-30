package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.cW;

/* loaded from: classes.dex */
public class ot {
    private int Bj;
    private long COT;
    private long HWF;
    private long QR;
    private long YW;
    private long dT;
    private long ku;
    public long lMd;
    public boolean zp;
    private cW KS = cW.lMd();
    private cW jU = cW.lMd();

    public long COT() {
        return this.ku;
    }

    public long HWF() {
        return this.YW;
    }

    public long KS() {
        return this.HWF;
    }

    public long QR() {
        return this.dT;
    }

    public long jU() {
        return this.QR;
    }

    public int ku() {
        return this.Bj;
    }

    public void lMd(cW cWVar) {
        this.jU = cWVar;
        this.YW = cWVar.zp(this.KS);
    }

    public void zp(cW cWVar, cW cWVar2, int i9, cW cWVar3) {
        this.COT = cWVar.zp(this.KS);
        this.HWF = cWVar2.zp(cWVar);
        this.QR = i9;
        this.ku = cWVar3.zp(cWVar2);
    }

    public long lMd() {
        return this.COT;
    }

    public void zp(cW cWVar) {
        this.KS = cWVar;
    }

    public cW zp() {
        return this.KS;
    }

    public void zp(long j7) {
        this.dT = j7;
    }

    public void zp(int i9) {
        this.Bj = i9;
    }
}
