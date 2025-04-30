package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.wl;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zq extends wl {
    private final yg b;

    /* renamed from: c, reason: collision with root package name */
    private final yg f12683c;

    /* renamed from: d, reason: collision with root package name */
    private int f12684d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12685e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12686f;

    /* renamed from: g, reason: collision with root package name */
    private int f12687g;

    public zq(ro roVar) {
        super(roVar);
        this.b = new yg(uf.f11591a);
        this.f12683c = new yg(4);
    }

    @Override // com.applovin.impl.wl
    public boolean a(yg ygVar) {
        int w2 = ygVar.w();
        int i9 = (w2 >> 4) & 15;
        int i10 = w2 & 15;
        if (i10 == 7) {
            this.f12687g = i9;
            if (i9 != 5) {
                return true;
            }
            return false;
        }
        throw new wl.a(com.mbridge.msdk.foundation.entity.o.h(i10, "Video format not supported: "));
    }

    @Override // com.applovin.impl.wl
    public boolean b(yg ygVar, long j7) {
        int i9;
        int w2 = ygVar.w();
        long k6 = (ygVar.k() * 1000) + j7;
        if (w2 == 0 && !this.f12685e) {
            yg ygVar2 = new yg(new byte[ygVar.a()]);
            ygVar.a(ygVar2.c(), 0, ygVar.a());
            C0767v1 b = C0767v1.b(ygVar2);
            this.f12684d = b.b;
            this.f12014a.a(new d9.b().f(MimeTypes.VIDEO_H264).a(b.f11658f).q(b.f11655c).g(b.f11656d).b(b.f11657e).a(b.f11654a).a());
            this.f12685e = true;
            return false;
        }
        if (w2 != 1 || !this.f12685e) {
            return false;
        }
        if (this.f12687g == 1) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (!this.f12686f && i9 == 0) {
            return false;
        }
        byte[] c9 = this.f12683c.c();
        c9[0] = 0;
        c9[1] = 0;
        c9[2] = 0;
        int i10 = 4 - this.f12684d;
        int i11 = 0;
        while (ygVar.a() > 0) {
            ygVar.a(this.f12683c.c(), i10, this.f12684d);
            this.f12683c.f(0);
            int A8 = this.f12683c.A();
            this.b.f(0);
            this.f12014a.a(this.b, 4);
            this.f12014a.a(ygVar, A8);
            i11 = i11 + 4 + A8;
        }
        this.f12014a.a(k6, i9, i11, 0, null);
        this.f12686f = true;
        return true;
    }
}
