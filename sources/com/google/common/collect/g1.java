package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class g1 extends z0 {

    /* renamed from: l, reason: collision with root package name */
    public final Comparator f11959l;

    public g1(Comparator comparator) {
        comparator.getClass();
        this.f11959l = comparator;
    }

    @Override // com.google.common.collect.z0
    public final b1 A() {
        Object[] objArr = this.f11978i;
        g2 q10 = i1.q(this.f11979j, this.f11959l, objArr);
        this.f11979j = q10.size();
        this.f11980k = true;
        return q10;
    }

    @Override // com.google.common.collect.z0, va.b
    public final va.b d(Object obj) {
        super.d(obj);
        return this;
    }

    @Override // com.google.common.collect.z0
    /* renamed from: y */
    public final z0 d(Object obj) {
        super.d(obj);
        return this;
    }

    @Override // com.google.common.collect.z0
    public final z0 z(Object[] objArr) {
        throw null;
    }
}
