package com.applovin.impl;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.b7;
import com.applovin.impl.bj;
import com.applovin.impl.fo;
import com.applovin.impl.hc;
import com.applovin.impl.m6;
import com.applovin.impl.nd;
import com.applovin.impl.o2;
import com.applovin.impl.qh;
import com.applovin.impl.xa;

/* loaded from: classes2.dex */
public final /* synthetic */ class rs implements r4, hc.a, nd.g, o2.a, b7.b, Function, xa.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26381b;

    public /* synthetic */ rs(int i2) {
        this.f26381b = i2;
    }

    @Override // com.applovin.impl.hc.a
    public final int a(Object obj) {
        int a2;
        int b2;
        kd kdVar = (kd) obj;
        switch (this.f26381b) {
            case 2:
                a2 = nd.a(kdVar);
                return a2;
            default:
                b2 = nd.b(kdVar);
                return b2;
        }
    }

    @Override // com.applovin.impl.r4
    public final void accept(Object obj) {
        bj.b((bj.c) obj);
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        tl tlVar = (tl) obj;
        switch (this.f26381b) {
            case 14:
                return ge.x(tlVar);
            case 15:
                return ge.t(tlVar);
            case 16:
                return ge.y(tlVar);
            case 17:
                return ge.w(tlVar);
            case 18:
                return ge.v(tlVar);
            case 19:
                return ge.u(tlVar);
            default:
                return pe.i(tlVar);
        }
    }

    @Override // com.applovin.impl.o2.a
    public final o2 a(Bundle bundle) {
        b5 a2;
        f9 a3;
        l1 a4;
        oo a5;
        switch (this.f26381b) {
            case 4:
                return a8.c(bundle);
            case 5:
                a2 = b5.a(bundle);
                return a2;
            case 6:
            case 7:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                a5 = oo.a(bundle);
                return a5;
            case 8:
                return cl.d(bundle);
            case 9:
                return co.d(bundle);
            case 10:
                a3 = f9.a(bundle);
                return a3;
            case 11:
                return fo.b(bundle);
            case 12:
                return fo.b.b(bundle);
            case 13:
                return fo.d.b(bundle);
            case 20:
                return gh.d(bundle);
            case 21:
                return ki.c(bundle);
            case 22:
                a4 = l1.a(bundle);
                return a4;
            case 23:
                return m6.d.d(bundle);
            case 24:
                return m6.f.b(bundle);
            case 25:
                return na.d(bundle);
            case 26:
                return new nh(bundle);
        }
    }

    @Override // com.applovin.impl.b7.b
    public final void a() {
        b7.b.d();
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        qh.c cVar = (qh.c) obj;
        switch (this.f26381b) {
            case 1:
                c8.h(cVar);
                return;
            default:
                cVar.b();
                return;
        }
    }

    @Override // com.applovin.impl.xa.a
    public final boolean a(int i2, int i3, int i4, int i5, int i6) {
        return of.f(i2, i3, i4, i5, i6);
    }
}
