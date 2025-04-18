package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.y8;

/* loaded from: classes.dex */
public final class x8 implements ej {
    private final y8 a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8959b;

    public x8(y8 y8Var, long j3) {
        this.a = y8Var;
        this.f8959b = j3;
    }

    private gj a(long j3, long j10) {
        return new gj((j3 * 1000000) / this.a.f9152e, this.f8959b + j10);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.a.b();
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        a1.b(this.a.f9158k);
        y8 y8Var = this.a;
        y8.a aVar = y8Var.f9158k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.f9160b;
        int b3 = yp.b(jArr, y8Var.a(j3), true, false);
        gj a = a(b3 == -1 ? 0L : jArr[b3], b3 != -1 ? jArr2[b3] : 0L);
        if (a.a != j3 && b3 != jArr.length - 1) {
            int i10 = b3 + 1;
            return new ej.a(a, a(jArr[i10], jArr2[i10]));
        }
        return new ej.a(a);
    }
}
