package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.a7;
import com.applovin.impl.hc;
import com.applovin.impl.o2;
import com.applovin.impl.qh;
import com.applovin.impl.td;
import com.applovin.impl.u;
import com.applovin.impl.we;
import com.applovin.impl.xa;

/* loaded from: classes2.dex */
public final /* synthetic */ class ru implements o2.a, hc.b, r4, xa.a, we.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26385b;

    public /* synthetic */ ru(int i2) {
        this.f26385b = i2;
    }

    @Override // com.applovin.impl.o2.a
    public final o2 a(Bundle bundle) {
        r6 a2;
        switch (this.f26385b) {
            case 0:
                return ph.b(bundle);
            case 1:
                return po.b(bundle);
            case 2:
                return qh.b.b(bundle);
            case 3:
                return qh.f.b(bundle);
            case 4:
            default:
                return xq.b(bundle);
            case 5:
                return r3.a(bundle);
            case 6:
                a2 = r6.a(bundle);
                return a2;
            case 7:
                return td.b(bundle);
            case 8:
                return td.d.b(bundle);
            case 9:
                return td.f.b(bundle);
            case 10:
                return u.b(bundle);
            case 11:
                return u.a.b(bundle);
            case 12:
                return uo.c(bundle);
            case 13:
                return vd.b(bundle);
        }
    }

    @Override // com.applovin.impl.r4
    public final void accept(Object obj) {
        a7.a aVar = (a7.a) obj;
        switch (this.f26385b) {
            case 14:
                aVar.c();
                return;
            case 15:
                aVar.b();
                return;
            default:
                aVar.a();
                return;
        }
    }

    @Override // com.applovin.impl.we.a
    /* renamed from: a */
    public final Object mo8a(Object obj) {
        return ye.c((Long) obj);
    }

    @Override // com.applovin.impl.hc.b
    public final void a(Object obj, b9 b9Var) {
        r0.M((s0) obj, b9Var);
    }

    @Override // com.applovin.impl.xa.a
    public final boolean a(int i2, int i3, int i4, int i5, int i6) {
        return xa.c(i2, i3, i4, i5, i6);
    }
}
