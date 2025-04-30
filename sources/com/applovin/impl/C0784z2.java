package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0784z2 implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final List f12494a;

    public C0784z2(List list) {
        this.f12494a = list;
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.kl
    public List b(long j7) {
        if (j7 >= 0) {
            return this.f12494a;
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public int a(long j7) {
        return j7 < 0 ? 0 : -1;
    }

    @Override // com.applovin.impl.kl
    public long a(int i9) {
        AbstractC0669a1.a(i9 == 0);
        return 0L;
    }
}
