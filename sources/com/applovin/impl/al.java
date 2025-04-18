package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class al implements nl {

    /* renamed from: a, reason: collision with root package name */
    private final List f22914a;

    /* renamed from: b, reason: collision with root package name */
    private final List f22915b;

    public al(List list, List list2) {
        this.f22914a = list;
        this.f22915b = list2;
    }

    @Override // com.applovin.impl.nl
    public long a(int i2) {
        b1.a(i2 >= 0);
        b1.a(i2 < this.f22915b.size());
        return ((Long) this.f22915b.get(i2)).longValue();
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        int b2 = xp.b(this.f22915b, (Comparable) Long.valueOf(j2), true, false);
        return b2 == -1 ? Collections.emptyList() : (List) this.f22914a.get(b2);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.f22915b.size();
    }

    @Override // com.applovin.impl.nl
    public int a(long j2) {
        int a2 = xp.a(this.f22915b, (Comparable) Long.valueOf(j2), false, false);
        if (a2 < this.f22915b.size()) {
            return a2;
        }
        return -1;
    }
}
