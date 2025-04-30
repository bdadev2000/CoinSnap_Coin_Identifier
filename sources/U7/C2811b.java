package u7;

import Q7.n0;
import java.util.RandomAccess;

/* renamed from: u7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2811b extends AbstractC2812c implements RandomAccess {
    public final AbstractC2812c b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23445d;

    public C2811b(AbstractC2812c abstractC2812c, int i9, int i10) {
        G7.j.e(abstractC2812c, "list");
        this.b = abstractC2812c;
        this.f23444c = i9;
        R2.b.j(i9, i10, abstractC2812c.b());
        this.f23445d = i10 - i9;
    }

    @Override // u7.AbstractC2812c
    public final int b() {
        return this.f23445d;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        int i10 = this.f23445d;
        if (i9 >= 0 && i9 < i10) {
            return this.b.get(this.f23444c + i9);
        }
        throw new IndexOutOfBoundsException(n0.e(i9, i10, "index: ", ", size: "));
    }
}
