package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class rf implements nl {

    /* renamed from: a, reason: collision with root package name */
    private final List f26306a;

    public rf(List list) {
        this.f26306a = Collections.unmodifiableList(list);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        return j2 >= 0 ? this.f26306a : Collections.emptyList();
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
