package com.bytedance.adsdk.lottie.KS;

import android.graphics.Typeface;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class KS {
    private Typeface COT;
    private final String KS;
    private final float jU;
    private final String lMd;
    private final String zp;

    public KS(String str, String str2, String str3, float f9) {
        this.zp = str;
        this.lMd = str2;
        this.KS = str3;
        this.jU = f9;
    }

    public String KS() {
        return this.KS;
    }

    public Typeface jU() {
        return this.COT;
    }

    public String lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void zp(Typeface typeface) {
        this.COT = typeface;
    }
}
