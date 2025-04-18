package wh;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class x0 {
    public static w0 a(String string, g0 g0Var) {
        Intrinsics.checkNotNullParameter(string, "<this>");
        Charset charset = Charsets.UTF_8;
        if (g0Var != null) {
            Pattern pattern = g0.f27059d;
            Charset a = g0Var.a(null);
            if (a == null) {
                g0Var = a0.E(g0Var + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        ki.i iVar = new ki.i();
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        iVar.W(string, 0, string.length(), charset);
        return b(iVar, g0Var, iVar.f20994c);
    }

    public static w0 b(ki.k kVar, g0 g0Var, long j3) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new w0(g0Var, j3, kVar);
    }

    public static w0 c(byte[] source, g0 g0Var) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        ki.i iVar = new ki.i();
        Intrinsics.checkNotNullParameter(source, "source");
        iVar.u(0, source.length, source);
        return b(iVar, g0Var, source.length);
    }
}
