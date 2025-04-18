package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.wl;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
final class zq extends wl {

    /* renamed from: b, reason: collision with root package name */
    private final yg f9491b;

    /* renamed from: c, reason: collision with root package name */
    private final yg f9492c;

    /* renamed from: d, reason: collision with root package name */
    private int f9493d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9494e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9495f;

    /* renamed from: g, reason: collision with root package name */
    private int f9496g;

    public zq(ro roVar) {
        super(roVar);
        this.f9491b = new yg(uf.a);
        this.f9492c = new yg(4);
    }

    @Override // com.applovin.impl.wl
    public boolean a(yg ygVar) {
        int w10 = ygVar.w();
        int i10 = (w10 >> 4) & 15;
        int i11 = w10 & 15;
        if (i11 == 7) {
            this.f9496g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new wl.a(eb.j.i("Video format not supported: ", i11));
    }

    @Override // com.applovin.impl.wl
    public boolean b(yg ygVar, long j3) {
        int i10;
        int w10 = ygVar.w();
        long k10 = (ygVar.k() * 1000) + j3;
        if (w10 == 0 && !this.f9494e) {
            yg ygVar2 = new yg(new byte[ygVar.a()]);
            ygVar.a(ygVar2.c(), 0, ygVar.a());
            v1 b3 = v1.b(ygVar2);
            this.f9493d = b3.f8447b;
            this.a.a(new d9.b().f(MimeTypes.VIDEO_H264).a(b3.f8451f).q(b3.f8448c).g(b3.f8449d).b(b3.f8450e).a(b3.a).a());
            this.f9494e = true;
            return false;
        }
        if (w10 != 1 || !this.f9494e) {
            return false;
        }
        if (this.f9496g == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.f9495f && i10 == 0) {
            return false;
        }
        byte[] c10 = this.f9492c.c();
        c10[0] = 0;
        c10[1] = 0;
        c10[2] = 0;
        int i11 = 4 - this.f9493d;
        int i12 = 0;
        while (ygVar.a() > 0) {
            ygVar.a(this.f9492c.c(), i11, this.f9493d);
            this.f9492c.f(0);
            int A = this.f9492c.A();
            this.f9491b.f(0);
            this.a.a(this.f9491b, 4);
            this.a.a(ygVar, A);
            i12 = i12 + 4 + A;
        }
        this.a.a(k10, i10, i12, 0, null);
        this.f9495f = true;
        return true;
    }
}
