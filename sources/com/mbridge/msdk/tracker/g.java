package com.mbridge.msdk.tracker;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class g implements l {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final r f15372b;

    /* renamed from: c, reason: collision with root package name */
    private final j f15373c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f15374d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private final long[] f15375e = new long[2];

    /* renamed from: f, reason: collision with root package name */
    private volatile i f15376f;

    public g(c cVar, r rVar, j jVar) {
        this.a = cVar;
        this.f15372b = rVar;
        this.f15373c = jVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void b(final e eVar) {
        this.f15373c.b(new Runnable() { // from class: com.mbridge.msdk.tracker.g.1
            private void a(i iVar, int i10) {
                while (i10 > 0) {
                    if (g.this.a.a(iVar) > 0) {
                        g.this.f15372b.c();
                        g.this.f15372b.d();
                        g.this.f15372b.a(eVar);
                        return;
                    }
                    i10--;
                }
                g.this.f15376f = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = new i(eVar);
                iVar.a(1);
                iVar.b(0);
                iVar.a(eVar.h() + System.currentTimeMillis());
                if (g.this.f15376f != null) {
                    a(g.this.f15376f, 5);
                    g.this.f15376f = null;
                }
                a(iVar, 5);
            }
        });
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void a(e eVar) {
        long incrementAndGet = this.f15374d.incrementAndGet();
        this.f15375e[0] = System.currentTimeMillis();
        this.f15375e[1] = incrementAndGet;
    }

    @Override // com.mbridge.msdk.tracker.l
    public final long[] a() {
        long[] jArr = this.f15375e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
