package com.bytedance.sdk.component.HWF.zp.HWF;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class jU {
    private boolean Bj;
    private final int COT;
    private final String HWF;
    private final boolean KS;
    private String QR;
    private String ku;
    private final String lMd;
    private final String zp;
    private int jU = -1;
    private int YW = 0;
    private String dT = null;

    public jU(String str, String str2, boolean z8, int i9, String str3) {
        this.zp = str;
        this.lMd = str2;
        this.KS = z8;
        this.COT = i9;
        this.HWF = str3;
    }

    public boolean Bj() {
        if (this.jU == -1) {
            return true;
        }
        return false;
    }

    public int COT() {
        return this.COT;
    }

    public String HWF() {
        return this.HWF;
    }

    public boolean KS() {
        return this.KS;
    }

    public String QR() {
        return this.QR;
    }

    public String YW() {
        return this.ku;
    }

    public boolean dT() {
        return this.Bj;
    }

    public int jU() {
        return this.jU;
    }

    public int ku() {
        return this.YW;
    }

    public String lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void KS(String str) {
        this.dT = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.ku)) {
            this.ku = String.valueOf(this.dT);
            return;
        }
        this.ku += "," + this.dT;
    }

    public void lMd(int i9) {
        this.YW = i9;
        if (i9 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.QR)) {
            this.QR = String.valueOf(this.YW);
            return;
        }
        this.QR += "," + this.YW;
    }

    public void zp(int i9) {
        this.jU = i9;
    }

    public void zp(String str) {
        this.QR = str;
    }

    public void zp(boolean z8) {
        this.Bj = z8;
    }

    public Runnable zp(String str, Map<String, String> map) {
        return zp.zp().zp(this, str, map);
    }

    public void lMd(String str) {
        this.ku = str;
    }
}
