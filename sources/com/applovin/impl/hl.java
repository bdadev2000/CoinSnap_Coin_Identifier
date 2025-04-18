package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class hl implements kl {
    private final z4[] a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f5172b;

    public hl(z4[] z4VarArr, long[] jArr) {
        this.a = z4VarArr;
        this.f5172b = jArr;
    }

    @Override // com.applovin.impl.kl
    public long a(int i10) {
        a1.a(i10 >= 0);
        a1.a(i10 < this.f5172b.length);
        return this.f5172b[i10];
    }

    @Override // com.applovin.impl.kl
    public List b(long j3) {
        z4 z4Var;
        int b3 = yp.b(this.f5172b, j3, true, false);
        if (b3 != -1 && (z4Var = this.a[b3]) != z4.f9319s) {
            return Collections.singletonList(z4Var);
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.f5172b.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j3) {
        int a = yp.a(this.f5172b, j3, false, false);
        if (a < this.f5172b.length) {
            return a;
        }
        return -1;
    }
}
