package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class QR implements Comparable<QR> {
    private String COT;
    private final int HWF;
    private final int KS;
    private final int QR;
    private final int jU;
    private final String ku;
    private final String lMd;
    private final String zp;

    public QR(String str, String str2, int i9, int i10, String str3, int i11, int i12, String str4) {
        this.zp = str;
        this.lMd = str2;
        this.KS = i9;
        this.jU = i10;
        this.COT = str3;
        if (TextUtils.isEmpty(str3)) {
            this.COT = "0";
        }
        this.HWF = i11;
        this.QR = i12;
        this.ku = str4;
    }

    public int zp() {
        return this.HWF;
    }

    @Override // java.lang.Comparable
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public int compareTo(QR qr) {
        if (this.HWF < qr.zp()) {
            return -1;
        }
        return this.HWF == qr.zp() ? 0 : 1;
    }
}
