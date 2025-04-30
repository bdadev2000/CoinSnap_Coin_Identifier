package e8;

import java.util.Arrays;

/* renamed from: e8.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2238m extends Z {

    /* renamed from: a, reason: collision with root package name */
    public char[] f20177a;
    public int b;

    @Override // e8.Z
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f20177a, this.b);
        G7.j.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // e8.Z
    public final void b(int i9) {
        char[] cArr = this.f20177a;
        if (cArr.length < i9) {
            int length = cArr.length * 2;
            if (i9 < length) {
                i9 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i9);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f20177a = copyOf;
        }
    }

    @Override // e8.Z
    public final int d() {
        return this.b;
    }
}
