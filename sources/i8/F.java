package i8;

import com.applovin.sdk.AppLovinEventTypes;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class F {
    public static E a(x xVar, byte[] bArr, int i9, int i10) {
        G7.j.e(bArr, "<this>");
        long length = bArr.length;
        long j7 = i9;
        long j9 = i10;
        byte[] bArr2 = j8.b.f21214a;
        if ((j7 | j9) >= 0 && j7 <= length && length - j7 >= j9) {
            return new E(xVar, bArr, i10, i9);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static E b(String str, x xVar) {
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
        byte[] bytes = str.getBytes(charset);
        G7.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        return a(xVar, bytes, 0, bytes.length);
    }

    public static E c(F f9, x xVar, byte[] bArr, int i9, int i10) {
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        int length = bArr.length;
        f9.getClass();
        G7.j.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return a(xVar, bArr, i9, length);
    }

    public static /* synthetic */ E d(F f9, byte[] bArr, x xVar, int i9, int i10) {
        if ((i10 & 1) != 0) {
            xVar = null;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        int length = bArr.length;
        f9.getClass();
        return a(xVar, bArr, i9, length);
    }
}
