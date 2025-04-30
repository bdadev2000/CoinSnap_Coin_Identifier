package e8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class M extends Z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20129a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f20129a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        long[] jArr = this.f20129a;
        if (jArr.length < i9) {
            int length = jArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20129a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
