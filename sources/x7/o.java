package x7;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f27493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f27494d;

    public /* synthetic */ o(q qVar, r rVar, int i10) {
        this.f27492b = i10;
        this.f27493c = qVar;
        this.f27494d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27492b;
        r rVar = this.f27494d;
        q qVar = this.f27493c;
        switch (i10) {
            case 0:
                rVar.c(qVar.a, qVar.f27496b);
                return;
            case 1:
                rVar.B(qVar.a, qVar.f27496b);
                return;
            case 2:
                rVar.s(qVar.a, qVar.f27496b);
                return;
            default:
                rVar.u(qVar.a, qVar.f27496b);
                return;
        }
    }
}
