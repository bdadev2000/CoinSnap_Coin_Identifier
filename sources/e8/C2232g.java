package e8;

import java.util.Arrays;

/* renamed from: e8.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2232g extends Z {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f20165a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f20165a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        byte[] bArr = this.f20165a;
        if (bArr.length < i9) {
            int length = bArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20165a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
