package e8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class I extends Z {

    /* renamed from: a, reason: collision with root package name */
    public int[] f20125a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f20125a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        int[] iArr = this.f20125a;
        if (iArr.length < i9) {
            int length = iArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20125a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
