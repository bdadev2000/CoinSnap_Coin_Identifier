package e8;

import java.util.Arrays;
import t7.C2729r;

/* loaded from: classes3.dex */
public final class q0 extends Z {

    /* renamed from: a, reason: collision with root package name */
    public int[] f20187a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f20187a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return new C2729r(copyOf);
    }

    @Override // e8.Z
    public final void b(int i9) {
        int[] iArr = this.f20187a;
        if (iArr.length < i9) {
            int length = iArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20187a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
