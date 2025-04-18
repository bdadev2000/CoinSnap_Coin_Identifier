package s7;

import android.util.Pair;

/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r4.c f24748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f24749d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v8.u f24750f;

    public /* synthetic */ s1(r4.c cVar, Pair pair, v8.u uVar, int i10) {
        this.f24747b = i10;
        this.f24748c = cVar;
        this.f24749d = pair;
        this.f24750f = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24747b;
        v8.u uVar = this.f24750f;
        Pair pair = this.f24749d;
        r4.c cVar = this.f24748c;
        switch (i10) {
            case 0:
                ((t7.p) ((w1) cVar.f24000d).f24828h).z(((Integer) pair.first).intValue(), (v8.z) pair.second, uVar);
                return;
            default:
                t7.a aVar = ((w1) cVar.f24000d).f24828h;
                int intValue = ((Integer) pair.first).intValue();
                v8.z zVar = (v8.z) pair.second;
                zVar.getClass();
                ((t7.p) aVar).H(intValue, zVar, uVar);
                return;
        }
    }
}
