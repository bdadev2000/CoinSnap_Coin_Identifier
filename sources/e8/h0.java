package e8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h0 extends Z {

    /* renamed from: a, reason: collision with root package name */
    public short[] f20167a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f20167a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        short[] sArr = this.f20167a;
        if (sArr.length < i9) {
            int length = sArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20167a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
