package s7;

/* loaded from: classes3.dex */
public final class o implements n9.p {

    /* renamed from: b, reason: collision with root package name */
    public final n9.b0 f24607b;

    /* renamed from: c, reason: collision with root package name */
    public final n f24608c;

    /* renamed from: d, reason: collision with root package name */
    public g f24609d;

    /* renamed from: f, reason: collision with root package name */
    public n9.p f24610f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24611g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24612h;

    public o(n nVar, n9.a aVar) {
        this.f24608c = nVar;
        this.f24607b = new n9.b0(aVar);
    }

    @Override // n9.p
    public final void a(b2 b2Var) {
        n9.p pVar = this.f24610f;
        if (pVar != null) {
            pVar.a(b2Var);
            b2Var = this.f24610f.getPlaybackParameters();
        }
        this.f24607b.a(b2Var);
    }

    @Override // n9.p
    public final b2 getPlaybackParameters() {
        n9.p pVar = this.f24610f;
        if (pVar != null) {
            return pVar.getPlaybackParameters();
        }
        return this.f24607b.f22523g;
    }

    @Override // n9.p
    public final long getPositionUs() {
        if (this.f24611g) {
            return this.f24607b.getPositionUs();
        }
        n9.p pVar = this.f24610f;
        pVar.getClass();
        return pVar.getPositionUs();
    }
}
