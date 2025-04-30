package o4;

/* loaded from: classes2.dex */
public final class o implements N4.b {

    /* renamed from: c, reason: collision with root package name */
    public static final com.applovin.impl.sdk.ad.g f21967c = new com.applovin.impl.sdk.ad.g(28);

    /* renamed from: d, reason: collision with root package name */
    public static final U4.m f21968d = new U4.m(6);

    /* renamed from: a, reason: collision with root package name */
    public N4.a f21969a;
    public volatile N4.b b;

    public o(com.applovin.impl.sdk.ad.g gVar, N4.b bVar) {
        this.f21969a = gVar;
        this.b = bVar;
    }

    public final void a(N4.a aVar) {
        N4.b bVar;
        N4.b bVar2;
        N4.b bVar3 = this.b;
        U4.m mVar = f21968d;
        if (bVar3 != mVar) {
            aVar.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f21969a = new F2.e(11, this.f21969a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.a(bVar);
        }
    }

    @Override // N4.b
    public final Object get() {
        return this.b.get();
    }
}
