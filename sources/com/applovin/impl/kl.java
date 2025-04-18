package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class kl implements nl {

    /* renamed from: a, reason: collision with root package name */
    private final b5[] f24927a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f24928b;

    public kl(b5[] b5VarArr, long[] jArr) {
        this.f24927a = b5VarArr;
        this.f24928b = jArr;
    }

    @Override // com.applovin.impl.nl
    public long a(int i2) {
        b1.a(i2 >= 0);
        b1.a(i2 < this.f24928b.length);
        return this.f24928b[i2];
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        b5 b5Var;
        int b2 = xp.b(this.f24928b, j2, true, false);
        return (b2 == -1 || (b5Var = this.f24927a[b2]) == b5.f22988s) ? Collections.emptyList() : Collections.singletonList(b5Var);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.f24928b.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j2) {
        int a2 = xp.a(this.f24928b, j2, false, false);
        if (a2 < this.f24928b.length) {
            return a2;
        }
        return -1;
    }
}
