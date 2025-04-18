package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class y0 extends v implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public final transient u0 f12056f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f12057g;

    public y0(e2 e2Var, int i10) {
        this.f12056f = e2Var;
        this.f12057g = i10;
    }

    @Override // com.google.common.collect.r1
    public final Map a() {
        return this.f12056f;
    }

    @Override // com.google.common.collect.u
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.r1
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.u
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.u
    public final Set e() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.u
    public final Iterator f() {
        return new v0(this);
    }

    @Override // com.google.common.collect.u
    public final Iterator g() {
        return new w0(this);
    }

    @Override // com.google.common.collect.u, com.google.common.collect.r1
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.r1
    public final int size() {
        return this.f12057g;
    }
}
