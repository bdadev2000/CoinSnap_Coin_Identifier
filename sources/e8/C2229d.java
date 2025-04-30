package e8;

import java.util.Arrays;

/* renamed from: e8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2229d extends Z {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f20158a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f20158a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        boolean[] zArr = this.f20158a;
        if (zArr.length < i9) {
            int length = zArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20158a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
