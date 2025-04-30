package com.applovin.impl;

import com.applovin.impl.ta;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class va {

    /* renamed from: a, reason: collision with root package name */
    private final yg f11713a = new yg(10);

    public we a(j8 j8Var, ta.a aVar) {
        we weVar = null;
        int i9 = 0;
        while (true) {
            try {
                j8Var.c(this.f11713a.c(), 0, 10);
                this.f11713a.f(0);
                if (this.f11713a.z() != 4801587) {
                    break;
                }
                this.f11713a.g(3);
                int v6 = this.f11713a.v();
                int i10 = v6 + 10;
                if (weVar == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f11713a.c(), 0, bArr, 0, 10);
                    j8Var.c(bArr, 10, v6);
                    weVar = new ta(aVar).a(bArr, i10);
                } else {
                    j8Var.c(v6);
                }
                i9 += i10;
            } catch (EOFException unused) {
            }
        }
        j8Var.b();
        j8Var.c(i9);
        return weVar;
    }
}
