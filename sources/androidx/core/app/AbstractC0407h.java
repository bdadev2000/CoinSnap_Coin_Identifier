package androidx.core.app;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0407h {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4401a;
    public static final Field b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f4402c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f4403d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f4404e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f4405f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f4406g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|2|3|4|5|6|7|8|9|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            androidx.core.app.AbstractC0407h.f4406g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            androidx.core.app.AbstractC0407h.f4401a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            androidx.core.app.AbstractC0407h.b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            androidx.core.app.AbstractC0407h.f4402c = r0
            java.lang.Class r0 = androidx.core.app.AbstractC0407h.f4401a
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            java.lang.String r4 = "performStopActivity"
            if (r0 != 0) goto L3d
        L3b:
            r0 = r1
            goto L4c
        L3d:
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r5, r6}     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L3b
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3b
        L4c:
            androidx.core.app.AbstractC0407h.f4403d = r0
            java.lang.Class r0 = androidx.core.app.AbstractC0407h.f4401a
            if (r0 != 0) goto L54
        L52:
            r0 = r1
            goto L61
        L54:
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L52
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r5}     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> L52
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L52
        L61:
            androidx.core.app.AbstractC0407h.f4404e = r0
            java.lang.Class r0 = androidx.core.app.AbstractC0407h.f4401a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 == r4) goto L6f
            r4 = 27
            if (r3 != r4) goto L90
        L6f:
            if (r0 != 0) goto L72
            goto L90
        L72:
            java.lang.String r3 = "requestRelaunchActivity"
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L90
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L90
            java.lang.Class<android.content.res.Configuration> r9 = android.content.res.Configuration.class
            java.lang.Class<android.content.res.Configuration> r10 = android.content.res.Configuration.class
            r8 = r12
            r11 = r12
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L90
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L90
            r1 = r0
        L90:
            androidx.core.app.AbstractC0407h.f4405f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AbstractC0407h.<clinit>():void");
    }
}
