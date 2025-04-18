package o9;

import n9.h0;
import s7.f0;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23271b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f23272c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23273d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f23274f;

    public /* synthetic */ x(h hVar, int i10, long j3) {
        this.f23272c = hVar;
        this.f23273d = i10;
        this.f23274f = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23271b;
        int i11 = this.f23273d;
        long j3 = this.f23274f;
        h hVar = this.f23272c;
        switch (i10) {
            case 0:
                y yVar = (y) hVar.f23203b;
                int i12 = h0.a;
                t7.p pVar = (t7.p) ((f0) yVar).f24350b.f24417r;
                t7.b N = pVar.N((v8.z) pVar.f25318f.f1060e);
                pVar.Q(N, 1021, new t7.h(N, j3, i11));
                return;
            default:
                y yVar2 = (y) hVar.f23203b;
                int i13 = h0.a;
                t7.p pVar2 = (t7.p) ((f0) yVar2).f24350b.f24417r;
                t7.b N2 = pVar2.N((v8.z) pVar2.f25318f.f1060e);
                pVar2.Q(N2, 1018, new t7.h(N2, i11, j3));
                return;
        }
    }

    public /* synthetic */ x(h hVar, long j3, int i10) {
        this.f23272c = hVar;
        this.f23274f = j3;
        this.f23273d = i10;
    }
}
