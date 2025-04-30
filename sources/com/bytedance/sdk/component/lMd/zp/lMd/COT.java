package com.bytedance.sdk.component.lMd.zp.lMd;

import androidx.fragment.app.FragmentTransaction;

/* loaded from: classes.dex */
final class COT {
    boolean COT;
    COT HWF;
    int KS;
    COT QR;
    boolean jU;
    int lMd;
    final byte[] zp;

    public COT() {
        this.zp = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        this.COT = true;
        this.jU = false;
    }

    public final COT lMd() {
        COT cot;
        COT cot2 = this.HWF;
        if (cot2 != this) {
            cot = cot2;
        } else {
            cot = null;
        }
        COT cot3 = this.QR;
        if (cot3 != null) {
            cot3.HWF = cot2;
        }
        COT cot4 = this.HWF;
        if (cot4 != null) {
            cot4.QR = cot3;
        }
        this.HWF = null;
        this.QR = null;
        return cot;
    }

    public final COT zp() {
        this.jU = true;
        return new COT(this.zp, this.lMd, this.KS, true, false);
    }

    public final COT zp(COT cot) {
        cot.QR = this;
        cot.HWF = this.HWF;
        this.HWF.QR = cot;
        this.HWF = cot;
        return cot;
    }

    public COT(byte[] bArr, int i9, int i10, boolean z8, boolean z9) {
        this.zp = bArr;
        this.lMd = i9;
        this.KS = i10;
        this.jU = z8;
        this.COT = z9;
    }
}
