package mb;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class s2 {
    public static final Charset a = Charset.forName("UTF-8");

    public final b0 a(long j3, boolean z10, String str) {
        b0 b0Var = (b0) this;
        a0 a0Var = new a0(b0Var);
        r2 r2Var = b0Var.f21851k;
        if (r2Var != null) {
            i0 i0Var = new i0((j0) r2Var);
            i0Var.f21940e = Long.valueOf(j3);
            i0Var.f21941f = z10;
            i0Var.f21948m = (byte) (i0Var.f21948m | 2);
            if (str != null) {
                new a4.m().f153b = str;
                i0Var.f21943h = new o1(str);
            }
            a0Var.f21827j = i0Var.a();
        }
        return a0Var.a();
    }
}
