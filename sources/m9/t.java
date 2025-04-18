package m9;

import android.content.Context;
import android.os.Handler;
import com.google.common.collect.z1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class t implements e, w0 {

    /* renamed from: n, reason: collision with root package name */
    public static final z1 f21737n = com.google.common.collect.r0.n(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* renamed from: o, reason: collision with root package name */
    public static final z1 f21738o = com.google.common.collect.r0.n(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: p, reason: collision with root package name */
    public static final z1 f21739p = com.google.common.collect.r0.n(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: q, reason: collision with root package name */
    public static final z1 f21740q = com.google.common.collect.r0.n(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: r, reason: collision with root package name */
    public static final z1 f21741r = com.google.common.collect.r0.n(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: s, reason: collision with root package name */
    public static final z1 f21742s = com.google.common.collect.r0.n(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* renamed from: t, reason: collision with root package name */
    public static t f21743t;
    public final com.google.common.collect.u0 a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.q f21744b = new y7.q(2);

    /* renamed from: c, reason: collision with root package name */
    public final u0 f21745c;

    /* renamed from: d, reason: collision with root package name */
    public final n9.a f21746d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21747e;

    /* renamed from: f, reason: collision with root package name */
    public int f21748f;

    /* renamed from: g, reason: collision with root package name */
    public long f21749g;

    /* renamed from: h, reason: collision with root package name */
    public long f21750h;

    /* renamed from: i, reason: collision with root package name */
    public int f21751i;

    /* renamed from: j, reason: collision with root package name */
    public long f21752j;

    /* renamed from: k, reason: collision with root package name */
    public long f21753k;

    /* renamed from: l, reason: collision with root package name */
    public long f21754l;

    /* renamed from: m, reason: collision with root package name */
    public long f21755m;

    public t(Context context, Map map, int i10, n9.a aVar, boolean z10) {
        int i11;
        this.a = com.google.common.collect.u0.a(map);
        this.f21745c = new u0(i10);
        this.f21746d = aVar;
        this.f21747e = z10;
        if (context != null) {
            n9.w c10 = n9.w.c(context);
            synchronized (c10.f22595d) {
                i11 = c10.a;
            }
            this.f21751i = i11;
            this.f21754l = b(i11);
            r rVar = new r(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c10.f22594c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(rVar));
            ((Handler) c10.f22593b).post(new com.facebook.r0(20, c10, rVar));
            return;
        }
        this.f21751i = 0;
        this.f21754l = b(0);
    }

    public final void a(Handler handler, t7.a aVar) {
        aVar.getClass();
        y7.q qVar = this.f21744b;
        qVar.getClass();
        Iterator it = ((CopyOnWriteArrayList) qVar.f27991b).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f21652b == aVar) {
                dVar.f21653c = true;
                ((CopyOnWriteArrayList) qVar.f27991b).remove(dVar);
            }
        }
        ((CopyOnWriteArrayList) qVar.f27991b).add(new d(handler, aVar));
    }

    public final long b(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        com.google.common.collect.u0 u0Var = this.a;
        Long l10 = (Long) u0Var.get(valueOf);
        if (l10 == null) {
            l10 = (Long) u0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(int i10, long j3, long j10) {
        if (i10 == 0 && j3 == 0 && j10 == this.f21755m) {
            return;
        }
        this.f21755m = j10;
        Iterator it = ((CopyOnWriteArrayList) this.f21744b.f27991b).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!dVar.f21653c) {
                dVar.a.post(new u7.s(dVar, i10, j3, j10, 1));
            }
        }
    }
}
