package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k7 implements o7 {
    private final List a;

    /* renamed from: b, reason: collision with root package name */
    private final ro[] f5632b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5633c;

    /* renamed from: d, reason: collision with root package name */
    private int f5634d;

    /* renamed from: e, reason: collision with root package name */
    private int f5635e;

    /* renamed from: f, reason: collision with root package name */
    private long f5636f = C.TIME_UNSET;

    public k7(List list) {
        this.a = list;
        this.f5632b = new ro[list.size()];
    }

    private boolean a(yg ygVar, int i10) {
        if (ygVar.a() == 0) {
            return false;
        }
        if (ygVar.w() != i10) {
            this.f5633c = false;
        }
        this.f5634d--;
        return this.f5633c;
    }

    @Override // com.applovin.impl.o7
    public void b() {
        if (this.f5633c) {
            if (this.f5636f != C.TIME_UNSET) {
                for (ro roVar : this.f5632b) {
                    roVar.a(this.f5636f, 1, this.f5635e, 0, null);
                }
            }
            this.f5633c = false;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        if (this.f5633c) {
            if (this.f5634d != 2 || a(ygVar, 32)) {
                if (this.f5634d != 1 || a(ygVar, 0)) {
                    int d10 = ygVar.d();
                    int a = ygVar.a();
                    for (ro roVar : this.f5632b) {
                        ygVar.f(d10);
                        roVar.a(ygVar, a);
                    }
                    this.f5635e += a;
                }
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        for (int i10 = 0; i10 < this.f5632b.length; i10++) {
            ep.a aVar = (ep.a) this.a.get(i10);
            dVar.a();
            ro a = k8Var.a(dVar.c(), 3);
            a.a(new d9.b().c(dVar.b()).f(MimeTypes.APPLICATION_DVBSUBS).a(Collections.singletonList(aVar.f4506c)).e(aVar.a).a());
            this.f5632b[i10] = a;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f5633c = true;
        if (j3 != C.TIME_UNSET) {
            this.f5636f = j3;
        }
        this.f5635e = 0;
        this.f5634d = 2;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f5633c = false;
        this.f5636f = C.TIME_UNSET;
    }
}
