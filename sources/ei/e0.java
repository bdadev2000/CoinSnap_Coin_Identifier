package ei;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f17415b = new int[10];

    public final int a() {
        if ((this.a & 128) != 0) {
            return this.f17415b[7];
        }
        return 65535;
    }

    public final void b(e0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            boolean z10 = true;
            if (((1 << i10) & other.a) == 0) {
                z10 = false;
            }
            if (z10) {
                c(i10, other.f17415b[i10]);
            }
            i10 = i11;
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f17415b;
            if (i10 < iArr.length) {
                this.a = (1 << i10) | this.a;
                iArr[i10] = i11;
            }
        }
    }
}
