package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f23517a;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23518c;

    public /* synthetic */ r(v vVar, int i9, int i10) {
        this.f23517a = vVar;
        this.b = i9;
        this.f23518c = i10;
    }

    @Override // v1.u
    public final void run() {
        v vVar = this.f23517a;
        i iVar = vVar.b;
        int i9 = this.b;
        int i10 = this.f23518c;
        if (iVar == null) {
            vVar.f23545h.add(new r(vVar, i9, i10));
        } else {
            vVar.f23541c.i(i9, i10 + 0.99f);
        }
    }
}
