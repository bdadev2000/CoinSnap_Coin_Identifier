package o9;

import n9.h0;
import s7.f0;
import s7.i0;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f23269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w7.f f23270d;

    public /* synthetic */ w(h hVar, w7.f fVar, int i10) {
        this.f23268b = i10;
        this.f23269c = hVar;
        this.f23270d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23268b) {
            case 0:
                h hVar = this.f23269c;
                w7.f fVar = this.f23270d;
                hVar.getClass();
                synchronized (fVar) {
                }
                y yVar = (y) hVar.f23203b;
                int i10 = h0.a;
                t7.p pVar = (t7.p) ((f0) yVar).f24350b.f24417r;
                t7.b N = pVar.N((v8.z) pVar.f25318f.f1060e);
                pVar.Q(N, 1020, new t7.o(N, fVar, 1));
                return;
            default:
                y yVar2 = (y) this.f23269c.f23203b;
                int i11 = h0.a;
                i0 i0Var = ((f0) yVar2).f24350b;
                i0Var.getClass();
                t7.p pVar2 = (t7.p) i0Var.f24417r;
                t7.b P = pVar2.P();
                pVar2.Q(P, 1015, new t7.o(P, this.f23270d, 0));
                return;
        }
    }
}
