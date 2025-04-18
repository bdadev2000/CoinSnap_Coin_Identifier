package n1;

/* loaded from: classes2.dex */
public final class l0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31100c;
    public final l1.g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k1.a aVar, k1.a aVar2, int i2) {
        super(aVar, aVar2);
        this.f31100c = i2;
        int i3 = 0;
        int i4 = 1;
        if (i2 != 1) {
            this.d = e1.t0.h("kotlin.collections.Map.Entry", l1.c.d, new l1.f[0], new k0(aVar, aVar2, i3));
        } else {
            super(aVar, aVar2);
            this.d = e1.t0.g("kotlin.Pair", new l1.f[0], new k0(aVar, aVar2, i4));
        }
    }

    @Override // k1.a
    public final l1.f b() {
        return this.d;
    }
}
