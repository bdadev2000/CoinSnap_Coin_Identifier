package com.applovin.impl;

import com.applovin.impl.ta;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class va {
    private final yg a = new yg(10);

    public we a(j8 j8Var, ta.a aVar) {
        we weVar = null;
        int i10 = 0;
        while (true) {
            try {
                j8Var.c(this.a.c(), 0, 10);
                this.a.f(0);
                if (this.a.z() != 4801587) {
                    break;
                }
                this.a.g(3);
                int v10 = this.a.v();
                int i11 = v10 + 10;
                if (weVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.a.c(), 0, bArr, 0, 10);
                    j8Var.c(bArr, 10, v10);
                    weVar = new ta(aVar).a(bArr, i11);
                } else {
                    j8Var.c(v10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        j8Var.b();
        j8Var.c(i10);
        return weVar;
    }
}
