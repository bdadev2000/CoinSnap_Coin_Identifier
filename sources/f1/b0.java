package f1;

/* loaded from: classes3.dex */
public final class b0 implements h0.g, j0.d {

    /* renamed from: a, reason: collision with root package name */
    public final h0.g f30455a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.l f30456b;

    public b0(h0.g gVar, h0.l lVar) {
        this.f30455a = gVar;
        this.f30456b = lVar;
    }

    @Override // j0.d
    public final j0.d getCallerFrame() {
        h0.g gVar = this.f30455a;
        if (gVar instanceof j0.d) {
            return (j0.d) gVar;
        }
        return null;
    }

    @Override // h0.g
    public final h0.l getContext() {
        return this.f30456b;
    }

    @Override // h0.g
    public final void resumeWith(Object obj) {
        this.f30455a.resumeWith(obj);
    }
}
