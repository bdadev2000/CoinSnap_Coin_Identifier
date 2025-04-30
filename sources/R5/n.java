package r5;

import F7.p;
import Q7.AbstractC0255x;
import Q7.C0235c;
import Q7.C0247o;
import Q7.C0249q;
import Q7.EnumC0254w;
import Q7.F;
import Q7.L;
import Q7.P;
import Q7.m0;
import e0.InterfaceC2208i;
import h0.C2312b;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final h0.f f22885c = new h0.f("firebase_sessions_enabled");

    /* renamed from: d, reason: collision with root package name */
    public static final h0.f f22886d = new h0.f("firebase_sessions_sampling_rate");

    /* renamed from: e, reason: collision with root package name */
    public static final h0.f f22887e = new h0.f("firebase_sessions_restart_timeout");

    /* renamed from: f, reason: collision with root package name */
    public static final h0.f f22888f = new h0.f("firebase_sessions_cache_duration");

    /* renamed from: g, reason: collision with root package name */
    public static final h0.f f22889g = new h0.f("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2208i f22890a;
    public C2674f b;

    public n(InterfaceC2208i interfaceC2208i) {
        Object obj;
        w7.k kVar;
        long j7;
        this.f22890a = interfaceC2208i;
        p c2679k = new C2679k(this, null);
        Thread currentThread = Thread.currentThread();
        w7.g gVar = w7.g.b;
        L a6 = m0.a();
        Boolean bool = Boolean.FALSE;
        C0249q c0249q = C0249q.f2580d;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = ((Boolean) a6.b(bool, c0249q)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            kVar = a6;
        } else {
            w7.l lVar = w7.l.b;
            if (booleanValue2) {
                obj = a6.b(lVar, C0249q.f2579c);
            } else {
                obj = a6;
            }
            kVar = (w7.k) obj;
            lVar.n(kVar);
        }
        X7.e eVar = F.f2529a;
        if (kVar != eVar && kVar.h(gVar) == null) {
            kVar = kVar.n(eVar);
        }
        C0235c c0235c = new C0235c(kVar, currentThread, a6);
        c0235c.X(EnumC0254w.b, c0235c, c2679k);
        L l = c0235c.f2556g;
        if (l != null) {
            int i9 = L.f2534h;
            l.o(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (l != null) {
                    j7 = l.p();
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (!(!(c0235c.F() instanceof P))) {
                    LockSupport.parkNanos(c0235c, j7);
                } else {
                    if (l != null) {
                        int i10 = L.f2534h;
                        l.l(false);
                    }
                    Object q9 = AbstractC0255x.q(c0235c.F());
                    C0247o c0247o = q9 instanceof C0247o ? (C0247o) q9 : null;
                    if (c0247o == null) {
                        return;
                    } else {
                        throw c0247o.f2575a;
                    }
                }
            } catch (Throwable th) {
                if (l != null) {
                    int i11 = L.f2534h;
                    l.l(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0235c.s(interruptedException);
        throw interruptedException;
    }

    public static final void a(n nVar, C2312b c2312b) {
        nVar.getClass();
        nVar.b = new C2674f((Boolean) c2312b.b(f22885c), (Double) c2312b.b(f22886d), (Integer) c2312b.b(f22887e), (Integer) c2312b.b(f22888f), (Long) c2312b.b(f22889g));
    }

    public final boolean b() {
        Integer num;
        C2674f c2674f = this.b;
        if (c2674f != null) {
            if (c2674f != null) {
                Long l = c2674f.f22866e;
                if (l != null && (num = c2674f.f22865d) != null && (System.currentTimeMillis() - l.longValue()) / 1000 < num.intValue()) {
                    return false;
                }
                return true;
            }
            G7.j.k("sessionConfigs");
            throw null;
        }
        G7.j.k("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(h0.f r6, java.lang.Object r7, w7.f r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r5.l
            if (r0 == 0) goto L13
            r0 = r8
            r5.l r0 = (r5.l) r0
            int r1 = r0.f22880h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22880h = r1
            goto L18
        L13:
            r5.l r0 = new r5.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f22878f
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f22880h
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            t7.AbstractC2712a.f(r8)     // Catch: java.io.IOException -> L27
            goto L5d
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            t7.AbstractC2712a.f(r8)
            e0.i r8 = r5.f22890a     // Catch: java.io.IOException -> L27
            r5.m r2 = new r5.m     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f22880h = r3     // Catch: java.io.IOException -> L27
            h0.h r6 = new h0.h     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L5d
            return r1
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            t7.y r6 = t7.y.f23029a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.n.c(h0.f, java.lang.Object, w7.f):java.lang.Object");
    }
}
