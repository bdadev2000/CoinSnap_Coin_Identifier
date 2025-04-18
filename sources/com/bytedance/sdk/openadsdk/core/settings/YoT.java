package com.bytedance.sdk.openadsdk.core.settings;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class YoT {
    private static final AtomicInteger YFl = new AtomicInteger(1);

    public static boolean YFl() {
        return YFl.get() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void YFl(int r5) {
        /*
            java.lang.String r0 = "SdkSwitch"
            r1 = 1
            if (r5 == r1) goto L9
            r2 = 2
            if (r5 == r2) goto L9
            return
        L9:
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = com.bytedance.sdk.openadsdk.core.settings.YoT.YFl     // Catch: java.lang.Throwable -> L1a
            int r4 = r3.get()     // Catch: java.lang.Throwable -> L1a
            if (r4 == r5) goto L18
            r3.set(r5)     // Catch: java.lang.Throwable -> L16
            goto L23
        L16:
            r5 = move-exception
            goto L1c
        L18:
            r1 = r2
            goto L23
        L1a:
            r5 = move-exception
            r1 = r2
        L1c:
            java.lang.String r5 = r5.getMessage()
            com.bytedance.sdk.component.utils.YoT.YFl(r0, r5)
        L23:
            if (r1 == 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "switch status changed: "
            r5.<init>(r1)
            boolean r1 = YFl()
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            boolean r5 = YFl()
            if (r5 == 0) goto L44
            com.bytedance.sdk.openadsdk.AlY.YFl.AlY.Sg()
            return
        L44:
            com.bytedance.sdk.openadsdk.AlY.YFl.AlY.tN()
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.YoT.YFl(int):void");
    }
}
