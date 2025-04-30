package com.bytedance.sdk.component.HWF.zp.zp.zp;

import com.bytedance.sdk.component.HWF.zp.ku;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class QR {
    public static String zp = "com.bytedance.openadsdk";
    public static String lMd = AbstractC2914a.h(new StringBuilder("content://"), zp, ".TTMultiProvider");

    static {
        zp();
    }

    public static void zp() {
        if (ku.QR().HWF() != null) {
            zp = ku.QR().HWF().getPackageName();
            lMd = AbstractC2914a.h(new StringBuilder("content://"), zp, ".TTMultiProvider");
        }
    }
}
