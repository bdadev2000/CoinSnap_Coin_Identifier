package Y3;

/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3774d;

    public /* synthetic */ h(Object obj, int i9) {
        this.f3773c = i9;
        this.f3774d = obj;
    }

    @Override // Y3.f
    public final void a() {
        switch (this.f3773c) {
            case 0:
                j jVar = (j) this.f3774d;
                if (jVar.m != null) {
                    jVar.b.a("Unbind from service.", new Object[0]);
                    jVar.f3777a.unbindService(jVar.l);
                    jVar.f3782g = false;
                    jVar.m = null;
                    jVar.l = null;
                }
                jVar.b();
                return;
            default:
                i iVar = (i) this.f3774d;
                j jVar2 = (j) iVar.f3775c;
                jVar2.b.a("unlinkToDeath", new Object[0]);
                jVar2.m.asBinder().unlinkToDeath(jVar2.f3785j, 0);
                j jVar3 = (j) iVar.f3775c;
                jVar3.m = null;
                jVar3.f3782g = false;
                return;
        }
    }
}
