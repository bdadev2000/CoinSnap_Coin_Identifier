package Q7;

import t7.AbstractC2712a;

/* loaded from: classes3.dex */
public final class T extends Y {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2542g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2543h;

    public /* synthetic */ T(Object obj, int i9) {
        this.f2542g = i9;
        this.f2543h = obj;
    }

    @Override // F7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2542g) {
            case 0:
                l((Throwable) obj);
                return t7.y.f23029a;
            case 1:
                l((Throwable) obj);
                return t7.y.f23029a;
            default:
                l((Throwable) obj);
                return t7.y.f23029a;
        }
    }

    @Override // Q7.Y
    public final void l(Throwable th) {
        switch (this.f2542g) {
            case 0:
                ((F7.l) this.f2543h).invoke(th);
                return;
            case 1:
                Object F4 = k().F();
                boolean z8 = F4 instanceof C0247o;
                C0238f c0238f = (C0238f) this.f2543h;
                if (z8) {
                    c0238f.e(AbstractC2712a.b(((C0247o) F4).f2575a));
                    return;
                } else {
                    c0238f.e(AbstractC0255x.q(F4));
                    return;
                }
            default:
                ((w7.f) this.f2543h).e(t7.y.f23029a);
                return;
        }
    }
}
