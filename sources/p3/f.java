package p3;

/* loaded from: classes.dex */
public final class f extends h.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.c f23367h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h.c cVar) {
        super(12, 0);
        this.f23367h = cVar;
    }

    @Override // h.c
    public final Object z(z3.b bVar) {
        Float f10 = (Float) this.f23367h.z(bVar);
        if (f10 == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * 2.55f);
    }
}
