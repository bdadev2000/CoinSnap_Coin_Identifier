package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k7 implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final List f8604a;
    private final ro[] b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8605c;

    /* renamed from: d, reason: collision with root package name */
    private int f8606d;

    /* renamed from: e, reason: collision with root package name */
    private int f8607e;

    /* renamed from: f, reason: collision with root package name */
    private long f8608f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public k7(List list) {
        this.f8604a = list;
        this.b = new ro[list.size()];
    }

    private boolean a(yg ygVar, int i9) {
        if (ygVar.a() == 0) {
            return false;
        }
        if (ygVar.w() != i9) {
            this.f8605c = false;
        }
        this.f8606d--;
        return this.f8605c;
    }

    @Override // com.applovin.impl.o7
    public void b() {
        if (this.f8605c) {
            if (this.f8608f != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                for (ro roVar : this.b) {
                    roVar.a(this.f8608f, 1, this.f8607e, 0, null);
                }
            }
            this.f8605c = false;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        if (this.f8605c) {
            if (this.f8606d != 2 || a(ygVar, 32)) {
                if (this.f8606d != 1 || a(ygVar, 0)) {
                    int d2 = ygVar.d();
                    int a6 = ygVar.a();
                    for (ro roVar : this.b) {
                        ygVar.f(d2);
                        roVar.a(ygVar, a6);
                    }
                    this.f8607e += a6;
                }
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        for (int i9 = 0; i9 < this.b.length; i9++) {
            ep.a aVar = (ep.a) this.f8604a.get(i9);
            dVar.a();
            ro a6 = k8Var.a(dVar.c(), 3);
            a6.a(new d9.b().c(dVar.b()).f(MimeTypes.APPLICATION_DVBSUBS).a(Collections.singletonList(aVar.f7472c)).e(aVar.f7471a).a());
            this.b[i9] = a6;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.f8605c = true;
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f8608f = j7;
        }
        this.f8607e = 0;
        this.f8606d = 2;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f8605c = false;
        this.f8608f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
