package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class wa implements o7 {
    private ro b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11956c;

    /* renamed from: e, reason: collision with root package name */
    private int f11958e;

    /* renamed from: f, reason: collision with root package name */
    private int f11959f;

    /* renamed from: a, reason: collision with root package name */
    private final yg f11955a = new yg(10);

    /* renamed from: d, reason: collision with root package name */
    private long f11957d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        AbstractC0669a1.b(this.b);
        if (this.f11956c) {
            int a6 = ygVar.a();
            int i9 = this.f11959f;
            if (i9 < 10) {
                int min = Math.min(a6, 10 - i9);
                System.arraycopy(ygVar.c(), ygVar.d(), this.f11955a.c(), this.f11959f, min);
                if (this.f11959f + min == 10) {
                    this.f11955a.f(0);
                    if (73 == this.f11955a.w() && 68 == this.f11955a.w() && 51 == this.f11955a.w()) {
                        this.f11955a.g(3);
                        this.f11958e = this.f11955a.v() + 10;
                    } else {
                        kc.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f11956c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a6, this.f11958e - this.f11959f);
            this.b.a(ygVar, min2);
            this.f11959f += min2;
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
        int i9;
        AbstractC0669a1.b(this.b);
        if (this.f11956c && (i9 = this.f11958e) != 0 && this.f11959f == i9) {
            long j7 = this.f11957d;
            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.b.a(j7, 1, i9, 0, null);
            }
            this.f11956c = false;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        ro a6 = k8Var.a(dVar.c(), 5);
        this.b = a6;
        a6.a(new d9.b().c(dVar.b()).f(MimeTypes.APPLICATION_ID3).a());
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.f11956c = true;
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f11957d = j7;
        }
        this.f11958e = 0;
        this.f11959f = 0;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f11956c = false;
        this.f11957d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
