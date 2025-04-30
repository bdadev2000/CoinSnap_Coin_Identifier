package g5;

import Y4.h;
import Y4.t;
import Y4.u;
import a5.C0397a;
import com.google.firebase.perf.config.RemoteConfigManager;
import h5.C2323d;
import h5.C2326g;
import h5.i;
import java.util.concurrent.TimeUnit;

/* renamed from: g5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2300c {

    /* renamed from: k, reason: collision with root package name */
    public static final C0397a f20456k = C0397a.d();
    public static final long l = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a, reason: collision with root package name */
    public final R3.e f20457a;
    public final boolean b;

    /* renamed from: d, reason: collision with root package name */
    public C2326g f20459d;

    /* renamed from: g, reason: collision with root package name */
    public final C2326g f20462g;

    /* renamed from: h, reason: collision with root package name */
    public final C2326g f20463h;

    /* renamed from: i, reason: collision with root package name */
    public final long f20464i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20465j;

    /* renamed from: e, reason: collision with root package name */
    public long f20460e = 500;

    /* renamed from: f, reason: collision with root package name */
    public double f20461f = 500;

    /* renamed from: c, reason: collision with root package name */
    public i f20458c = new i();

    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, Y4.h] */
    /* JADX WARN: Type inference failed for: r3v31, types: [Y4.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, Y4.u] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, Y4.i] */
    public C2300c(C2326g c2326g, R3.e eVar, Y4.a aVar, String str) {
        long k6;
        Y4.i iVar;
        long j7;
        long k7;
        h hVar;
        long j9;
        t tVar;
        u uVar;
        this.f20457a = eVar;
        this.f20459d = c2326g;
        if (str == "Trace") {
            k6 = aVar.k();
        } else {
            k6 = aVar.k();
        }
        long j10 = k6;
        if (str == "Trace") {
            synchronized (u.class) {
                try {
                    if (u.f3811j == null) {
                        u.f3811j = new Object();
                    }
                    uVar = u.f3811j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteConfigManager remoteConfigManager = aVar.f3790a;
            uVar.getClass();
            C2323d c2323d = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (c2323d.b() && Y4.a.l(((Long) c2323d.a()).longValue())) {
                aVar.f3791c.d(((Long) c2323d.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                j7 = ((Long) c2323d.a()).longValue();
            } else {
                C2323d c9 = aVar.c(uVar);
                if (c9.b() && Y4.a.l(((Long) c9.a()).longValue())) {
                    j7 = ((Long) c9.a()).longValue();
                } else {
                    j7 = 300;
                }
            }
        } else {
            synchronized (Y4.i.class) {
                try {
                    if (Y4.i.f3799j == null) {
                        Y4.i.f3799j = new Object();
                    }
                    iVar = Y4.i.f3799j;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            RemoteConfigManager remoteConfigManager2 = aVar.f3790a;
            iVar.getClass();
            C2323d c2323d2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
            if (c2323d2.b() && Y4.a.l(((Long) c2323d2.a()).longValue())) {
                aVar.f3791c.d(((Long) c2323d2.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                j7 = ((Long) c2323d2.a()).longValue();
            } else {
                C2323d c10 = aVar.c(iVar);
                if (c10.b() && Y4.a.l(((Long) c10.a()).longValue())) {
                    j7 = ((Long) c10.a()).longValue();
                } else {
                    j7 = 700;
                }
            }
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f20462g = new C2326g(j7, j10, timeUnit);
        this.f20464i = j7;
        if (str == "Trace") {
            k7 = aVar.k();
        } else {
            k7 = aVar.k();
        }
        long j11 = k7;
        if (str == "Trace") {
            synchronized (t.class) {
                try {
                    if (t.f3810j == null) {
                        t.f3810j = new Object();
                    }
                    tVar = t.f3810j;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            RemoteConfigManager remoteConfigManager3 = aVar.f3790a;
            tVar.getClass();
            C2323d c2323d3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
            if (c2323d3.b() && Y4.a.l(((Long) c2323d3.a()).longValue())) {
                aVar.f3791c.d(((Long) c2323d3.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                j9 = ((Long) c2323d3.a()).longValue();
            } else {
                C2323d c11 = aVar.c(tVar);
                if (c11.b() && Y4.a.l(((Long) c11.a()).longValue())) {
                    j9 = ((Long) c11.a()).longValue();
                } else {
                    j9 = 30;
                }
            }
        } else {
            synchronized (h.class) {
                try {
                    if (h.f3798j == null) {
                        h.f3798j = new Object();
                    }
                    hVar = h.f3798j;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            RemoteConfigManager remoteConfigManager4 = aVar.f3790a;
            hVar.getClass();
            C2323d c2323d4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
            if (c2323d4.b() && Y4.a.l(((Long) c2323d4.a()).longValue())) {
                aVar.f3791c.d(((Long) c2323d4.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                j9 = ((Long) c2323d4.a()).longValue();
            } else {
                C2323d c12 = aVar.c(hVar);
                if (c12.b() && Y4.a.l(((Long) c12.a()).longValue())) {
                    j9 = ((Long) c12.a()).longValue();
                } else {
                    j9 = 70;
                }
            }
        }
        this.f20463h = new C2326g(j9, j11, timeUnit);
        this.f20465j = j9;
        this.b = false;
    }

    public final synchronized void a(boolean z8) {
        C2326g c2326g;
        long j7;
        try {
            if (z8) {
                c2326g = this.f20462g;
            } else {
                c2326g = this.f20463h;
            }
            this.f20459d = c2326g;
            if (z8) {
                j7 = this.f20464i;
            } else {
                j7 = this.f20465j;
            }
            this.f20460e = j7;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0001, B:9:0x0036, B:10:0x005f, B:12:0x006a, B:13:0x007b, B:15:0x0083, B:19:0x0088, B:21:0x008c, B:24:0x003e, B:25:0x0047, B:26:0x004b, B:27:0x0055), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0001, B:9:0x0036, B:10:0x005f, B:12:0x006a, B:13:0x007b, B:15:0x0083, B:19:0x0088, B:21:0x008c, B:24:0x003e, B:25:0x0047, B:26:0x004b, B:27:0x0055), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0001, B:9:0x0036, B:10:0x005f, B:12:0x006a, B:13:0x007b, B:15:0x0083, B:19:0x0088, B:21:0x008c, B:24:0x003e, B:25:0x0047, B:26:0x004b, B:27:0x0055), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b() {
        /*
            r13 = this;
            monitor-enter(r13)
            R3.e r0 = r13.f20457a     // Catch: java.lang.Throwable -> L79
            r0.getClass()     // Catch: java.lang.Throwable -> L79
            h5.i r0 = new h5.i     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            h5.i r1 = r13.f20458c     // Catch: java.lang.Throwable -> L79
            r1.getClass()     // Catch: java.lang.Throwable -> L79
            long r2 = r0.f20610c     // Catch: java.lang.Throwable -> L79
            long r4 = r1.f20610c     // Catch: java.lang.Throwable -> L79
            long r2 = r2 - r4
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L79
            h5.g r3 = r13.f20459d     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            int[] r4 = h5.AbstractC2325f.f20606a     // Catch: java.lang.Throwable -> L79
            java.io.Serializable r5 = r3.f20608c     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.TimeUnit r5 = (java.util.concurrent.TimeUnit) r5     // Catch: java.lang.Throwable -> L79
            int r6 = r5.ordinal()     // Catch: java.lang.Throwable -> L79
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L79
            long r6 = r3.b     // Catch: java.lang.Throwable -> L79
            long r8 = r3.f20607a     // Catch: java.lang.Throwable -> L79
            r3 = 1
            r10 = 1
            if (r4 == r3) goto L55
            r12 = 2
            if (r4 == r12) goto L4b
            r12 = 3
            if (r4 == r12) goto L3e
            double r8 = (double) r8     // Catch: java.lang.Throwable -> L79
            long r4 = r5.toSeconds(r6)     // Catch: java.lang.Throwable -> L79
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L79
            double r8 = r8 / r4
            goto L5f
        L3e:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L79
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L79
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L79
            long r6 = r6.toMillis(r10)     // Catch: java.lang.Throwable -> L79
        L47:
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L79
            double r8 = r4 * r6
            goto L5f
        L4b:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L79
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L79
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L79
            long r6 = r6.toMicros(r10)     // Catch: java.lang.Throwable -> L79
            goto L47
        L55:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L79
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L79
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L79
            long r6 = r6.toNanos(r10)     // Catch: java.lang.Throwable -> L79
            goto L47
        L5f:
            double r1 = r1 * r8
            long r4 = g5.C2300c.l     // Catch: java.lang.Throwable -> L79
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L79
            double r1 = r1 / r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L7b
            double r4 = r13.f20461f     // Catch: java.lang.Throwable -> L79
            double r4 = r4 + r1
            long r1 = r13.f20460e     // Catch: java.lang.Throwable -> L79
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L79
            double r1 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L79
            r13.f20461f = r1     // Catch: java.lang.Throwable -> L79
            r13.f20458c = r0     // Catch: java.lang.Throwable -> L79
            goto L7b
        L79:
            r0 = move-exception
            goto L96
        L7b:
            double r0 = r13.f20461f     // Catch: java.lang.Throwable -> L79
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L88
            double r0 = r0 - r4
            r13.f20461f = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r13)
            return r3
        L88:
            boolean r0 = r13.b     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L93
            a5.a r0 = g5.C2300c.f20456k     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "Exceeded log rate limit, dropping the log."
            r0.f(r1)     // Catch: java.lang.Throwable -> L79
        L93:
            monitor-exit(r13)
            r0 = 0
            return r0
        L96:
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2300c.b():boolean");
    }
}
