package androidx.core.app;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class k {
    public static final Class a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f1196b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f1197c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f1198d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f1199e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f1200f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f1201g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            androidx.core.app.k.f1201g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            androidx.core.app.k.a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            androidx.core.app.k.f1196b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            androidx.core.app.k.f1197c = r0
            java.lang.Class r0 = androidx.core.app.k.a
            r3 = 0
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r0 != 0) goto L3f
            goto L53
        L3f:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L53
            r8[r3] = r7     // Catch: java.lang.Throwable -> L53
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L53
            r8[r2] = r9     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L53
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L53
            goto L54
        L53:
            r0 = r1
        L54:
            androidx.core.app.k.f1198d = r0
            java.lang.Class r0 = androidx.core.app.k.a
            if (r0 != 0) goto L5b
            goto L6b
        L5b:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L6b
            r8[r3] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6b
            r8[r2] = r9     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L6b
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
            r0 = r1
        L6c:
            androidx.core.app.k.f1199e = r0
            java.lang.Class r0 = androidx.core.app.k.a
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            java.lang.Class<java.util.List> r8 = java.util.List.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 == r10) goto L81
            r10 = 27
            if (r9 != r10) goto L7f
            goto L81
        L7f:
            r9 = r3
            goto L82
        L81:
            r9 = r2
        L82:
            if (r9 == 0) goto Lb1
            if (r0 != 0) goto L87
            goto Lb1
        L87:
            java.lang.String r9 = "requestRelaunchActivity"
            r10 = 9
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Lb1
            r10[r3] = r7     // Catch: java.lang.Throwable -> Lb1
            r10[r2] = r8     // Catch: java.lang.Throwable -> Lb1
            r10[r6] = r8     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb1
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb1
            r4 = 4
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            r4 = 5
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb1
            r4 = 6
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb1
            r4 = 7
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            r4 = 8
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lb1
            r1 = r0
        Lb1:
            androidx.core.app.k.f1200f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.k.<clinit>():void");
    }
}
