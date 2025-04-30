package com.bytedance.adsdk.lottie;

import android.graphics.Bitmap;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* loaded from: classes.dex */
public class YW {
    private final String COT;
    private Bitmap HWF;
    private final String KS;
    private final String jU;
    private final int lMd;
    private final int zp;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public YW(int i9, int i10, String str, String str2, String str3) {
        this.zp = i9;
        this.lMd = i10;
        this.KS = str;
        this.jU = str2;
        this.COT = str3;
    }

    public String COT() {
        return this.COT;
    }

    public Bitmap HWF() {
        return this.HWF;
    }

    public String KS() {
        return this.KS;
    }

    public String jU() {
        return this.jU;
    }

    public int lMd() {
        return this.lMd;
    }

    public int zp() {
        return this.zp;
    }

    public void zp(Bitmap bitmap) {
        this.HWF = bitmap;
    }
}
