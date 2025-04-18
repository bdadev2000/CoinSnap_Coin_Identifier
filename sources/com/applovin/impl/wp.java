package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes.dex */
final class wp {
    private final List a;

    /* renamed from: b, reason: collision with root package name */
    private final ro[] f8828b;

    public wp(List list) {
        this.a = list;
        this.f8828b = new ro[list.size()];
    }

    public void a(long j3, yg ygVar) {
        if (ygVar.a() < 9) {
            return;
        }
        int j10 = ygVar.j();
        int j11 = ygVar.j();
        int w10 = ygVar.w();
        if (j10 == 434 && j11 == 1195456820 && w10 == 3) {
            a3.b(j3, ygVar, this.f8828b);
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i10 = 0; i10 < this.f8828b.length; i10++) {
            dVar.a();
            ro a = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.a.get(i10);
            String str = d9Var.f4228m;
            a1.a(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            a.a(new d9.b().c(dVar.b()).f(str).o(d9Var.f4220d).e(d9Var.f4219c).a(d9Var.E).a(d9Var.f4230o).a());
            this.f8828b[i10] = a;
        }
    }
}
