package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class g8 implements ll {
    private final a5 a = new a5();

    /* renamed from: b, reason: collision with root package name */
    private final ol f4850b = new ol();

    /* renamed from: c, reason: collision with root package name */
    private final Deque f4851c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private int f4852d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4853e;

    /* loaded from: classes.dex */
    public static final class a implements kl {
        private final long a;

        /* renamed from: b, reason: collision with root package name */
        private final ab f4854b;

        public a(long j3, ab abVar) {
            this.a = j3;
            this.f4854b = abVar;
        }

        @Override // com.applovin.impl.kl
        public int a() {
            return 1;
        }

        @Override // com.applovin.impl.kl
        public List b(long j3) {
            return j3 >= this.a ? this.f4854b : ab.h();
        }

        @Override // com.applovin.impl.kl
        public long a(int i10) {
            a1.a(i10 == 0);
            return this.a;
        }

        @Override // com.applovin.impl.kl
        public int a(long j3) {
            return this.a > j3 ? 0 : -1;
        }
    }

    public g8() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f4851c.addFirst(new ck(new js(this, 9)));
        }
        this.f4852d = 0;
    }

    @Override // com.applovin.impl.k5
    public void b() {
        a1.b(!this.f4853e);
        this.f4850b.b();
        this.f4852d = 0;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ol d() {
        a1.b(!this.f4853e);
        if (this.f4852d != 0) {
            return null;
        }
        this.f4852d = 1;
        return this.f4850b;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public pl c() {
        a1.b(!this.f4853e);
        if (this.f4852d == 2 && !this.f4851c.isEmpty()) {
            pl plVar = (pl) this.f4851c.removeFirst();
            if (this.f4850b.e()) {
                plVar.b(4);
            } else {
                ol olVar = this.f4850b;
                plVar.a(this.f4850b.f6353f, new a(olVar.f6353f, this.a.a(((ByteBuffer) a1.a(olVar.f6351c)).array())), 0L);
            }
            this.f4850b.b();
            this.f4852d = 0;
            return plVar;
        }
        return null;
    }

    @Override // com.applovin.impl.ll
    public void a(long j3) {
    }

    @Override // com.applovin.impl.k5
    public void a(ol olVar) {
        a1.b(!this.f4853e);
        a1.b(this.f4852d == 1);
        a1.a(this.f4850b == olVar);
        this.f4852d = 2;
    }

    @Override // com.applovin.impl.k5
    public void a() {
        this.f4853e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(pl plVar) {
        a1.b(this.f4851c.size() < 2);
        a1.a(!this.f4851c.contains(plVar));
        plVar.b();
        this.f4851c.addFirst(plVar);
    }
}
