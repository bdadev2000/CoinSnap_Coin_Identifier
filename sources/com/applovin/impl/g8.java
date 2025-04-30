package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class g8 implements ll {

    /* renamed from: a */
    private final a5 f7793a = new a5();
    private final ol b = new ol();

    /* renamed from: c */
    private final Deque f7794c = new ArrayDeque();

    /* renamed from: d */
    private int f7795d;

    /* renamed from: e */
    private boolean f7796e;

    /* loaded from: classes.dex */
    public static final class a implements kl {

        /* renamed from: a */
        private final long f7797a;
        private final ab b;

        public a(long j7, ab abVar) {
            this.f7797a = j7;
            this.b = abVar;
        }

        @Override // com.applovin.impl.kl
        public int a() {
            return 1;
        }

        @Override // com.applovin.impl.kl
        public List b(long j7) {
            if (j7 >= this.f7797a) {
                return this.b;
            }
            return ab.h();
        }

        @Override // com.applovin.impl.kl
        public long a(int i9) {
            AbstractC0669a1.a(i9 == 0);
            return this.f7797a;
        }

        @Override // com.applovin.impl.kl
        public int a(long j7) {
            return this.f7797a > j7 ? 0 : -1;
        }
    }

    public g8() {
        for (int i9 = 0; i9 < 2; i9++) {
            this.f7794c.addFirst(new ck(new C(this, 9)));
        }
        this.f7795d = 0;
    }

    public static /* synthetic */ void a(g8 g8Var, pl plVar) {
        g8Var.a(plVar);
    }

    @Override // com.applovin.impl.k5
    public void b() {
        AbstractC0669a1.b(!this.f7796e);
        this.b.b();
        this.f7795d = 0;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: e */
    public ol d() {
        AbstractC0669a1.b(!this.f7796e);
        if (this.f7795d != 0) {
            return null;
        }
        this.f7795d = 1;
        return this.b;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: f */
    public pl c() {
        AbstractC0669a1.b(!this.f7796e);
        if (this.f7795d == 2 && !this.f7794c.isEmpty()) {
            pl plVar = (pl) this.f7794c.removeFirst();
            if (this.b.e()) {
                plVar.b(4);
            } else {
                ol olVar = this.b;
                plVar.a(this.b.f9275f, new a(olVar.f9275f, this.f7793a.a(((ByteBuffer) AbstractC0669a1.a(olVar.f9273c)).array())), 0L);
            }
            this.b.b();
            this.f7795d = 0;
            return plVar;
        }
        return null;
    }

    @Override // com.applovin.impl.ll
    public void a(long j7) {
    }

    @Override // com.applovin.impl.k5
    public void a(ol olVar) {
        AbstractC0669a1.b(!this.f7796e);
        AbstractC0669a1.b(this.f7795d == 1);
        AbstractC0669a1.a(this.b == olVar);
        this.f7795d = 2;
    }

    @Override // com.applovin.impl.k5
    public void a() {
        this.f7796e = true;
    }

    public void a(pl plVar) {
        AbstractC0669a1.b(this.f7794c.size() < 2);
        AbstractC0669a1.a(!this.f7794c.contains(plVar));
        plVar.b();
        this.f7794c.addFirst(plVar);
    }
}
