package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class mp implements nl {

    /* renamed from: b, reason: collision with root package name */
    public static final mp f25601b = new mp();

    /* renamed from: a, reason: collision with root package name */
    private final List f25602a;

    private mp() {
        this.f25602a = Collections.emptyList();
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        return j2 >= 0 ? this.f25602a : Collections.emptyList();
    }

    @Override // com.applovin.impl.nl
    public int a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    public mp(b5 b5Var) {
        this.f25602a = Collections.singletonList(b5Var);
    }

    @Override // com.applovin.impl.nl
    public long a(int i2) {
        b1.a(i2 == 0);
        return 0L;
    }
}
