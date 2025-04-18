package com.applovin.impl;

import com.applovin.impl.a9;
import com.applovin.impl.ij;

/* loaded from: classes4.dex */
public final class z8 implements ij {

    /* renamed from: a, reason: collision with root package name */
    private final a9 f28313a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28314b;

    public z8(a9 a9Var, long j2) {
        this.f28313a = a9Var;
        this.f28314b = j2;
    }

    private kj a(long j2, long j3) {
        return new kj((j2 * 1000000) / this.f28313a.e, this.f28314b + j3);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f28313a.b();
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        b1.b(this.f28313a.f22719k);
        a9 a9Var = this.f28313a;
        a9.a aVar = a9Var.f22719k;
        long[] jArr = aVar.f22721a;
        long[] jArr2 = aVar.f22722b;
        int b2 = xp.b(jArr, a9Var.a(j2), true, false);
        kj a2 = a(b2 == -1 ? 0L : jArr[b2], b2 != -1 ? jArr2[b2] : 0L);
        if (a2.f24923a != j2 && b2 != jArr.length - 1) {
            int i2 = b2 + 1;
            return new ij.a(a2, a(jArr[i2], jArr2[i2]));
        }
        return new ij.a(a2);
    }
}
