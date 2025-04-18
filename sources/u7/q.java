package u7;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r4.c f25599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w7.f f25600d;

    public /* synthetic */ q(r4.c cVar, w7.f fVar, int i10) {
        this.f25598b = i10;
        this.f25599c = cVar;
        this.f25600d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25598b) {
            case 0:
                r4.c cVar = this.f25599c;
                w7.f fVar = this.f25600d;
                cVar.getClass();
                synchronized (fVar) {
                }
                s7.f0 f0Var = (s7.f0) cVar.f24000d;
                int i10 = n9.h0.a;
                t7.p pVar = (t7.p) f0Var.f24350b.f24417r;
                t7.b N = pVar.N((v8.z) pVar.f25318f.f1060e);
                pVar.Q(N, 1013, new t7.o(N, fVar, 3));
                return;
            default:
                s7.f0 f0Var2 = (s7.f0) this.f25599c.f24000d;
                int i11 = n9.h0.a;
                s7.i0 i0Var = f0Var2.f24350b;
                i0Var.getClass();
                t7.p pVar2 = (t7.p) i0Var.f24417r;
                t7.b P = pVar2.P();
                pVar2.Q(P, 1007, new t7.o(P, this.f25600d, 2));
                return;
        }
    }
}
