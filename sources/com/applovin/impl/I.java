package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.id;
import com.applovin.impl.k6;
import com.applovin.impl.nh;
import com.applovin.impl.ta;
import com.applovin.impl.xi;
import com.applovin.impl.y6;
import t.InterfaceC2702a;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements cc.a, id.g, p4, InterfaceC2702a, InterfaceC0725m2.a, ta.a {
    public final /* synthetic */ int b;

    public /* synthetic */ I(int i9) {
        this.b = i9;
    }

    @Override // com.applovin.impl.cc.a
    public int a(Object obj) {
        int a6;
        int b;
        fd fdVar = (fd) obj;
        switch (this.b) {
            case 1:
                a6 = id.a(fdVar);
                return a6;
            default:
                b = id.b(fdVar);
                return b;
        }
    }

    @Override // com.applovin.impl.p4
    public void accept(Object obj) {
        switch (this.b) {
            case 3:
                v5.c((y6.a) obj);
                return;
            default:
                xi.b((xi.c) obj);
                return;
        }
    }

    @Override // t.InterfaceC2702a
    public Object apply(Object obj) {
        ql qlVar = (ql) obj;
        switch (this.b) {
            case 6:
                return be.u(qlVar);
            case 7:
                return be.w(qlVar);
            case 8:
                return be.t(qlVar);
            case 9:
                return be.v(qlVar);
            case 10:
                return be.s(qlVar);
            case 11:
                return be.x(qlVar);
            default:
                return ke.i(qlVar);
        }
    }

    @Override // com.applovin.impl.InterfaceC0725m2.a
    public InterfaceC0725m2 a(Bundle bundle) {
        d9 a6;
        mh a9;
        switch (this.b) {
            case 12:
                a6 = d9.a(bundle);
                return a6;
            case 13:
                return dh.d(bundle);
            case 14:
                return Cdo.d(bundle);
            case 15:
                return gi.c(bundle);
            case 16:
                return go.b(bundle);
            case 17:
                return go.b.b(bundle);
            case 18:
                return go.d.b(bundle);
            case 19:
                return ja.d(bundle);
            case 20:
            case 24:
            default:
                return od.b(bundle);
            case 21:
                return C0716k1.b(bundle);
            case 22:
                return k6.d.d(bundle);
            case 23:
                return k6.f.b(bundle);
            case 25:
                return new kh(bundle);
            case 26:
                a9 = mh.a(bundle);
                return a9;
            case 27:
                return nh.b.b(bundle);
            case 28:
                return nh.f.b(bundle);
        }
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        nh.c cVar = (nh.c) obj;
        switch (this.b) {
            case 0:
                a8.j(cVar);
                return;
            default:
                cVar.b();
                return;
        }
    }

    @Override // com.applovin.impl.ta.a
    public boolean a(int i9, int i10, int i11, int i12, int i13) {
        boolean a6;
        a6 = jf.a(i9, i10, i11, i12, i13);
        return a6;
    }
}
