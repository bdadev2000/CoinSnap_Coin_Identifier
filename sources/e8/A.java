package e8;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class A extends Z {

    /* renamed from: a, reason: collision with root package name */
    public float[] f20115a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f20115a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        float[] fArr = this.f20115a;
        if (fArr.length < i9) {
            int length = fArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20115a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
