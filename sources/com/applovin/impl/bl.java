package com.applovin.impl;

import com.applovin.impl.ej;

/* loaded from: classes.dex */
public final class bl implements k8 {

    /* renamed from: a, reason: collision with root package name */
    private final long f6889a;
    private final k8 b;

    public bl(long j7, k8 k8Var) {
        this.f6889a = j7;
        this.b = k8Var;
    }

    @Override // com.applovin.impl.k8
    public void c() {
        this.b.c();
    }

    @Override // com.applovin.impl.k8
    public void a(ej ejVar) {
        this.b.a(new a(ejVar));
    }

    @Override // com.applovin.impl.k8
    public ro a(int i9, int i10) {
        return this.b.a(i9, i10);
    }

    /* loaded from: classes.dex */
    public class a implements ej {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ej f6890a;

        public a(ej ejVar) {
            this.f6890a = ejVar;
        }

        @Override // com.applovin.impl.ej
        public ej.a b(long j7) {
            ej.a b = this.f6890a.b(j7);
            gj gjVar = b.f7443a;
            gj gjVar2 = new gj(gjVar.f7918a, bl.this.f6889a + gjVar.b);
            gj gjVar3 = b.b;
            return new ej.a(gjVar2, new gj(gjVar3.f7918a, bl.this.f6889a + gjVar3.b));
        }

        @Override // com.applovin.impl.ej
        public long d() {
            return this.f6890a.d();
        }

        @Override // com.applovin.impl.ej
        public boolean b() {
            return this.f6890a.b();
        }
    }
}
