package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class rV {
    private boolean COT;
    private String HWF;
    private int KS;
    private double jU;
    private int lMd;
    private String zp;

    public boolean COT() {
        if (!TextUtils.isEmpty(this.zp) && this.lMd > 0 && this.KS > 0) {
            return true;
        }
        return false;
    }

    public boolean HWF() {
        return this.COT;
    }

    public int KS() {
        return this.KS;
    }

    public String QR() {
        return this.HWF;
    }

    public double jU() {
        return this.jU;
    }

    public int lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void lMd(int i9) {
        this.KS = i9;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void lMd(String str) {
        this.HWF = str;
    }

    public void zp(int i9) {
        this.lMd = i9;
    }

    public void zp(boolean z8) {
        this.COT = z8;
    }
}
