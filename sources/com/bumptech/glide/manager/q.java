package com.bumptech.glide.manager;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9738c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9739d;

    public /* synthetic */ q(int i10, Object obj, boolean z10) {
        this.f9737b = i10;
        this.f9739d = obj;
        this.f9738c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f9737b;
        boolean z11 = this.f9738c;
        Object obj = this.f9739d;
        switch (i10) {
            case 0:
                s2.e eVar = (s2.e) obj;
                eVar.getClass();
                w4.m.a();
                h3.a aVar = (h3.a) eVar.f24163b;
                boolean z12 = aVar.f18722c;
                aVar.f18722c = z11;
                if (z12 != z11) {
                    ((b) aVar.f18723d).a(z11);
                    return;
                }
                return;
            case 1:
                a4.j.t(obj);
                throw null;
            case 2:
                int i11 = he.g.X;
                ((he.g) obj).b0(z11);
                return;
            default:
                he.s sVar = (he.s) obj;
                boolean z13 = true;
                if (sVar.f19029d.f23631f.f23619b >= 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && sVar.f()) {
                    sVar.t(z11);
                    return;
                }
                sVar.f19093m = z11;
                if (sVar.f19029d.f23631f.f23619b < 2) {
                    z13 = false;
                }
                if (z13) {
                    sVar.p();
                    return;
                }
                return;
        }
    }
}
