package com.applovin.impl;

import com.applovin.impl.f9;
import com.applovin.impl.xl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class yq extends xl {

    /* renamed from: b, reason: collision with root package name */
    private final bh f28234b;

    /* renamed from: c, reason: collision with root package name */
    private final bh f28235c;
    private int d;
    private boolean e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28236f;

    /* renamed from: g, reason: collision with root package name */
    private int f28237g;

    public yq(qo qoVar) {
        super(qoVar);
        this.f28234b = new bh(zf.f28330a);
        this.f28235c = new bh(4);
    }

    @Override // com.applovin.impl.xl
    public boolean a(bh bhVar) {
        int w = bhVar.w();
        int i2 = (w >> 4) & 15;
        int i3 = w & 15;
        if (i3 != 7) {
            throw new xl.a(android.support.v4.media.d.i("Video format not supported: ", i3));
        }
        this.f28237g = i2;
        return i2 != 5;
    }

    @Override // com.applovin.impl.xl
    public boolean b(bh bhVar, long j2) {
        int w = bhVar.w();
        long k2 = (bhVar.k() * 1000) + j2;
        if (w == 0 && !this.e) {
            bh bhVar2 = new bh(new byte[bhVar.a()]);
            bhVar.a(bhVar2.c(), 0, bhVar.a());
            w1 b2 = w1.b(bhVar2);
            this.d = b2.f27658b;
            this.f27937a.a(new f9.b().f("video/avc").a(b2.f27660f).q(b2.f27659c).g(b2.d).b(b2.e).a(b2.f27657a).a());
            this.e = true;
            return false;
        }
        if (w != 1 || !this.e) {
            return false;
        }
        int i2 = this.f28237g == 1 ? 1 : 0;
        if (!this.f28236f && i2 == 0) {
            return false;
        }
        byte[] c2 = this.f28235c.c();
        c2[0] = 0;
        c2[1] = 0;
        c2[2] = 0;
        int i3 = 4 - this.d;
        int i4 = 0;
        while (bhVar.a() > 0) {
            bhVar.a(this.f28235c.c(), i3, this.d);
            this.f28235c.f(0);
            int A = this.f28235c.A();
            this.f28234b.f(0);
            this.f27937a.a(this.f28234b, 4);
            this.f27937a.a(bhVar, A);
            i4 = i4 + 4 + A;
        }
        this.f27937a.a(k2, i2, i4, 0, null);
        this.f28236f = true;
        return true;
    }
}
