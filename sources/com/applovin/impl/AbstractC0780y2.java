package com.applovin.impl;

import com.applovin.impl.wg;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0780y2 implements ll {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f12315a = new ArrayDeque();
    private final ArrayDeque b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue f12316c;

    /* renamed from: d, reason: collision with root package name */
    private b f12317d;

    /* renamed from: e, reason: collision with root package name */
    private long f12318e;

    /* renamed from: f, reason: collision with root package name */
    private long f12319f;

    /* renamed from: com.applovin.impl.y2$b */
    /* loaded from: classes.dex */
    public static final class b extends ol implements Comparable {

        /* renamed from: k, reason: collision with root package name */
        private long f12320k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (e() != bVar.e()) {
                return e() ? 1 : -1;
            }
            long j7 = this.f9275f - bVar.f9275f;
            if (j7 == 0) {
                j7 = this.f12320k - bVar.f12320k;
                if (j7 == 0) {
                    return 0;
                }
            }
            return j7 > 0 ? 1 : -1;
        }
    }

    /* renamed from: com.applovin.impl.y2$c */
    /* loaded from: classes.dex */
    public static final class c extends pl {

        /* renamed from: g, reason: collision with root package name */
        private wg.a f12321g;

        public c(wg.a aVar) {
            this.f12321g = aVar;
        }

        @Override // com.applovin.impl.wg
        public final void g() {
            this.f12321g.a(this);
        }
    }

    public AbstractC0780y2() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.f12315a.add(new b());
        }
        this.b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            this.b.add(new c(new C(this, 4)));
        }
        this.f12316c = new PriorityQueue();
    }

    @Override // com.applovin.impl.k5
    public void a() {
    }

    public abstract void a(ol olVar);

    @Override // com.applovin.impl.k5
    public void b() {
        this.f12319f = 0L;
        this.f12318e = 0L;
        while (!this.f12316c.isEmpty()) {
            a((b) yp.a((b) this.f12316c.poll()));
        }
        b bVar = this.f12317d;
        if (bVar != null) {
            a(bVar);
            this.f12317d = null;
        }
    }

    public abstract kl e();

    @Override // com.applovin.impl.k5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ol d() {
        boolean z8;
        if (this.f12317d == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        if (this.f12315a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f12315a.pollFirst();
        this.f12317d = bVar;
        return bVar;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public pl c() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.f12316c.isEmpty() && ((b) yp.a((b) this.f12316c.peek())).f9275f <= this.f12318e) {
            b bVar = (b) yp.a((b) this.f12316c.poll());
            if (bVar.e()) {
                pl plVar = (pl) yp.a((pl) this.b.pollFirst());
                plVar.b(4);
                a(bVar);
                return plVar;
            }
            a((ol) bVar);
            if (j()) {
                kl e4 = e();
                pl plVar2 = (pl) yp.a((pl) this.b.pollFirst());
                plVar2.a(bVar.f9275f, e4, Long.MAX_VALUE);
                a(bVar);
                return plVar2;
            }
            a(bVar);
        }
        return null;
    }

    public final pl h() {
        return (pl) this.b.pollFirst();
    }

    public final long i() {
        return this.f12318e;
    }

    public abstract boolean j();

    private void a(b bVar) {
        bVar.b();
        this.f12315a.add(bVar);
    }

    public void a(pl plVar) {
        plVar.b();
        this.b.add(plVar);
    }

    @Override // com.applovin.impl.ll
    public void a(long j7) {
        this.f12318e = j7;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ol olVar) {
        AbstractC0669a1.a(olVar == this.f12317d);
        b bVar = (b) olVar;
        if (bVar.d()) {
            a(bVar);
        } else {
            long j7 = this.f12319f;
            this.f12319f = 1 + j7;
            bVar.f12320k = j7;
            this.f12316c.add(bVar);
        }
        this.f12317d = null;
    }
}
