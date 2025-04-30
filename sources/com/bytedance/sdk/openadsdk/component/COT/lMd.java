package com.bytedance.sdk.openadsdk.component.COT;

import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class lMd {
    private String COT;
    private boolean HWF;
    private woN KS;
    private int jU;
    private int lMd;
    private int zp;

    public lMd(int i9, int i10, woN won) {
        this.zp = i9;
        this.lMd = i10;
        this.KS = won;
    }

    public int COT() {
        return this.jU;
    }

    public String HWF() {
        return this.COT;
    }

    public int KS() {
        return this.lMd;
    }

    public woN jU() {
        return this.KS;
    }

    public int lMd() {
        return this.zp;
    }

    public void zp(boolean z8) {
        this.HWF = z8;
    }

    public boolean zp() {
        return this.HWF;
    }

    public lMd(int i9, int i10, int i11, String str) {
        this.zp = i9;
        this.lMd = i10;
        this.jU = i11;
        this.COT = str;
    }
}
