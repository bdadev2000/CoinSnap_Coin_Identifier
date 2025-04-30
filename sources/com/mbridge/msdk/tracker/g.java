package com.mbridge.msdk.tracker;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f18112a;
    private final r b;

    /* renamed from: c, reason: collision with root package name */
    private final j f18113c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f18114d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private final long[] f18115e = new long[2];

    /* renamed from: f, reason: collision with root package name */
    private volatile i f18116f;

    public g(c cVar, r rVar, j jVar) {
        this.f18112a = cVar;
        this.b = rVar;
        this.f18113c = jVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void b(final e eVar) {
        this.f18113c.b(new Runnable() { // from class: com.mbridge.msdk.tracker.g.1
            private void a(i iVar, int i9) {
                while (i9 > 0) {
                    if (g.this.f18112a.a(iVar) > 0) {
                        g.this.b.c();
                        g.this.b.d();
                        g.this.b.a(eVar);
                        return;
                    }
                    i9--;
                }
                g.this.f18116f = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = new i(eVar);
                iVar.a(1);
                iVar.b(0);
                iVar.a(eVar.h() + System.currentTimeMillis());
                if (g.this.f18116f != null) {
                    a(g.this.f18116f, 5);
                    g.this.f18116f = null;
                }
                a(iVar, 5);
            }
        });
    }

    @Override // com.mbridge.msdk.tracker.l
    public final void a(e eVar) {
        long incrementAndGet = this.f18114d.incrementAndGet();
        this.f18115e[0] = System.currentTimeMillis();
        this.f18115e[1] = incrementAndGet;
    }

    @Override // com.mbridge.msdk.tracker.l
    public final long[] a() {
        long[] jArr = this.f18115e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
