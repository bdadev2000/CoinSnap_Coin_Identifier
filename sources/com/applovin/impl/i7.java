package com.applovin.impl;

import com.applovin.impl.qo;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class i7 implements qo {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24429a = new byte[4096];

    @Override // com.applovin.impl.qo
    public void a(long j2, int i2, int i3, int i4, qo.a aVar) {
    }

    @Override // com.applovin.impl.qo
    public void a(f9 f9Var) {
    }

    @Override // com.applovin.impl.qo
    public int a(g5 g5Var, int i2, boolean z2, int i3) {
        int a2 = g5Var.a(this.f24429a, 0, Math.min(this.f24429a.length, i2));
        if (a2 != -1) {
            return a2;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.applovin.impl.qo
    public void a(bh bhVar, int i2, int i3) {
        bhVar.g(i2);
    }
}
