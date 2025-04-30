package g8;

/* loaded from: classes3.dex */
public final class m extends a {

    /* renamed from: e, reason: collision with root package name */
    public final f8.y f20508e;

    public m(f8.b bVar, f8.y yVar) {
        super(bVar);
        this.f20508e = yVar;
        this.f20492a.add("primitive");
    }

    @Override // g8.a
    public final f8.j G(String str) {
        G7.j.e(str, "tag");
        if (str == "primitive") {
            return this.f20508e;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // g8.a
    public final f8.j T() {
        return this.f20508e;
    }

    @Override // d8.a
    public final int h(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return 0;
    }
}
