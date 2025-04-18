package com.applovin.impl;

import com.applovin.impl.wg;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
abstract class y2 implements ll {
    private final ArrayDeque a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f9111b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue f9112c;

    /* renamed from: d, reason: collision with root package name */
    private b f9113d;

    /* renamed from: e, reason: collision with root package name */
    private long f9114e;

    /* renamed from: f, reason: collision with root package name */
    private long f9115f;

    /* loaded from: classes.dex */
    public static final class b extends ol implements Comparable {

        /* renamed from: k, reason: collision with root package name */
        private long f9116k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (e() != bVar.e()) {
                return e() ? 1 : -1;
            }
            long j3 = this.f6353f - bVar.f6353f;
            if (j3 == 0) {
                j3 = this.f9116k - bVar.f9116k;
                if (j3 == 0) {
                    return 0;
                }
            }
            return j3 > 0 ? 1 : -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends pl {

        /* renamed from: g, reason: collision with root package name */
        private wg.a f9117g;

        public c(wg.a aVar) {
            this.f9117g = aVar;
        }

        @Override // com.applovin.impl.wg
        public final void g() {
            this.f9117g.a(this);
        }
    }

    public y2() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a.add(new b());
        }
        this.f9111b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f9111b.add(new c(new js(this, 4)));
        }
        this.f9112c = new PriorityQueue();
    }

    @Override // com.applovin.impl.k5
    public void a() {
    }

    public abstract void a(ol olVar);

    @Override // com.applovin.impl.k5
    public void b() {
        this.f9115f = 0L;
        this.f9114e = 0L;
        while (!this.f9112c.isEmpty()) {
            a((b) yp.a((b) this.f9112c.poll()));
        }
        b bVar = this.f9113d;
        if (bVar != null) {
            a(bVar);
            this.f9113d = null;
        }
    }

    public abstract kl e();

    @Override // com.applovin.impl.k5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ol d() {
        boolean z10;
        if (this.f9113d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        if (this.a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.a.pollFirst();
        this.f9113d = bVar;
        return bVar;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public pl c() {
        if (this.f9111b.isEmpty()) {
            return null;
        }
        while (!this.f9112c.isEmpty() && ((b) yp.a((b) this.f9112c.peek())).f6353f <= this.f9114e) {
            b bVar = (b) yp.a((b) this.f9112c.poll());
            if (bVar.e()) {
                pl plVar = (pl) yp.a((pl) this.f9111b.pollFirst());
                plVar.b(4);
                a(bVar);
                return plVar;
            }
            a((ol) bVar);
            if (j()) {
                kl e2 = e();
                pl plVar2 = (pl) yp.a((pl) this.f9111b.pollFirst());
                plVar2.a(bVar.f6353f, e2, Long.MAX_VALUE);
                a(bVar);
                return plVar2;
            }
            a(bVar);
        }
        return null;
    }

    public final pl h() {
        return (pl) this.f9111b.pollFirst();
    }

    public final long i() {
        return this.f9114e;
    }

    public abstract boolean j();

    private void a(b bVar) {
        bVar.b();
        this.a.add(bVar);
    }

    public void a(pl plVar) {
        plVar.b();
        this.f9111b.add(plVar);
    }

    @Override // com.applovin.impl.ll
    public void a(long j3) {
        this.f9114e = j3;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ol olVar) {
        a1.a(olVar == this.f9113d);
        b bVar = (b) olVar;
        if (bVar.d()) {
            a(bVar);
        } else {
            long j3 = this.f9115f;
            this.f9115f = 1 + j3;
            bVar.f9116k = j3;
            this.f9112c.add(bVar);
        }
        this.f9113d = null;
    }
}
