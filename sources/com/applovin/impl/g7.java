package com.applovin.impl;

import com.applovin.impl.ro;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class g7 implements ro {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7792a = new byte[4096];

    @Override // com.applovin.impl.ro
    public void a(long j7, int i9, int i10, int i11, ro.a aVar) {
    }

    @Override // com.applovin.impl.ro
    public void a(d9 d9Var) {
    }

    @Override // com.applovin.impl.ro
    public int a(e5 e5Var, int i9, boolean z8, int i10) {
        int a6 = e5Var.a(this.f7792a, 0, Math.min(this.f7792a.length, i9));
        if (a6 != -1) {
            return a6;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.applovin.impl.ro
    public void a(yg ygVar, int i9, int i10) {
        ygVar.g(i9);
    }
}
