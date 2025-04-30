package e8;

/* loaded from: classes3.dex */
public final class l0 extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g8.a f20174c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a8.b f20175d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(g8.a aVar, a8.b bVar, Object obj, int i9) {
        super(0);
        this.b = i9;
        this.f20174c = aVar;
        this.f20175d = bVar;
        this.f20176f = obj;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                g8.a aVar = this.f20174c;
                if (aVar.v()) {
                    a8.b bVar = this.f20175d;
                    G7.j.e(bVar, "deserializer");
                    return g8.k.i(aVar, bVar);
                }
                return null;
            default:
                g8.a aVar2 = this.f20174c;
                aVar2.getClass();
                a8.b bVar2 = this.f20175d;
                G7.j.e(bVar2, "deserializer");
                return g8.k.i(aVar2, bVar2);
        }
    }
}
