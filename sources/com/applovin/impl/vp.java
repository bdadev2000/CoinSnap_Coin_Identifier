package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import java.util.List;

/* loaded from: classes2.dex */
final class vp {

    /* renamed from: a, reason: collision with root package name */
    private final List f27600a;

    /* renamed from: b, reason: collision with root package name */
    private final qo[] f27601b;

    public vp(List list) {
        this.f27600a = list;
        this.f27601b = new qo[list.size()];
    }

    public void a(long j2, bh bhVar) {
        if (bhVar.a() < 9) {
            return;
        }
        int j3 = bhVar.j();
        int j4 = bhVar.j();
        int w = bhVar.w();
        if (j3 == 434 && j4 == 1195456820 && w == 3) {
            c3.b(j2, bhVar, this.f27601b);
        }
    }

    public void a(m8 m8Var, dp.d dVar) {
        for (int i2 = 0; i2 < this.f27601b.length; i2++) {
            dVar.a();
            qo a2 = m8Var.a(dVar.c(), 3);
            f9 f9Var = (f9) this.f27600a.get(i2);
            String str = f9Var.f23840m;
            b1.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            a2.a(new f9.b().c(dVar.b()).f(str).o(f9Var.d).e(f9Var.f23832c).a(f9Var.E).a(f9Var.f23842o).a());
            this.f27601b[i2] = a2;
        }
    }
}
