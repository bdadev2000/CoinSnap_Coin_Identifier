package com.facebook.internal;

import java.util.TreeSet;

/* loaded from: classes3.dex */
public abstract class f0 {
    public TreeSet a;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0016, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.valueOf(r5.isEmpty()), java.lang.Boolean.FALSE) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:39:0x0004, B:41:0x0008, B:8:0x002f, B:10:0x0035, B:15:0x0041, B:16:0x0046, B:18:0x004a, B:22:0x005b, B:26:0x0068, B:25:0x006b, B:4:0x0018, B:7:0x002d, B:37:0x0029, B:34:0x0023), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L18
            java.util.TreeSet r5 = r4.a     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L18
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L72
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)     // Catch: java.lang.Throwable -> L72
            if (r5 != 0) goto L2f
        L18:
            com.facebook.internal.g0 r5 = com.facebook.internal.g0.a     // Catch: java.lang.Throwable -> L72
            java.lang.Class<com.facebook.internal.g0> r1 = com.facebook.internal.g0.class
            boolean r2 = m6.a.b(r1)     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L23
            goto L2c
        L23:
            java.util.TreeSet r5 = r5.f(r4)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r5 = move-exception
            m6.a.a(r1, r5)     // Catch: java.lang.Throwable -> L72
        L2c:
            r5 = r0
        L2d:
            r4.a = r5     // Catch: java.lang.Throwable -> L72
        L2f:
            java.util.TreeSet r5 = r4.a     // Catch: java.lang.Throwable -> L72
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L3e
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L3c
            goto L3e
        L3c:
            r5 = r1
            goto L3f
        L3e:
            r5 = r2
        L3f:
            if (r5 == 0) goto L70
            r5 = r4
            com.facebook.internal.e0 r5 = (com.facebook.internal.e0) r5     // Catch: java.lang.Throwable -> L72
            int r5 = r5.f11034b     // Catch: java.lang.Throwable -> L72
            switch(r5) {
                case 2: goto L4a;
                default: goto L49;
            }     // Catch: java.lang.Throwable -> L72
        L49:
            goto L70
        L4a:
            android.content.Context r5 = com.facebook.x.a()     // Catch: java.lang.Throwable -> L72
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L72
            int r5 = r5.targetSdkVersion     // Catch: java.lang.Throwable -> L72
            r3 = 30
            if (r5 < r3) goto L59
            r1 = r2
        L59:
            if (r1 == 0) goto L70
            java.lang.Class<com.facebook.internal.g0> r5 = com.facebook.internal.g0.class
            boolean r1 = m6.a.b(r5)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L64
            goto L6b
        L64:
            java.lang.String r0 = "com.facebook.internal.g0"
            goto L6b
        L67:
            r1 = move-exception
            m6.a.a(r5, r1)     // Catch: java.lang.Throwable -> L72
        L6b:
            java.lang.String r5 = "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration."
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r4)
            return
        L72:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.f0.a(boolean):void");
    }

    public abstract String b();
}
