package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23515a;
    public final /* synthetic */ v b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f23516c;

    public /* synthetic */ q(v vVar, float f9, int i9) {
        this.f23515a = i9;
        this.b = vVar;
        this.f23516c = f9;
    }

    @Override // v1.u
    public final void run() {
        switch (this.f23515a) {
            case 0:
                v vVar = this.b;
                i iVar = vVar.b;
                float f9 = this.f23516c;
                if (iVar == null) {
                    vVar.f23545h.add(new q(vVar, f9, 0));
                    return;
                }
                float e4 = H1.g.e(iVar.l, iVar.m, f9);
                H1.e eVar = vVar.f23541c;
                eVar.i(eVar.l, e4);
                return;
            case 1:
                v vVar2 = this.b;
                i iVar2 = vVar2.b;
                float f10 = this.f23516c;
                if (iVar2 == null) {
                    vVar2.f23545h.add(new q(vVar2, f10, 1));
                    return;
                } else {
                    vVar2.q((int) H1.g.e(iVar2.l, iVar2.m, f10));
                    return;
                }
            default:
                this.b.s(this.f23516c);
                return;
        }
    }
}
