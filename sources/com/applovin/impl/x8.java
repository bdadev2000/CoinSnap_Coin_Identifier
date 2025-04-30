package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.y8;

/* loaded from: classes.dex */
public final class x8 implements ej {

    /* renamed from: a, reason: collision with root package name */
    private final y8 f12160a;
    private final long b;

    public x8(y8 y8Var, long j7) {
        this.f12160a = y8Var;
        this.b = j7;
    }

    private gj a(long j7, long j9) {
        return new gj((j7 * 1000000) / this.f12160a.f12355e, this.b + j9);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f12160a.b();
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        AbstractC0669a1.b(this.f12160a.f12361k);
        y8 y8Var = this.f12160a;
        y8.a aVar = y8Var.f12361k;
        long[] jArr = aVar.f12362a;
        long[] jArr2 = aVar.b;
        int b = yp.b(jArr, y8Var.a(j7), true, false);
        gj a6 = a(b == -1 ? 0L : jArr[b], b != -1 ? jArr2[b] : 0L);
        if (a6.f7918a != j7 && b != jArr.length - 1) {
            int i9 = b + 1;
            return new ej.a(a6, a(jArr[i9], jArr2[i9]));
        }
        return new ej.a(a6);
    }
}
