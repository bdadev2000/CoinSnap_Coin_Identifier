package com.applovin.impl;

import com.applovin.impl.be;

/* loaded from: classes2.dex */
public abstract class vo {

    /* renamed from: a, reason: collision with root package name */
    private a f27598a;

    /* renamed from: b, reason: collision with root package name */
    private y1 f27599b;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public abstract wo a(ri[] riVarArr, po poVar, be.a aVar, fo foVar);

    public final void a(a aVar, y1 y1Var) {
        this.f27598a = aVar;
        this.f27599b = y1Var;
    }

    public abstract void a(Object obj);

    public abstract boolean b();

    public final y1 a() {
        return (y1) b1.a(this.f27599b);
    }
}
