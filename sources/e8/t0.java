package e8;

import java.util.Arrays;
import t7.C2731t;

/* loaded from: classes3.dex */
public final class t0 extends Z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20193a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f20193a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return new C2731t(copyOf);
    }

    @Override // e8.Z
    public final void b(int i9) {
        long[] jArr = this.f20193a;
        if (jArr.length < i9) {
            int length = jArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20193a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
