package n1;

/* loaded from: classes4.dex */
public final class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final b f31057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k1.a aVar, int i2) {
        super(aVar);
        if (i2 == 1) {
            p0.a.s(aVar, "eSerializer");
            super(aVar);
            this.f31057b = new b(aVar.b(), 2);
        } else if (i2 != 2) {
            p0.a.s(aVar, "element");
            this.f31057b = new b(aVar.b(), 1);
        } else {
            p0.a.s(aVar, "eSerializer");
            super(aVar);
            this.f31057b = new b(aVar.b(), 3);
        }
    }

    @Override // k1.a
    public final l1.f b() {
        return this.f31057b;
    }
}
