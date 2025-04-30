package e8;

/* loaded from: classes3.dex */
public final class H implements D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a8.b f20124a;

    public H(a8.b bVar) {
        this.f20124a = bVar;
    }

    @Override // e8.D
    public final a8.b[] childSerializers() {
        return new a8.b[]{this.f20124a};
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        throw new IllegalStateException("unsupported".toString());
    }

    @Override // e8.D
    public final a8.b[] typeParametersSerializers() {
        return W.b;
    }
}
