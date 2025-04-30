package y1;

/* loaded from: classes.dex */
public final class g extends E1.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E1.d f24297f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(E1.d dVar) {
        super(4);
        this.f24297f = dVar;
    }

    @Override // E1.d
    public final Object s(I1.b bVar) {
        Float f9 = (Float) this.f24297f.s(bVar);
        if (f9 == null) {
            return null;
        }
        return Float.valueOf(f9.floatValue() * 2.55f);
    }
}
