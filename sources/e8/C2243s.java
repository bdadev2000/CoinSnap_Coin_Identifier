package e8;

import java.util.Arrays;

/* renamed from: e8.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2243s extends Z {

    /* renamed from: a, reason: collision with root package name */
    public double[] f20190a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f20190a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        double[] dArr = this.f20190a;
        if (dArr.length < i9) {
            int length = dArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20190a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
