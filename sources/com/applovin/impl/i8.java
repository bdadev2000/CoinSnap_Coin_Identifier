package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class i8 implements ol {

    /* renamed from: a */
    private final c5 f24430a = new c5();

    /* renamed from: b */
    private final rl f24431b = new rl();

    /* renamed from: c */
    private final Deque f24432c = new ArrayDeque();
    private int d;
    private boolean e;

    /* loaded from: classes.dex */
    public static final class a implements nl {

        /* renamed from: a */
        private final long f24433a;

        /* renamed from: b */
        private final eb f24434b;

        public a(long j2, eb ebVar) {
            this.f24433a = j2;
            this.f24434b = ebVar;
        }

        @Override // com.applovin.impl.nl
        public int a() {
            return 1;
        }

        @Override // com.applovin.impl.nl
        public List b(long j2) {
            return j2 >= this.f24433a ? this.f24434b : eb.h();
        }

        @Override // com.applovin.impl.nl
        public int a(long j2) {
            return this.f24433a > j2 ? 0 : -1;
        }

        @Override // com.applovin.impl.nl
        public long a(int i2) {
            b1.a(i2 == 0);
            return this.f24433a;
        }
    }

    public i8() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.f24432c.addFirst(new fk(new is(this, 10)));
        }
        this.d = 0;
    }

    public static /* synthetic */ void a(i8 i8Var, sl slVar) {
        i8Var.a(slVar);
    }

    @Override // com.applovin.impl.m5
    public void b() {
        b1.b(!this.e);
        this.f24431b.b();
        this.d = 0;
    }

    @Override // com.applovin.impl.m5
    /* renamed from: e */
    public rl d() {
        b1.b(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.f24431b;
    }

    @Override // com.applovin.impl.m5
    /* renamed from: f */
    public sl c() {
        b1.b(!this.e);
        if (this.d != 2 || this.f24432c.isEmpty()) {
            return null;
        }
        sl slVar = (sl) this.f24432c.removeFirst();
        if (this.f24431b.e()) {
            slVar.b(4);
        } else {
            rl rlVar = this.f24431b;
            slVar.a(this.f24431b.f25964f, new a(rlVar.f25964f, this.f24430a.a(((ByteBuffer) b1.a(rlVar.f25963c)).array())), 0L);
        }
        this.f24431b.b();
        this.d = 0;
        return slVar;
    }

    @Override // com.applovin.impl.m5
    public void a() {
        this.e = true;
    }

    @Override // com.applovin.impl.ol
    public void a(long j2) {
    }

    @Override // com.applovin.impl.m5
    public void a(rl rlVar) {
        b1.b(!this.e);
        b1.b(this.d == 1);
        b1.a(this.f24431b == rlVar);
        this.d = 2;
    }

    public void a(sl slVar) {
        b1.b(this.f24432c.size() < 2);
        b1.a(!this.f24432c.contains(slVar));
        slVar.b();
        this.f24432c.addFirst(slVar);
    }
}
