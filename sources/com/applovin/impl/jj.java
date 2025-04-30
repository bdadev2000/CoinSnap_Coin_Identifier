package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes.dex */
public final class jj {

    /* renamed from: a, reason: collision with root package name */
    private final List f8479a;
    private final ro[] b;

    public jj(List list) {
        this.f8479a = list;
        this.b = new ro[list.size()];
    }

    public void a(long j7, yg ygVar) {
        AbstractC0671a3.a(j7, ygVar, this.b);
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i9 = 0; i9 < this.b.length; i9++) {
            dVar.a();
            ro a6 = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.f8479a.get(i9);
            String str = d9Var.m;
            AbstractC0669a1.a(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = d9Var.f7202a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a6.a(new d9.b().c(str2).f(str).o(d9Var.f7204d).e(d9Var.f7203c).a(d9Var.f7199E).a(d9Var.f7212o).a());
            this.b[i9] = a6;
        }
    }
}
