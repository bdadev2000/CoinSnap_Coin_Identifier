package com.bytedance.sdk.openadsdk.dT.zp;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;

/* loaded from: classes.dex */
public class zp {
    private boolean COT;
    private String HWF;
    private String KS;
    private int QR;
    private int jU;
    private woN lMd;
    private String zp;
    private int ku = 0;
    private int YW = 0;

    public boolean COT() {
        return this.COT;
    }

    public String HWF() {
        return this.HWF;
    }

    public String KS() {
        woN won;
        if (TextUtils.isEmpty(this.KS) && (won = this.lMd) != null) {
            this.KS = YhE.zp(won);
        }
        return this.KS;
    }

    public int QR() {
        return this.QR;
    }

    public int YW() {
        return this.YW;
    }

    public int jU() {
        return this.jU;
    }

    public int ku() {
        return this.ku;
    }

    public woN lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void jU(int i9) {
        this.YW = i9;
    }

    public void lMd(String str) {
        this.KS = str;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void lMd(int i9) {
        this.QR = i9;
    }

    public void zp(woN won) {
        this.lMd = won;
    }

    public void zp(int i9) {
        this.jU = i9;
    }

    public void KS(String str) {
        this.HWF = str;
    }

    public void zp(boolean z8) {
        this.COT = z8;
    }

    public void KS(int i9) {
        this.ku = i9;
    }
}
