package li;

import ki.h0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d {
    public static final int a(h0 h0Var, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        int[] iArr = h0Var.f20992h;
        int i12 = i10 + 1;
        int length = h0Var.f20991g.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 < i12) {
                    i14 = i11 + 1;
                } else {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        if (i11 < 0) {
            return ~i11;
        }
        return i11;
    }
}
