package com.bytedance.sdk.component.QR.jU;

import android.content.Context;
import com.bytedance.sdk.component.QR.KS.ku;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class jU {
    public static void zp(Context context, int i9, String str, int i10) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i9 == 1) {
                linkedHashMap.put(zp(i10), str);
            }
            if (ku.zp().zp(i10).jU() != null) {
                ku.zp().zp(i10).jU().zp(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zp(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L6
            goto L29
        L6:
            com.bytedance.sdk.component.QR.KS.ku r3 = com.bytedance.sdk.component.QR.KS.ku.zp()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.QR.KS.HWF r3 = r3.zp(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.QR.KS.lMd r3 = r3.jU()     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L29
            com.bytedance.sdk.component.QR.KS.ku r3 = com.bytedance.sdk.component.QR.KS.ku.zp()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.QR.KS.HWF r3 = r3.zp(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.QR.KS.lMd r3 = r3.jU()     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = zp(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r3.zp(r2, r4, r0)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r2 = r0
        L2a:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L32
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.QR.jU.jU.zp(android.content.Context, int, int):java.lang.String");
    }

    private static String zp(int i9) {
        return "tnc_config".concat(String.valueOf(i9));
    }
}
