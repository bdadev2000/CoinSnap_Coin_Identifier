package C2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f494a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:119:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.e.a(android.content.Context):void");
    }

    public static ConcurrentHashMap b() {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            return h.f502w;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static AtomicBoolean c() {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            return h.f501v;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {, blocks: (B:12:0x0015, B:16:0x0028, B:18:0x002e, B:31:0x0036, B:39:0x0046, B:33:0x0049, B:44:0x0024, B:41:0x0020, B:36:0x0042), top: B:11:0x0015, outer: #3, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036 A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:12:0x0015, B:16:0x0028, B:18:0x002e, B:31:0x0036, B:39:0x0046, B:33:0x0049, B:44:0x0024, B:41:0x0020, B:36:0x0042), top: B:11:0x0015, outer: #3, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(android.content.Context r4) {
        /*
            java.lang.Class<C2.e> r0 = C2.e.class
            boolean r0 = O2.a.b(r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "com.android.billingclient.api.Purchase"
            java.lang.Class r0 = C2.m.n(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L12
            return
        L12:
            C2.e r0 = C2.h.f498s     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class<C2.h> r1 = C2.h.class
            boolean r2 = O2.a.b(r1)     // Catch: java.lang.Throwable -> L34
            r3 = 0
            if (r2 == 0) goto L20
        L1e:
            r1 = r3
            goto L28
        L20:
            java.util.concurrent.atomic.AtomicBoolean r1 = C2.h.f499t     // Catch: java.lang.Throwable -> L23
            goto L28
        L23:
            r2 = move-exception
            O2.a.a(r1, r2)     // Catch: java.lang.Throwable -> L34
            goto L1e
        L28:
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            C2.h r4 = C2.h.a()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            goto L52
        L34:
            r4 = move-exception
            goto L7b
        L36:
            a(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.Class<C2.h> r4 = C2.h.class
            boolean r1 = O2.a.b(r4)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L42
            goto L49
        L42:
            java.util.concurrent.atomic.AtomicBoolean r3 = C2.h.f499t     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r1 = move-exception
            O2.a.a(r4, r1)     // Catch: java.lang.Throwable -> L34
        L49:
            r4 = 1
            r3.set(r4)     // Catch: java.lang.Throwable -> L34
            C2.h r4 = C2.h.a()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
        L52:
            if (r4 != 0) goto L55
            return
        L55:
            java.util.concurrent.atomic.AtomicBoolean r0 = c()     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L7a
            boolean r0 = C2.j.d()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            C2.b r0 = new C2.b     // Catch: java.lang.Throwable -> L6f
            r1 = 2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            goto L7a
        L6f:
            r4 = move-exception
            goto L7d
        L71:
            C2.b r0 = new C2.b     // Catch: java.lang.Throwable -> L6f
            r1 = 3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r4.b(r0)     // Catch: java.lang.Throwable -> L6f
        L7a:
            return
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r4     // Catch: java.lang.Throwable -> L6f
        L7d:
            java.lang.Class<C2.e> r0 = C2.e.class
            O2.a.a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.e.e(android.content.Context):void");
    }

    public void d() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            j jVar = j.f524a;
            e eVar = h.f498s;
            ConcurrentHashMap b = b();
            ConcurrentHashMap concurrentHashMap = null;
            if (!O2.a.b(h.class)) {
                try {
                    concurrentHashMap = h.f503x;
                } catch (Throwable th) {
                    O2.a.a(h.class, th);
                }
            }
            j.e(b, concurrentHashMap);
            b().clear();
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }
}
