package u7;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r4.c f25604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f25605d;

    public /* synthetic */ r(r4.c cVar, Exception exc, int i10) {
        this.f25603b = i10;
        this.f25604c = cVar;
        this.f25605d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25603b;
        Exception exc = this.f25605d;
        r4.c cVar = this.f25604c;
        switch (i10) {
            case 0:
                s7.f0 f0Var = (s7.f0) cVar.f24000d;
                int i11 = n9.h0.a;
                t7.p pVar = (t7.p) f0Var.f24350b.f24417r;
                t7.b P = pVar.P();
                pVar.Q(P, 1014, new t7.g(P, exc, 1));
                return;
            default:
                s7.f0 f0Var2 = (s7.f0) cVar.f24000d;
                int i12 = n9.h0.a;
                t7.p pVar2 = (t7.p) f0Var2.f24350b.f24417r;
                t7.b P2 = pVar2.P();
                pVar2.Q(P2, 1029, new t7.g(P2, exc, 2));
                return;
        }
    }
}
