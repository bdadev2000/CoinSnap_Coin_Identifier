package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class xk implements kl {
    private final List a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9059b;

    public xk(List list, List list2) {
        this.a = list;
        this.f9059b = list2;
    }

    @Override // com.applovin.impl.kl
    public long a(int i10) {
        a1.a(i10 >= 0);
        a1.a(i10 < this.f9059b.size());
        return ((Long) this.f9059b.get(i10)).longValue();
    }

    @Override // com.applovin.impl.kl
    public List b(long j3) {
        int b3 = yp.b(this.f9059b, (Comparable) Long.valueOf(j3), true, false);
        if (b3 == -1) {
            return Collections.emptyList();
        }
        return (List) this.a.get(b3);
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.f9059b.size();
    }

    @Override // com.applovin.impl.kl
    public int a(long j3) {
        int a = yp.a(this.f9059b, (Comparable) Long.valueOf(j3), false, false);
        if (a < this.f9059b.size()) {
            return a;
        }
        return -1;
    }
}
