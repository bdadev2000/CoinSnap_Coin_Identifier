package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j0 {
    public static boolean a(Object obj, J5.a aVar) {
        int e4 = aVar.e();
        int i9 = e4 >>> 3;
        int i10 = e4 & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            ((i0) obj).c((i9 << 3) | 5, Integer.valueOf(aVar.o()));
                            return true;
                        }
                        throw A.b();
                    }
                    i0 b = i0.b();
                    int i11 = i9 << 3;
                    int i12 = i11 | 4;
                    while (aVar.c() != Integer.MAX_VALUE && a(b, aVar)) {
                    }
                    if (i12 == aVar.e()) {
                        b.f4580e = false;
                        ((i0) obj).c(i11 | 3, b);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((i0) obj).c((i9 << 3) | 2, aVar.h());
                return true;
            }
            ((i0) obj).c((i9 << 3) | 1, Long.valueOf(aVar.q()));
            return true;
        }
        ((i0) obj).c(i9 << 3, Long.valueOf(aVar.z()));
        return true;
    }
}
