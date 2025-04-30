package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class hl implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final z4[] f8150a;
    private final long[] b;

    public hl(z4[] z4VarArr, long[] jArr) {
        this.f8150a = z4VarArr;
        this.b = jArr;
    }

    @Override // com.applovin.impl.kl
    public long a(int i9) {
        AbstractC0669a1.a(i9 >= 0);
        AbstractC0669a1.a(i9 < this.b.length);
        return this.b[i9];
    }

    @Override // com.applovin.impl.kl
    public List b(long j7) {
        z4 z4Var;
        int b = yp.b(this.b, j7, true, false);
        if (b != -1 && (z4Var = this.f8150a[b]) != z4.f12503s) {
            return Collections.singletonList(z4Var);
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.b.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j7) {
        int a6 = yp.a(this.b, j7, false, false);
        if (a6 < this.b.length) {
            return a6;
        }
        return -1;
    }
}
