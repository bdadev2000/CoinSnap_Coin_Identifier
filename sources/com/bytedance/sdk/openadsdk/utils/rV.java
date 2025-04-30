package com.bytedance.sdk.openadsdk.utils;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class rV {
    private static List<String> lMd() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #2 {all -> 0x00ae, blocks: (B:27:0x0089, B:29:0x008f), top: B:26:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zp() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.KVG.zp()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = com.bytedance.sdk.component.utils.tG.jU()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.String r1 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            java.lang.String r2 = "TTAdSdk-InitChecker"
            com.bytedance.sdk.component.utils.tG.zp(r2, r1)
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r0 = r0.requestedPermissions     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7e
            int r1 = r0.length     // Catch: java.lang.Throwable -> L42
            if (r1 <= 0) goto L7e
            java.util.List r1 = lMd()     // Catch: java.lang.Throwable -> L42
            int r4 = r0.length     // Catch: java.lang.Throwable -> L42
            r6 = 0
            r7 = r6
        L38:
            if (r7 >= r4) goto L47
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L44
            r1.remove(r8)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r0 = move-exception
            goto L84
        L44:
            int r7 = r7 + 1
            goto L38
        L47:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L53
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.tG.zp(r2, r0)     // Catch: java.lang.Throwable -> L42
            goto L89
        L53:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L57:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L89
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "    May be missing permissions："
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7b
            r4.append(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "，Please refer to the access documentation"
            r4.append(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7b
            com.bytedance.sdk.component.utils.tG.zp(r2, r1)     // Catch: java.lang.Throwable -> L7b
            r5 = r6
            goto L57
        L7b:
            r0 = move-exception
            r5 = r6
            goto L84
        L7e:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.tG.zp(r2, r0)     // Catch: java.lang.Throwable -> L42
            goto L89
        L84:
            java.lang.String r1 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.tG.zp(r2, r1, r0)
        L89:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lae
            r1 = 23
            if (r3 >= r1) goto Lb4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            java.lang.String r4 = "No adaptation required for dynamic permissions：target="
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lae
            r1.append(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "&phone="
            r1.append(r3)     // Catch: java.lang.Throwable -> Lae
            r1.append(r0)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = ", require=23"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lae
            com.bytedance.sdk.component.utils.tG.zp(r2, r0)     // Catch: java.lang.Throwable -> Lae
            goto Lb4
        Lae:
            r0 = move-exception
            java.lang.String r1 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.tG.zp(r2, r1, r0)
        Lb4:
            if (r5 != 0) goto Lbb
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.tG.zp(r2, r0)
        Lbb:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.tG.zp(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.rV.zp():void");
    }
}
