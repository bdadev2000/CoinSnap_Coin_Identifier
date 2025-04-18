package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class h1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f11968b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f11969c;

    public h1(Comparator comparator, Object[] objArr) {
        this.f11968b = comparator;
        this.f11969c = objArr;
    }

    public Object readResolve() {
        g1 g1Var = new g1(this.f11968b);
        g1Var.v(this.f11969c);
        Object[] objArr = g1Var.f11978i;
        g2 q10 = i1.q(g1Var.f11979j, g1Var.f11959l, objArr);
        g1Var.f11979j = q10.size();
        g1Var.f11980k = true;
        return q10;
    }
}
