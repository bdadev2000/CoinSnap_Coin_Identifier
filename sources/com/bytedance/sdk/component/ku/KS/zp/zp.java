package com.bytedance.sdk.component.ku.KS.zp;

import android.text.TextUtils;
import com.bytedance.sdk.component.ku.KS.lMd;

/* loaded from: classes.dex */
public class zp {
    private long COT;
    private long HWF;
    private long KS;
    private long jU;
    private int lMd = 0;
    private String zp;

    public long COT() {
        return this.COT;
    }

    public long HWF() {
        return this.HWF;
    }

    public long KS() {
        return this.KS;
    }

    public long jU() {
        return this.jU;
    }

    public int lMd() {
        return this.lMd;
    }

    public String toString() {
        return this.zp + " times=" + this.lMd + ",waitMaxTime=" + this.COT + ",runMaxTime=" + this.HWF + ",runTotalTime=" + this.jU + ",waitTotalTime=" + this.KS;
    }

    public String zp() {
        return this.zp;
    }

    public void zp(lMd lmd) {
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(this.zp)) {
                    this.zp = lmd.lMd();
                }
                this.KS += lmd.HWF();
                this.jU += lmd.QR();
                this.COT = Math.max(this.COT, lmd.HWF());
                this.HWF = Math.max(this.HWF, lmd.QR());
                this.lMd++;
            } catch (Throwable th) {
                throw th;
            }
        }
        lmd.HWF();
        lmd.QR();
        toString();
    }
}
