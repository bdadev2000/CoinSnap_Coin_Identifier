package com.vungle.ads.internal.network;

import i8.C;
import i8.G;
import i8.I;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class r implements i8.w {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    public static final p Companion = new p(null);
    private static final String GZIP = "gzip";

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w8.f] */
    private final G gzip(G g9) throws IOException {
        ?? obj = new Object();
        w8.s e4 = r8.k.e(new w8.m(obj));
        g9.writeTo(e4);
        e4.close();
        return new q(g9, obj);
    }

    @Override // i8.w
    public I intercept(i8.v vVar) throws IOException {
        G7.j.e(vVar, "chain");
        n8.f fVar = (n8.f) vVar;
        C c9 = fVar.f21866e;
        G g9 = c9.f20756d;
        if (g9 != null && c9.f20755c.b(CONTENT_ENCODING) == null) {
            i8.B a6 = c9.a();
            a6.c(CONTENT_ENCODING, GZIP);
            a6.d(c9.b, gzip(g9));
            return fVar.b(a6.b());
        }
        return fVar.b(c9);
    }
}
