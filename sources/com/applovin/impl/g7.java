package com.applovin.impl;

import com.applovin.impl.ro;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class g7 implements ro {
    private final byte[] a = new byte[4096];

    @Override // com.applovin.impl.ro
    public void a(long j3, int i10, int i11, int i12, ro.a aVar) {
    }

    @Override // com.applovin.impl.ro
    public void a(d9 d9Var) {
    }

    @Override // com.applovin.impl.ro
    public int a(e5 e5Var, int i10, boolean z10, int i11) {
        int a = e5Var.a(this.a, 0, Math.min(this.a.length, i10));
        if (a != -1) {
            return a;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.applovin.impl.ro
    public void a(yg ygVar, int i10, int i11) {
        ygVar.g(i10);
    }
}
