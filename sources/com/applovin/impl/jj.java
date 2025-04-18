package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes.dex */
public final class jj {
    private final List a;

    /* renamed from: b, reason: collision with root package name */
    private final ro[] f5521b;

    public jj(List list) {
        this.a = list;
        this.f5521b = new ro[list.size()];
    }

    public void a(long j3, yg ygVar) {
        a3.a(j3, ygVar, this.f5521b);
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i10 = 0; i10 < this.f5521b.length; i10++) {
            dVar.a();
            ro a = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.a.get(i10);
            String str = d9Var.f4228m;
            a1.a(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = d9Var.a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a.a(new d9.b().c(str2).f(str).o(d9Var.f4220d).e(d9Var.f4219c).a(d9Var.E).a(d9Var.f4230o).a());
            this.f5521b[i10] = a;
        }
    }
}
