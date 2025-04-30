package com.bytedance.adsdk.lottie.KS;

/* loaded from: classes.dex */
public class HWF {
    private final String KS;
    public final float lMd;
    public final float zp;

    public HWF(String str, float f9, float f10) {
        this.KS = str;
        this.lMd = f10;
        this.zp = f9;
    }

    public boolean zp(String str) {
        if (this.KS.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.KS.endsWith("\r")) {
            String str2 = this.KS;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
