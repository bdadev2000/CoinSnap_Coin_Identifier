package com.bytedance.adsdk.Sg.tN;

/* loaded from: classes.dex */
public class vc {
    public final float Sg;
    public final float YFl;
    private final String tN;

    public vc(String str, float f10, float f11) {
        this.tN = str;
        this.Sg = f11;
        this.YFl = f10;
    }

    public boolean YFl(String str) {
        if (this.tN.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.tN.endsWith("\r")) {
            String str2 = this.tN;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
