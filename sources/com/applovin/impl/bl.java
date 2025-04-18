package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public final class bl implements k8 {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final k8 f3909b;

    public bl(long j3, k8 k8Var) {
        this.a = j3;
        this.f3909b = k8Var;
    }

    @Override // com.applovin.impl.k8
    public void c() {
        this.f3909b.c();
    }

    @Override // com.applovin.impl.k8
    public void a(ej ejVar) {
        this.f3909b.a(new a(ejVar));
    }

    @Override // com.applovin.impl.k8
    public ro a(int i10, int i11) {
        return this.f3909b.a(i10, i11);
    }

    /* loaded from: classes.dex */
    public class a implements ej {
        final /* synthetic */ ej a;

        public a(ej ejVar) {
            this.a = ejVar;
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j3) {
            ej.a b3 = this.a.b(j3);
            gj gjVar = b3.a;
            gj gjVar2 = new gj(gjVar.a, bl.this.a + gjVar.f4943b);
            gj gjVar3 = b3.f4473b;
            return new ej.a(gjVar2, new gj(gjVar3.a, bl.this.a + gjVar3.f4943b));
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.a.d();
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return this.a.b();
        }
    }
}
