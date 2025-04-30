package com.bytedance.adsdk.lottie.KS;

import com.bytedance.adsdk.lottie.KS.lMd.KVG;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;
import x0.AbstractC2914a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class jU {
    private final String COT;
    private final String HWF;
    private final double KS;
    private final double jU;
    private final char lMd;
    private final List<KVG> zp;

    public jU(List<KVG> list, char c9, double d2, double d9, String str, String str2) {
        this.zp = list;
        this.lMd = c9;
        this.KS = d2;
        this.jU = d9;
        this.COT = str;
        this.HWF = str2;
    }

    public static int zp(char c9, String str, String str2) {
        return str2.hashCode() + AbstractC2914a.b(c9 * 31, 31, str);
    }

    public int hashCode() {
        return zp(this.lMd, this.HWF, this.COT);
    }

    public double lMd() {
        return this.jU;
    }

    public List<KVG> zp() {
        return this.zp;
    }
}
