package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class b3 implements nl {

    /* renamed from: a, reason: collision with root package name */
    private final List f22978a;

    public b3(List list) {
        this.f22978a = list;
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        return j2 >= 0 ? this.f22978a : Collections.emptyList();
    }

    @Override // com.applovin.impl.nl
    public int a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // com.applovin.impl.nl
    public long a(int i2) {
        b1.a(i2 == 0);
        return 0L;
    }
}
