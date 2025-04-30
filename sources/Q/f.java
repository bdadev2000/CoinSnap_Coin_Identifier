package Q;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x.l;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final x.g f2458a = new x.g(16);
    public static final ThreadPoolExecutor b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2459c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f2460d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory, Q.i] */
    static {
        ?? obj = new Object();
        obj.f2465a = "fonts-androidx";
        obj.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        f2459c = new Object();
        f2460d = new l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Q.e a(java.lang.String r6, android.content.Context r7, F1.i r8, int r9) {
        /*
            x.g r0 = Q.f.f2458a
            java.lang.Object r1 = r0.get(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            Q.e r6 = new Q.e
            r6.<init>(r1)
            return r6
        L10:
            B3.g r8 = Q.b.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f286d
            Q.g[] r3 = (Q.g[]) r3
            int r8 = r8.f285c
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = r2
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.f2464e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            Q.e r6 = new Q.e
            r6.<init>(r1)
            return r6
        L45:
            android.support.v4.media.session.a r8 = L.j.f1674a
            android.graphics.Typeface r7 = r8.i(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.put(r6, r7)
            Q.e r6 = new Q.e
            r6.<init>(r7)
            return r6
        L56:
            Q.e r6 = new Q.e
            r6.<init>(r2)
            return r6
        L5c:
            Q.e r6 = new Q.e
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.f.a(java.lang.String, android.content.Context, F1.i, int):Q.e");
    }
}
