package p8;

import Q7.n0;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class u {
    public static int a(int i9, int i10, int i11) {
        if ((i10 & 8) != 0) {
            i9--;
        }
        if (i11 <= i9) {
            return i9 - i11;
        }
        throw new IOException(n0.e(i11, i9, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
