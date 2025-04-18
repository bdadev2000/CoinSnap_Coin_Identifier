package s7;

import android.util.Pair;

/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r4.c f24761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f24762d;

    public /* synthetic */ t1(r4.c cVar, Pair pair, int i10) {
        this.f24760b = i10;
        this.f24761c = cVar;
        this.f24762d = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24760b;
        Pair pair = this.f24762d;
        r4.c cVar = this.f24761c;
        switch (i10) {
            case 0:
                ((t7.p) ((w1) cVar.f24000d).f24828h).c(((Integer) pair.first).intValue(), (v8.z) pair.second);
                return;
            case 1:
                ((t7.p) ((w1) cVar.f24000d).f24828h).B(((Integer) pair.first).intValue(), (v8.z) pair.second);
                return;
            case 2:
                ((t7.p) ((w1) cVar.f24000d).f24828h).s(((Integer) pair.first).intValue(), (v8.z) pair.second);
                return;
            default:
                ((t7.p) ((w1) cVar.f24000d).f24828h).u(((Integer) pair.first).intValue(), (v8.z) pair.second);
                return;
        }
    }
}
