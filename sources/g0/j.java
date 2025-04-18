package g0;

import n9.h0;

/* loaded from: classes.dex */
public final class j implements k8.k {

    /* renamed from: b, reason: collision with root package name */
    public int f17913b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17914c;

    public j(int i10) {
        if (i10 != 1) {
            return;
        }
        this.f17913b = 0;
    }

    @Override // k8.k
    public final k8.l e(k8.j jVar) {
        int i10;
        int i11 = h0.a;
        if (i11 >= 23 && ((i10 = this.f17913b) == 1 || (i10 == 0 && i11 >= 31))) {
            int h10 = n9.q.h(jVar.f20325c.f24723n);
            n9.o.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + h0.y(h10));
            return new com.bumptech.glide.manager.r(h10, this.f17914c).e(jVar);
        }
        return new ni.a().e(jVar);
    }
}
