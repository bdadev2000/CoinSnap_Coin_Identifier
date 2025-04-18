package wh;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class r0 {
    public static q0 a(String str, g0 g0Var) {
        Intrinsics.checkNotNullParameter(str, "<this>");
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
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return b(bytes, g0Var, 0, bytes.length);
    }

    public static q0 b(byte[] bArr, g0 g0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        long length = bArr.length;
        long j3 = i10;
        long j10 = i11;
        byte[] bArr2 = xh.b.a;
        if ((j3 | j10) >= 0 && j3 <= length && length - j3 >= j10) {
            return new q0(g0Var, bArr, i11, i10);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static q0 c(r0 r0Var, g0 g0Var, byte[] content, int i10, int i11) {
        int i12 = 0;
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            i12 = content.length;
        }
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return b(content, g0Var, i10, i12);
    }

    public static /* synthetic */ q0 d(r0 r0Var, byte[] bArr, g0 g0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            g0Var = null;
        }
        int i12 = 0;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            i12 = bArr.length;
        }
        r0Var.getClass();
        return b(bArr, g0Var, i10, i12);
    }
}
