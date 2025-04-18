package com.vungle.ads.internal.network;

import java.io.IOException;
import ki.d0;
import kotlin.jvm.internal.Intrinsics;
import wh.e0;
import wh.f0;
import wh.n0;
import wh.o0;
import wh.s0;
import wh.u0;

/* loaded from: classes4.dex */
public final class r implements f0 {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    public static final p Companion = new p(null);
    private static final String GZIP = "gzip";

    private final s0 gzip(s0 s0Var) throws IOException {
        ki.i iVar = new ki.i();
        d0 e2 = a6.k.e(new ki.s(iVar));
        s0Var.writeTo(e2);
        e2.close();
        return new q(s0Var, iVar);
    }

    @Override // wh.f0
    public u0 intercept(e0 chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ci.f fVar = (ci.f) chain;
        o0 o0Var = fVar.f2805e;
        s0 s0Var = o0Var.f27153d;
        if (s0Var != null && o0Var.a(CONTENT_ENCODING) == null) {
            n0 n0Var = new n0(o0Var);
            n0Var.c(CONTENT_ENCODING, GZIP);
            n0Var.e(o0Var.f27151b, gzip(s0Var));
            return fVar.b(n0Var.b());
        }
        return fVar.b(o0Var);
    }
}
