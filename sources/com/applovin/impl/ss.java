package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.id;
import com.applovin.impl.k6;
import com.applovin.impl.m2;
import com.applovin.impl.nh;
import com.applovin.impl.od;
import com.applovin.impl.ta;
import com.applovin.impl.xi;

/* loaded from: classes.dex */
public final /* synthetic */ class ss implements cc.a, id.g, p4, n.a, m2.a, ta.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8086b;

    public /* synthetic */ ss(int i10) {
        this.f8086b = i10;
    }

    @Override // com.applovin.impl.cc.a
    public final int a(Object obj) {
        switch (this.f8086b) {
            case 1:
                return id.c((fd) obj);
            default:
                return id.d((fd) obj);
        }
    }

    @Override // com.applovin.impl.p4
    public final void accept(Object obj) {
        xi.b((xi.c) obj);
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        switch (this.f8086b) {
            case 5:
                return be.t((ql) obj);
            case 6:
                return be.y((ql) obj);
            case 7:
                return be.s((ql) obj);
            case 8:
                return be.v((ql) obj);
            case 9:
                return be.u((ql) obj);
            case 10:
                return be.w((ql) obj);
            default:
                return ke.i((ql) obj);
        }
    }

    @Override // com.applovin.impl.m2.a
    public final m2 a(Bundle bundle) {
        d9 a;
        k1 a10;
        mh a11;
        switch (this.f8086b) {
            case 11:
                a = d9.a(bundle);
                return a;
            case 12:
                return dh.d(bundle);
            case 13:
                return Cdo.d(bundle);
            case 14:
                return gi.c(bundle);
            case 15:
                return go.b(bundle);
            case 16:
                return go.b.b(bundle);
            case 17:
                return go.d.b(bundle);
            case 18:
                return ja.d(bundle);
            case 19:
            case 23:
            default:
                return od.d.b(bundle);
            case 20:
                a10 = k1.a(bundle);
                return a10;
            case 21:
                return k6.d.d(bundle);
            case 22:
                return k6.f.b(bundle);
            case 24:
                return new kh(bundle);
            case 25:
                a11 = mh.a(bundle);
                return a11;
            case 26:
                return nh.b.b(bundle);
            case 27:
                return nh.f.b(bundle);
            case 28:
                return od.b(bundle);
        }
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.f8086b) {
            case 0:
                a8.m((nh.c) obj);
                return;
            default:
                ((nh.c) obj).b();
                return;
        }
    }

    @Override // com.applovin.impl.ta.a
    public final boolean a(int i10, int i11, int i12, int i13, int i14) {
        boolean a;
        a = jf.a(i10, i11, i12, i13, i14);
        return a;
    }
}
