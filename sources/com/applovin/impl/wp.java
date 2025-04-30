package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes.dex */
final class wp {

    /* renamed from: a, reason: collision with root package name */
    private final List f12038a;
    private final ro[] b;

    public wp(List list) {
        this.f12038a = list;
        this.b = new ro[list.size()];
    }

    public void a(long j7, yg ygVar) {
        if (ygVar.a() < 9) {
            return;
        }
        int j9 = ygVar.j();
        int j10 = ygVar.j();
        int w2 = ygVar.w();
        if (j9 == 434 && j10 == 1195456820 && w2 == 3) {
            AbstractC0671a3.b(j7, ygVar, this.b);
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i9 = 0; i9 < this.b.length; i9++) {
            dVar.a();
            ro a6 = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.f12038a.get(i9);
            String str = d9Var.m;
            AbstractC0669a1.a(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            a6.a(new d9.b().c(dVar.b()).f(str).o(d9Var.f7204d).e(d9Var.f7203c).a(d9Var.f7199E).a(d9Var.f7212o).a());
            this.b[i9] = a6;
        }
    }
}
