package i8;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class L {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, w8.h, w8.f] */
    public static K a(String str, x xVar) {
        G7.j.e(str, "<this>");
        Charset charset = O7.a.f2244a;
        if (xVar != null) {
            Pattern pattern = x.f20893c;
            Charset a6 = xVar.a(null);
            if (a6 == null) {
                xVar = r8.k.u(xVar + "; charset=utf-8");
            } else {
                charset = a6;
            }
        }
        ?? obj = new Object();
        G7.j.e(charset, "charset");
        obj.s(str, 0, str.length(), charset);
        return b(obj, xVar, obj.f24014c);
    }

    public static K b(w8.h hVar, x xVar, long j7) {
        G7.j.e(hVar, "<this>");
        return new K(xVar, j7, hVar, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w8.h, w8.f] */
    public static K c(byte[] bArr, x xVar) {
        G7.j.e(bArr, "<this>");
        ?? obj = new Object();
        obj.m(bArr, 0, bArr.length);
        return b(obj, xVar, bArr.length);
    }
}
