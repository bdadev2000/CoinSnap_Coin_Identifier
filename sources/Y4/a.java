package Y4;

import a5.C0397a;
import com.google.firebase.perf.config.RemoteConfigManager;
import h5.C2322c;
import h5.C2323d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0397a f3788d = C0397a.d();

    /* renamed from: e, reason: collision with root package name */
    public static volatile a f3789e;

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f3790a = RemoteConfigManager.getInstance();
    public C2322c b = new C2322c();

    /* renamed from: c, reason: collision with root package name */
    public final w f3791c = w.b();

    public static synchronized a e() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f3789e == null) {
                    f3789e = new a();
                }
                aVar = f3789e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static boolean l(long j7) {
        if (j7 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean m(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals("21.0.1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(long j7) {
        if (j7 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean p(double d2) {
        if (0.0d <= d2 && d2 <= 1.0d) {
            return true;
        }
        return false;
    }

    public final C2323d a(com.facebook.appevents.n nVar) {
        w wVar = this.f3791c;
        String f9 = nVar.f();
        if (f9 == null) {
            wVar.getClass();
            w.f3813c.a("Key is null when getting boolean value on device cache.");
            return new C2323d();
        }
        if (wVar.f3815a == null) {
            wVar.c(w.a());
            if (wVar.f3815a == null) {
                return new C2323d();
            }
        }
        if (!wVar.f3815a.contains(f9)) {
            return new C2323d();
        }
        try {
            return new C2323d(Boolean.valueOf(wVar.f3815a.getBoolean(f9, false)));
        } catch (ClassCastException e4) {
            w.f3813c.b("Key %s from sharedPreferences has type other than long: %s", f9, e4.getMessage());
            return new C2323d();
        }
    }

    public final C2323d b(com.facebook.appevents.n nVar) {
        w wVar = this.f3791c;
        String f9 = nVar.f();
        if (f9 == null) {
            wVar.getClass();
            w.f3813c.a("Key is null when getting double value on device cache.");
            return new C2323d();
        }
        if (wVar.f3815a == null) {
            wVar.c(w.a());
            if (wVar.f3815a == null) {
                return new C2323d();
            }
        }
        if (!wVar.f3815a.contains(f9)) {
            return new C2323d();
        }
        try {
            try {
                return new C2323d(Double.valueOf(Double.longBitsToDouble(wVar.f3815a.getLong(f9, 0L))));
            } catch (ClassCastException e4) {
                w.f3813c.b("Key %s from sharedPreferences has type other than double: %s", f9, e4.getMessage());
                return new C2323d();
            }
        } catch (ClassCastException unused) {
            return new C2323d(Double.valueOf(Float.valueOf(wVar.f3815a.getFloat(f9, 0.0f)).doubleValue()));
        }
    }

    public final C2323d c(com.facebook.appevents.n nVar) {
        w wVar = this.f3791c;
        String f9 = nVar.f();
        if (f9 == null) {
            wVar.getClass();
            w.f3813c.a("Key is null when getting long value on device cache.");
            return new C2323d();
        }
        if (wVar.f3815a == null) {
            wVar.c(w.a());
            if (wVar.f3815a == null) {
                return new C2323d();
            }
        }
        if (!wVar.f3815a.contains(f9)) {
            return new C2323d();
        }
        try {
            return new C2323d(Long.valueOf(wVar.f3815a.getLong(f9, 0L)));
        } catch (ClassCastException e4) {
            w.f3813c.b("Key %s from sharedPreferences has type other than long: %s", f9, e4.getMessage());
            return new C2323d();
        }
    }

    public final C2323d d(com.facebook.appevents.n nVar) {
        w wVar = this.f3791c;
        String f9 = nVar.f();
        if (f9 == null) {
            wVar.getClass();
            w.f3813c.a("Key is null when getting String value on device cache.");
            return new C2323d();
        }
        if (wVar.f3815a == null) {
            wVar.c(w.a());
            if (wVar.f3815a == null) {
                return new C2323d();
            }
        }
        if (!wVar.f3815a.contains(f9)) {
            return new C2323d();
        }
        try {
            return new C2323d(wVar.f3815a.getString(f9, ""));
        } catch (ClassCastException e4) {
            w.f3813c.b("Key %s from sharedPreferences has type other than String: %s", f9, e4.getMessage());
            return new C2323d();
        }
    }

    public final boolean f() {
        d x9 = d.x();
        C2323d h6 = h(x9);
        if (h6.b()) {
            return ((Boolean) h6.a()).booleanValue();
        }
        C2323d c2323d = this.f3790a.getBoolean("fpr_experiment_app_start_ttid");
        if (c2323d.b()) {
            this.f3791c.g("com.google.firebase.perf.ExperimentTTID", ((Boolean) c2323d.a()).booleanValue());
            return ((Boolean) c2323d.a()).booleanValue();
        }
        C2323d a6 = a(x9);
        if (a6.b()) {
            return ((Boolean) a6.a()).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [Y4.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Y4.b, java.lang.Object] */
    public final Boolean g() {
        b bVar;
        Boolean bool;
        c cVar;
        synchronized (b.class) {
            try {
                if (b.f3792j == null) {
                    b.f3792j = new Object();
                }
                bVar = b.f3792j;
            } finally {
            }
        }
        C2323d h6 = h(bVar);
        if (h6.b()) {
            bool = (Boolean) h6.a();
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (c.class) {
            try {
                if (c.f3793j == null) {
                    c.f3793j = new Object();
                }
                cVar = c.f3793j;
            } catch (Throwable th) {
                throw th;
            }
        }
        C2323d a6 = a(cVar);
        if (a6.b()) {
            return (Boolean) a6.a();
        }
        C2323d h9 = h(cVar);
        if (h9.b()) {
            return (Boolean) h9.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [h5.d] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h5.C2323d h(com.facebook.appevents.n r3) {
        /*
            r2 = this;
            h5.c r0 = r2.b
            java.lang.String r3 = r3.i()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f20601a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            h5.d r3 = new h5.d
            r3.<init>()
            goto L4b
        L1e:
            android.os.Bundle r0 = r0.f20601a     // Catch: java.lang.ClassCastException -> L36
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ClassCastException -> L36
            if (r0 != 0) goto L2f
            h5.d r0 = new h5.d     // Catch: java.lang.ClassCastException -> L36
            r0.<init>()     // Catch: java.lang.ClassCastException -> L36
            r3 = r0
            goto L4b
        L2f:
            h5.d r1 = new h5.d     // Catch: java.lang.ClassCastException -> L36
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L36
            r3 = r1
            goto L4b
        L36:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            a5.a r0 = h5.C2322c.b
            java.lang.String r1 = "Metadata key %s contains type other than boolean: %s"
            r0.b(r1, r3)
            h5.d r3 = new h5.d
            r3.<init>()
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.a.h(com.facebook.appevents.n):h5.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h5.C2323d i(com.facebook.appevents.n r3) {
        /*
            r2 = this;
            h5.c r0 = r2.b
            java.lang.String r3 = r3.i()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f20601a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            h5.d r3 = new h5.d
            r3.<init>()
            goto L5d
        L1e:
            android.os.Bundle r0 = r0.f20601a
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L2c
            h5.d r3 = new h5.d
            r3.<init>()
            goto L5d
        L2c:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L41
            java.lang.Float r0 = (java.lang.Float) r0
            double r0 = r0.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            h5.d r0 = new h5.d
            r0.<init>(r3)
            r3 = r0
            goto L5d
        L41:
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L4d
            java.lang.Double r0 = (java.lang.Double) r0
            h5.d r3 = new h5.d
            r3.<init>(r0)
            goto L5d
        L4d:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a5.a r0 = h5.C2322c.b
            java.lang.String r1 = "Metadata key %s contains type other than double: %s"
            r0.b(r1, r3)
            h5.d r3 = new h5.d
            r3.<init>()
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.a.i(com.facebook.appevents.n):h5.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [h5.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [h5.d] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [h5.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h5.C2323d j(com.facebook.appevents.n r3) {
        /*
            r2 = this;
            h5.c r0 = r2.b
            java.lang.String r3 = r3.i()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f20601a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            h5.d r3 = new h5.d
            r3.<init>()
            goto L4b
        L1e:
            android.os.Bundle r0 = r0.f20601a     // Catch: java.lang.ClassCastException -> L36
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.ClassCastException -> L36
            if (r0 != 0) goto L2f
            h5.d r0 = new h5.d     // Catch: java.lang.ClassCastException -> L36
            r0.<init>()     // Catch: java.lang.ClassCastException -> L36
            r3 = r0
            goto L4b
        L2f:
            h5.d r1 = new h5.d     // Catch: java.lang.ClassCastException -> L36
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L36
            r3 = r1
            goto L4b
        L36:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            a5.a r0 = h5.C2322c.b
            java.lang.String r1 = "Metadata key %s contains type other than int: %s"
            r0.b(r1, r3)
            h5.d r3 = new h5.d
            r3.<init>()
        L4b:
            boolean r0 = r3.b()
            if (r0 == 0) goto L66
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            h5.d r0 = new h5.d
            r0.<init>(r3)
            goto L6b
        L66:
            h5.d r0 = new h5.d
            r0.<init>()
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.a.j(com.facebook.appevents.n):h5.d");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [Y4.k, java.lang.Object] */
    public final long k() {
        k kVar;
        synchronized (k.class) {
            try {
                if (k.f3801j == null) {
                    k.f3801j = new Object();
                }
                kVar = k.f3801j;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f3790a;
        kVar.getClass();
        C2323d c2323d = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (c2323d.b() && ((Long) c2323d.a()).longValue() > 0) {
            this.f3791c.d(((Long) c2323d.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) c2323d.a()).longValue();
        }
        C2323d c9 = c(kVar);
        if (c9.b() && ((Long) c9.a()).longValue() > 0) {
            return ((Long) c9.a()).longValue();
        }
        return 600L;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11, types: [Y4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Y4.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto Ld4
        Le:
            java.lang.Class<Y4.m> r0 = Y4.m.class
            monitor-enter(r0)
            Y4.m r3 = Y4.m.f3803j     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L20
            Y4.m r3 = new Y4.m     // Catch: java.lang.Throwable -> L1d
            r3.<init>()     // Catch: java.lang.Throwable -> L1d
            Y4.m.f3803j = r3     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r1 = move-exception
            goto Ld5
        L20:
            Y4.m r3 = Y4.m.f3803j     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f3790a
            r3.getClass()
            java.lang.String r4 = "fpr_enabled"
            h5.d r0 = r0.getBoolean(r4)
            boolean r4 = r0.b()
            if (r4 == 0) goto L5a
            com.google.firebase.perf.config.RemoteConfigManager r3 = r6.f3790a
            boolean r3 = r3.isLastFetchFailed()
            if (r3 == 0) goto L3e
            r0 = r1
            goto L70
        L3e:
            Y4.w r3 = r6.f3791c
            java.lang.String r4 = "com.google.firebase.perf.SdkEnabled"
            java.lang.Object r5 = r0.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r3.g(r4, r5)
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L70
        L5a:
            h5.d r0 = r6.a(r3)
            boolean r3 = r0.b()
            if (r3 == 0) goto L6f
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L70
        L6f:
            r0 = r2
        L70:
            if (r0 == 0) goto Ld0
            java.lang.Class<Y4.l> r0 = Y4.l.class
            monitor-enter(r0)
            Y4.l r3 = Y4.l.f3802j     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto L83
            Y4.l r3 = new Y4.l     // Catch: java.lang.Throwable -> L81
            r3.<init>()     // Catch: java.lang.Throwable -> L81
            Y4.l.f3802j = r3     // Catch: java.lang.Throwable -> L81
            goto L83
        L81:
            r1 = move-exception
            goto Lce
        L83:
            Y4.l r3 = Y4.l.f3802j     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f3790a
            r3.getClass()
            java.lang.String r4 = "fpr_disabled_android_versions"
            h5.d r0 = r0.getString(r4)
            boolean r4 = r0.b()
            if (r4 == 0) goto Laf
            Y4.w r3 = r6.f3791c
            java.lang.String r4 = "com.google.firebase.perf.SdkDisabledVersions"
            java.lang.Object r5 = r0.a()
            java.lang.String r5 = (java.lang.String) r5
            r3.f(r4, r5)
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m(r0)
            goto Lca
        Laf:
            h5.d r0 = r6.d(r3)
            boolean r3 = r0.b()
            if (r3 == 0) goto Lc4
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m(r0)
            goto Lca
        Lc4:
            java.lang.String r0 = ""
            boolean r0 = m(r0)
        Lca:
            if (r0 != 0) goto Ld0
            r0 = r2
            goto Ld1
        Lce:
            monitor-exit(r0)
            throw r1
        Ld0:
            r0 = r1
        Ld1:
            if (r0 == 0) goto Ld4
            r1 = r2
        Ld4:
            return r1
        Ld5:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.a.o():boolean");
    }
}
