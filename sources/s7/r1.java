package s7;

import android.util.Pair;

/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r4.c f24736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f24737d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v8.p f24738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v8.u f24739g;

    public /* synthetic */ r1(r4.c cVar, Pair pair, v8.p pVar, v8.u uVar, int i10) {
        this.f24735b = i10;
        this.f24736c = cVar;
        this.f24737d = pair;
        this.f24738f = pVar;
        this.f24739g = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24735b;
        v8.u uVar = this.f24739g;
        v8.p pVar = this.f24738f;
        Pair pair = this.f24737d;
        r4.c cVar = this.f24736c;
        switch (i10) {
            case 0:
                ((t7.p) ((w1) cVar.f24000d).f24828h).E(((Integer) pair.first).intValue(), (v8.z) pair.second, pVar, uVar);
                return;
            case 1:
                ((t7.p) ((w1) cVar.f24000d).f24828h).q(((Integer) pair.first).intValue(), (v8.z) pair.second, pVar, uVar);
                return;
            default:
                ((t7.p) ((w1) cVar.f24000d).f24828h).e(((Integer) pair.first).intValue(), (v8.z) pair.second, pVar, uVar);
                return;
        }
    }
}
