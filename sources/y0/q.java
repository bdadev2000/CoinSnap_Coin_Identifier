package y0;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class q implements j, c {

    /* renamed from: a, reason: collision with root package name */
    public final j f31448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31449b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31450c;

    public q(j jVar, int i2, int i3) {
        p0.a.s(jVar, "sequence");
        this.f31448a = jVar;
        this.f31449b = i2;
        this.f31450c = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("startIndex should be non-negative, but is ", i2).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("endIndex should be non-negative, but is ", i3).toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(android.support.v4.media.d.k("endIndex should be not less than startIndex, but was ", i3, " < ", i2).toString());
        }
    }

    @Override // y0.c
    public final j a(int i2) {
        int i3 = this.f31450c;
        int i4 = this.f31449b;
        if (i2 >= i3 - i4) {
            return d.f31426a;
        }
        return new q(this.f31448a, i4 + i2, i3);
    }

    @Override // y0.c
    public final j b(int i2) {
        int i3 = this.f31450c;
        int i4 = this.f31449b;
        if (i2 >= i3 - i4) {
            return this;
        }
        return new q(this.f31448a, i4, i2 + i4);
    }

    @Override // y0.j
    public final Iterator iterator() {
        return new i(this);
    }
}
