package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class u1 implements ra.p, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f12041b;

    public u1(int i10) {
        a6.k.j(i10, "expectedValuesPerKey");
        this.f12041b = i10;
    }

    @Override // ra.p
    public final Object get() {
        return new ArrayList(this.f12041b);
    }
}
