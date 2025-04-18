package com.applovin.impl;

import com.applovin.impl.zg;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class a3 implements ol {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f22671a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f22672b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue f22673c;
    private b d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private long f22674f;

    /* loaded from: classes3.dex */
    public static final class b extends rl implements Comparable {

        /* renamed from: k, reason: collision with root package name */
        private long f22675k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (e() != bVar.e()) {
                return e() ? 1 : -1;
            }
            long j2 = this.f25964f - bVar.f25964f;
            if (j2 == 0) {
                j2 = this.f22675k - bVar.f22675k;
                if (j2 == 0) {
                    return 0;
                }
            }
            return j2 > 0 ? 1 : -1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends sl {

        /* renamed from: g, reason: collision with root package name */
        private zg.a f22676g;

        public c(zg.a aVar) {
            this.f22676g = aVar;
        }

        @Override // com.applovin.impl.zg
        public final void g() {
            this.f22676g.a(this);
        }
    }

    public a3() {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            this.f22671a.add(new b());
        }
        this.f22672b = new ArrayDeque();
        for (int i4 = 0; i4 < 2; i4++) {
            this.f22672b.add(new c(new is(this, i2)));
        }
        this.f22673c = new PriorityQueue();
    }

    @Override // com.applovin.impl.m5
    public void a() {
    }

    public abstract void a(rl rlVar);

    @Override // com.applovin.impl.m5
    public void b() {
        this.f22674f = 0L;
        this.e = 0L;
        while (!this.f22673c.isEmpty()) {
            a((b) xp.a((b) this.f22673c.poll()));
        }
        b bVar = this.d;
        if (bVar != null) {
            a(bVar);
            this.d = null;
        }
    }

    public abstract nl e();

    @Override // com.applovin.impl.m5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public rl d() {
        b1.b(this.d == null);
        if (this.f22671a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f22671a.pollFirst();
        this.d = bVar;
        return bVar;
    }

    @Override // com.applovin.impl.m5
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public sl c() {
        if (this.f22672b.isEmpty()) {
            return null;
        }
        while (!this.f22673c.isEmpty() && ((b) xp.a((b) this.f22673c.peek())).f25964f <= this.e) {
            b bVar = (b) xp.a((b) this.f22673c.poll());
            if (bVar.e()) {
                sl slVar = (sl) xp.a((sl) this.f22672b.pollFirst());
                slVar.b(4);
                a(bVar);
                return slVar;
            }
            a((rl) bVar);
            if (j()) {
                nl e = e();
                sl slVar2 = (sl) xp.a((sl) this.f22672b.pollFirst());
                slVar2.a(bVar.f25964f, e, Long.MAX_VALUE);
                a(bVar);
                return slVar2;
            }
            a(bVar);
        }
        return null;
    }

    public final sl h() {
        return (sl) this.f22672b.pollFirst();
    }

    public final long i() {
        return this.e;
    }

    public abstract boolean j();

    @Override // com.applovin.impl.ol
    public void a(long j2) {
        this.e = j2;
    }

    private void a(b bVar) {
        bVar.b();
        this.f22671a.add(bVar);
    }

    @Override // com.applovin.impl.m5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(rl rlVar) {
        b1.a(rlVar == this.d);
        b bVar = (b) rlVar;
        if (!bVar.d()) {
            long j2 = this.f22674f;
            this.f22674f = 1 + j2;
            bVar.f22675k = j2;
            this.f22673c.add(bVar);
        } else {
            a(bVar);
        }
        this.d = null;
    }

    public void a(sl slVar) {
        slVar.b();
        this.f22672b.add(slVar);
    }
}
