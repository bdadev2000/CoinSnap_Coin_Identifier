package h;

/* loaded from: classes4.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m f30650a;

    /* renamed from: b, reason: collision with root package name */
    public final i1.i f30651b;

    public c(int i2, m mVar) {
        this.f30650a = mVar;
        int i3 = i1.j.f30830a;
        this.f30651b = new i1.i(i2, 0);
    }

    @Override // h.i
    public final j a(k.n nVar, q.n nVar2) {
        return new e(nVar.f30892a, nVar2, this.f30651b, this.f30650a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof c;
    }

    public final int hashCode() {
        return c.class.hashCode();
    }
}
