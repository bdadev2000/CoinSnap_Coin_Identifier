package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class z2 implements kl {
    private final List a;

    public z2(List list) {
        this.a = list;
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.kl
    public List b(long j3) {
        return j3 >= 0 ? this.a : Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public int a(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // com.applovin.impl.kl
    public long a(int i10) {
        a1.a(i10 == 0);
        return 0L;
    }
}
