package com.bytedance.sdk.component.DSW.AlY;

import android.content.Context;
import com.bytedance.sdk.component.DSW.tN.qsH;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class AlY {
    public static void YFl(Context context, int i10, String str, int i11) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i10 == 1) {
                linkedHashMap.put(YFl(i11), str);
            }
            if (qsH.YFl().YFl(i11).AlY() != null) {
                qsH.YFl().YFl(i11).AlY().YFl(context, linkedHashMap);
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
    public static java.lang.String YFl(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L6
            goto L29
        L6:
            com.bytedance.sdk.component.DSW.tN.qsH r3 = com.bytedance.sdk.component.DSW.tN.qsH.YFl()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.DSW.tN.vc r3 = r3.YFl(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.DSW.tN.Sg r3 = r3.AlY()     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L29
            com.bytedance.sdk.component.DSW.tN.qsH r3 = com.bytedance.sdk.component.DSW.tN.qsH.YFl()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.DSW.tN.vc r3 = r3.YFl(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.DSW.tN.Sg r3 = r3.AlY()     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = YFl(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r3.YFl(r2, r4, r0)     // Catch: java.lang.Exception -> L29
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.DSW.AlY.AlY.YFl(android.content.Context, int, int):java.lang.String");
    }

    private static String YFl(int i10) {
        return "tnc_config".concat(String.valueOf(i10));
    }
}
