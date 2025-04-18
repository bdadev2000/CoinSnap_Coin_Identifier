package com.applovin.impl;

import com.applovin.impl.ij;

/* loaded from: classes3.dex */
public final class el implements m8 {

    /* renamed from: a, reason: collision with root package name */
    private final long f23731a;

    /* renamed from: b, reason: collision with root package name */
    private final m8 f23732b;

    public el(long j2, m8 m8Var) {
        this.f23731a = j2;
        this.f23732b = m8Var;
    }

    @Override // com.applovin.impl.m8
    public void c() {
        this.f23732b.c();
    }

    @Override // com.applovin.impl.m8
    public void a(ij ijVar) {
        this.f23732b.a(new a(ijVar));
    }

    @Override // com.applovin.impl.m8
    public qo a(int i2, int i3) {
        return this.f23732b.a(i2, i3);
    }

    /* loaded from: classes3.dex */
    public class a implements ij {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ij f23733a;

        public a(ij ijVar) {
            this.f23733a = ijVar;
        }

        @Override // com.applovin.impl.ij
        public ij.a b(long j2) {
            ij.a b2 = this.f23733a.b(j2);
            kj kjVar = b2.f24497a;
            kj kjVar2 = new kj(kjVar.f24923a, el.this.f23731a + kjVar.f24924b);
            kj kjVar3 = b2.f24498b;
            return new ij.a(kjVar2, new kj(kjVar3.f24923a, el.this.f23731a + kjVar3.f24924b));
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.f23733a.d();
        }

        @Override // com.applovin.impl.ij
        public boolean b() {
            return this.f23733a.b();
        }
    }
}
