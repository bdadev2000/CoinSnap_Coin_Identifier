package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import java.util.List;

/* loaded from: classes.dex */
public final class nj {

    /* renamed from: a, reason: collision with root package name */
    private final List f25723a;

    /* renamed from: b, reason: collision with root package name */
    private final qo[] f25724b;

    public nj(List list) {
        this.f25723a = list;
        this.f25724b = new qo[list.size()];
    }

    public void a(long j2, bh bhVar) {
        c3.a(j2, bhVar, this.f25724b);
    }

    public void a(m8 m8Var, dp.d dVar) {
        for (int i2 = 0; i2 < this.f25724b.length; i2++) {
            dVar.a();
            qo a2 = m8Var.a(dVar.c(), 3);
            f9 f9Var = (f9) this.f25723a.get(i2);
            String str = f9Var.f23840m;
            b1.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = f9Var.f23830a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a2.a(new f9.b().c(str2).f(str).o(f9Var.d).e(f9Var.f23832c).a(f9Var.E).a(f9Var.f23842o).a());
            this.f25724b[i2] = a2;
        }
    }
}
