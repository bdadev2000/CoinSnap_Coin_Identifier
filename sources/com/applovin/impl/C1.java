package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.C0761u;
import com.applovin.impl.InterfaceC0725m2;
import com.applovin.impl.cc;
import com.applovin.impl.od;
import com.applovin.impl.re;
import com.applovin.impl.ta;
import com.applovin.impl.y6;
import com.applovin.impl.z6;

/* loaded from: classes.dex */
public final /* synthetic */ class C1 implements InterfaceC0725m2.a, cc.b, ta.a, re.a, p4, z6.b {
    public final /* synthetic */ int b;

    public /* synthetic */ C1(int i9) {
        this.b = i9;
    }

    @Override // com.applovin.impl.InterfaceC0725m2.a
    public InterfaceC0725m2 a(Bundle bundle) {
        p3 a6;
        p6 a9;
        switch (this.b) {
            case 0:
                return od.d.b(bundle);
            case 1:
                return od.f.b(bundle);
            case 2:
                a6 = p3.a(bundle);
                return a6;
            case 3:
                a9 = p6.a(bundle);
                return a9;
            case 4:
                return po.b(bundle);
            case 5:
                return qd.b(bundle);
            case 6:
                return qo.b(bundle);
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            default:
                return zk.d(bundle);
            case 10:
                return C0761u.b(bundle);
            case 11:
                return C0761u.a.b(bundle);
            case 15:
                return vo.c(bundle);
            case 16:
                return y7.c(bundle);
            case 17:
                return yq.b(bundle);
            case 18:
                return z4.b(bundle);
        }
    }

    @Override // com.applovin.impl.p4
    public void accept(Object obj) {
        y6.a aVar = (y6.a) obj;
        switch (this.b) {
            case 12:
                aVar.b();
                return;
            case 13:
                aVar.a();
                return;
            default:
                aVar.c();
                return;
        }
    }

    @Override // com.applovin.impl.re.a
    /* renamed from: a */
    public Object mo0a(Object obj) {
        return te.c((Long) obj);
    }

    @Override // com.applovin.impl.z6.b
    public void a() {
        z6.b.d();
    }

    @Override // com.applovin.impl.cc.b
    public void a(Object obj, z8 z8Var) {
        C0742r0.E((InterfaceC0746s0) obj, z8Var);
    }

    @Override // com.applovin.impl.ta.a
    public boolean a(int i9, int i10, int i11, int i12, int i13) {
        return ta.c(i9, i10, i11, i12, i13);
    }
}
