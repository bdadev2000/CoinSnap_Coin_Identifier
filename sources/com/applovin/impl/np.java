package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class np implements kl {
    public static final np b = new np();

    /* renamed from: a, reason: collision with root package name */
    private final List f9365a;

    private np() {
        this.f9365a = Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.kl
    public List b(long j7) {
        if (j7 >= 0) {
            return this.f9365a;
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public int a(long j7) {
        return j7 < 0 ? 0 : -1;
    }

    public np(z4 z4Var) {
        this.f9365a = Collections.singletonList(z4Var);
    }

    @Override // com.applovin.impl.kl
    public long a(int i9) {
        AbstractC0669a1.a(i9 == 0);
        return 0L;
    }
}
