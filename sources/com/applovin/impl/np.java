package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class np implements kl {

    /* renamed from: b, reason: collision with root package name */
    public static final np f6427b = new np();
    private final List a;

    private np() {
        this.a = Collections.emptyList();
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

    public np(z4 z4Var) {
        this.a = Collections.singletonList(z4Var);
    }

    @Override // com.applovin.impl.kl
    public long a(int i10) {
        a1.a(i10 == 0);
        return 0L;
    }
}
