package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class wa implements o7 {

    /* renamed from: b, reason: collision with root package name */
    private ro f8742b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8743c;

    /* renamed from: e, reason: collision with root package name */
    private int f8745e;

    /* renamed from: f, reason: collision with root package name */
    private int f8746f;
    private final yg a = new yg(10);

    /* renamed from: d, reason: collision with root package name */
    private long f8744d = C.TIME_UNSET;

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.f8742b);
        if (this.f8743c) {
            int a = ygVar.a();
            int i10 = this.f8746f;
            if (i10 < 10) {
                int min = Math.min(a, 10 - i10);
                System.arraycopy(ygVar.c(), ygVar.d(), this.a.c(), this.f8746f, min);
                if (this.f8746f + min == 10) {
                    this.a.f(0);
                    if (73 == this.a.w() && 68 == this.a.w() && 51 == this.a.w()) {
                        this.a.g(3);
                        this.f8745e = this.a.v() + 10;
                    } else {
                        kc.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f8743c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f8745e - this.f8746f);
            this.f8742b.a(ygVar, min2);
            this.f8746f += min2;
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
        int i10;
        a1.b(this.f8742b);
        if (this.f8743c && (i10 = this.f8745e) != 0 && this.f8746f == i10) {
            long j3 = this.f8744d;
            if (j3 != C.TIME_UNSET) {
                this.f8742b.a(j3, 1, i10, 0, null);
            }
            this.f8743c = false;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        ro a = k8Var.a(dVar.c(), 5);
        this.f8742b = a;
        a.a(new d9.b().c(dVar.b()).f(MimeTypes.APPLICATION_ID3).a());
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f8743c = true;
        if (j3 != C.TIME_UNSET) {
            this.f8744d = j3;
        }
        this.f8745e = 0;
        this.f8746f = 0;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f8743c = false;
        this.f8744d = C.TIME_UNSET;
    }
}
