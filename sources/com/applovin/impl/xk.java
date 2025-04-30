package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class xk implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final List f12277a;
    private final List b;

    public xk(List list, List list2) {
        this.f12277a = list;
        this.b = list2;
    }

    @Override // com.applovin.impl.kl
    public long a(int i9) {
        AbstractC0669a1.a(i9 >= 0);
        AbstractC0669a1.a(i9 < this.b.size());
        return ((Long) this.b.get(i9)).longValue();
    }

    @Override // com.applovin.impl.kl
    public List b(long j7) {
        int b = yp.b(this.b, (Comparable) Long.valueOf(j7), true, false);
        if (b == -1) {
            return Collections.emptyList();
        }
        return (List) this.f12277a.get(b);
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.b.size();
    }

    @Override // com.applovin.impl.kl
    public int a(long j7) {
        int a6 = yp.a(this.b, (Comparable) Long.valueOf(j7), false, false);
        if (a6 < this.b.size()) {
            return a6;
        }
        return -1;
    }
}
