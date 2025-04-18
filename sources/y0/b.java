package y0;

import e0.a0;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b implements j, c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31423a;

    /* renamed from: b, reason: collision with root package name */
    public final j f31424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31425c;

    public b(j jVar, int i2, int i3) {
        this.f31423a = i3;
        if (i3 != 1) {
            p0.a.s(jVar, "sequence");
            this.f31424b = jVar;
            this.f31425c = i2;
            if (i2 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
        }
        p0.a.s(jVar, "sequence");
        this.f31424b = jVar;
        this.f31425c = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // y0.c
    public final j a(int i2) {
        int i3 = this.f31423a;
        j jVar = this.f31424b;
        int i4 = this.f31425c;
        switch (i3) {
            case 0:
                int i5 = i4 + i2;
                return i5 < 0 ? new b(this, i2, 0) : new b(jVar, i5, 0);
            default:
                return i2 >= i4 ? d.f31426a : new q(jVar, i2, i4);
        }
    }

    @Override // y0.c
    public final j b(int i2) {
        int i3 = this.f31423a;
        j jVar = this.f31424b;
        int i4 = this.f31425c;
        switch (i3) {
            case 0:
                int i5 = i4 + i2;
                return i5 < 0 ? new b(this, i2, 1) : new q(jVar, i4, i5);
            default:
                return i2 >= i4 ? this : new b(jVar, i2, 1);
        }
    }

    @Override // y0.j
    public final Iterator iterator() {
        switch (this.f31423a) {
            case 0:
                return new a0(this);
            default:
                return new a0(this, 0);
        }
    }
}
