package com.google.common.collect;

/* loaded from: classes3.dex */
public final class n0 extends a {

    /* renamed from: d, reason: collision with root package name */
    public final r0 f12006d;

    public n0(int i10, r0 r0Var) {
        super(r0Var.size(), i10);
        this.f12006d = r0Var;
    }

    @Override // com.google.common.collect.a
    public final Object b(int i10) {
        return this.f12006d.get(i10);
    }
}
