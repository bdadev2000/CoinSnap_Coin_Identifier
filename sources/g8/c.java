package g8;

import n9.x;

/* loaded from: classes3.dex */
public final class c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f18247b;

    /* renamed from: c, reason: collision with root package name */
    public int f18248c;

    /* renamed from: d, reason: collision with root package name */
    public long f18249d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18250e;

    /* renamed from: f, reason: collision with root package name */
    public final x f18251f;

    /* renamed from: g, reason: collision with root package name */
    public final x f18252g;

    /* renamed from: h, reason: collision with root package name */
    public int f18253h;

    /* renamed from: i, reason: collision with root package name */
    public int f18254i;

    public c(x xVar, x xVar2, boolean z10) {
        this.f18252g = xVar;
        this.f18251f = xVar2;
        this.f18250e = z10;
        xVar2.G(12);
        this.a = xVar2.y();
        xVar.G(12);
        this.f18254i = xVar.y();
        com.bumptech.glide.d.e("first_chunk must be 1", xVar.f() == 1);
        this.f18247b = -1;
    }

    public final boolean a() {
        long w10;
        int i10;
        int i11 = this.f18247b + 1;
        this.f18247b = i11;
        if (i11 == this.a) {
            return false;
        }
        boolean z10 = this.f18250e;
        x xVar = this.f18251f;
        if (z10) {
            w10 = xVar.z();
        } else {
            w10 = xVar.w();
        }
        this.f18249d = w10;
        if (this.f18247b == this.f18253h) {
            x xVar2 = this.f18252g;
            this.f18248c = xVar2.y();
            xVar2.H(4);
            int i12 = this.f18254i - 1;
            this.f18254i = i12;
            if (i12 > 0) {
                i10 = xVar2.y() - 1;
            } else {
                i10 = -1;
            }
            this.f18253h = i10;
        }
        return true;
    }
}
