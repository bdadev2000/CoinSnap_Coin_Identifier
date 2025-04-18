package ci;

import ki.i;
import ki.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import wh.a0;
import wh.u0;

/* loaded from: classes5.dex */
public abstract class e {
    public static final l a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f2801b;

    static {
        l lVar = l.f20996f;
        a = a0.p("\"\\");
        f2801b = a0.p("\t ,=");
    }

    public static final boolean a(u0 u0Var) {
        boolean equals;
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (Intrinsics.areEqual(u0Var.f27213b.f27151b, "HEAD")) {
            return false;
        }
        int i10 = u0Var.f27216f;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && xh.b.j(u0Var) == -1) {
            equals = StringsKt__StringsJVMKt.equals("chunked", u0.g(u0Var, "Transfer-Encoding"), true);
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x007c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(ki.i r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.e.b(ki.i, java.util.ArrayList):void");
    }

    public static final String c(i iVar) {
        long c10 = iVar.c(f2801b);
        if (c10 == -1) {
            c10 = iVar.f20994c;
        }
        if (c10 != 0) {
            return iVar.readUtf8(c10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e6, code lost:
    
        if (xh.b.f27681f.matches(r0) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01eb, code lost:
    
        if (r18 == false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0248 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(wh.t r39, wh.d0 r40, wh.z r41) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.e.d(wh.t, wh.d0, wh.z):void");
    }

    public static final boolean e(i iVar) {
        boolean z10 = false;
        while (!iVar.exhausted()) {
            byte k10 = iVar.k(0L);
            boolean z11 = true;
            if (k10 == 44) {
                iVar.readByte();
                z10 = true;
            } else {
                if (k10 != 32 && k10 != 9) {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                iVar.readByte();
            }
        }
        return z10;
    }
}
