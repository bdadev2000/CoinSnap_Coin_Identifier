package com.applovin.impl;

import com.applovin.impl.xa;
import java.io.EOFException;

/* loaded from: classes4.dex */
public final class za {

    /* renamed from: a, reason: collision with root package name */
    private final bh f28318a = new bh(10);

    public bf a(l8 l8Var, xa.a aVar) {
        bf bfVar = null;
        int i2 = 0;
        while (true) {
            try {
                l8Var.c(this.f28318a.c(), 0, 10);
                this.f28318a.f(0);
                if (this.f28318a.z() != 4801587) {
                    break;
                }
                this.f28318a.g(3);
                int v2 = this.f28318a.v();
                int i3 = v2 + 10;
                if (bfVar == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f28318a.c(), 0, bArr, 0, 10);
                    l8Var.c(bArr, 10, v2);
                    bfVar = new xa(aVar).a(bArr, i3);
                } else {
                    l8Var.c(v2);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        l8Var.b();
        l8Var.c(i2);
        return bfVar;
    }
}
