package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.cc;
import com.applovin.impl.m2;
import com.applovin.impl.od;
import com.applovin.impl.re;
import com.applovin.impl.ta;
import com.applovin.impl.u;
import com.applovin.impl.y6;
import com.applovin.impl.z6;

/* loaded from: classes.dex */
public final /* synthetic */ class lu implements m2.a, cc.b, ta.a, re.a, p4, z6.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5919b;

    public /* synthetic */ lu(int i10) {
        this.f5919b = i10;
    }

    @Override // com.applovin.impl.m2.a
    public final m2 a(Bundle bundle) {
        switch (this.f5919b) {
            case 0:
                return od.f.b(bundle);
            case 1:
                return p3.b(bundle);
            case 2:
                return p6.b(bundle);
            case 3:
                return po.b(bundle);
            case 4:
                return qd.b(bundle);
            case 5:
                return qo.b(bundle);
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            default:
                return zk.d(bundle);
            case 9:
                return u.b(bundle);
            case 10:
                return u.a.b(bundle);
            case 14:
                return vo.c(bundle);
            case 15:
                return y7.c(bundle);
            case 16:
                return yq.b(bundle);
            case 17:
                return z4.b(bundle);
        }
    }

    @Override // com.applovin.impl.p4
    public final void accept(Object obj) {
        switch (this.f5919b) {
            case 11:
                ((y6.a) obj).c();
                return;
            case 12:
                ((y6.a) obj).b();
                return;
            default:
                ((y6.a) obj).a();
                return;
        }
    }

    @Override // com.applovin.impl.re.a
    /* renamed from: a */
    public final Object mo2a(Object obj) {
        return te.c((Long) obj);
    }

    @Override // com.applovin.impl.z6.b
    public final void a() {
        z6.b.d();
    }

    @Override // com.applovin.impl.cc.b
    public final void a(Object obj, z8 z8Var) {
        r0.f((s0) obj, z8Var);
    }

    @Override // com.applovin.impl.ta.a
    public final boolean a(int i10, int i11, int i12, int i13, int i14) {
        return ta.c(i10, i11, i12, i13, i14);
    }
}
