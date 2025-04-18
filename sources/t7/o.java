package t7;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w7.f f25314c;

    public /* synthetic */ o(b bVar, w7.f fVar, int i10) {
        this.f25313b = i10;
        this.f25314c = fVar;
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        switch (this.f25313b) {
            case 0:
                ((c) obj).getClass();
                return;
            case 1:
                u uVar = (u) ((c) obj);
                int i10 = uVar.f25357x;
                w7.f fVar = this.f25314c;
                uVar.f25357x = i10 + fVar.f26883g;
                uVar.f25358y += fVar.f26881e;
                return;
            case 2:
                ((c) obj).getClass();
                return;
            default:
                ((c) obj).getClass();
                return;
        }
    }
}
