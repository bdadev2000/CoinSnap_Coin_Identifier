package com.applovin.impl;

import com.applovin.impl.ik;
import com.applovin.impl.jk;
import com.applovin.impl.xr;
import com.applovin.impl.z2;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class ns implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25788a;

    public /* synthetic */ ns(int i2) {
        this.f25788a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2;
        int b2;
        switch (this.f25788a) {
            case 0:
                return as.b((wr) obj, (wr) obj2);
            case 1:
                a2 = ik.a((ik.b) obj, (ik.b) obj2);
                return a2;
            case 2:
                b2 = ik.b((ik.b) obj, (ik.b) obj2);
                return b2;
            case 3:
                return xr.b.b((xr.b) obj, (xr.b) obj2);
            case 4:
                return z2.a.b((z2.a) obj, (z2.a) obj2);
            case 5:
                return f2.b((f9) obj, (f9) obj2);
            case 6:
                return jk.b.b((jk.b) obj, (jk.b) obj2);
            case 7:
                return m6.d((Integer) obj, (Integer) obj2);
            case 8:
                return m6.c((Integer) obj, (Integer) obj2);
            default:
                return nq.b((oq) obj, (oq) obj2);
        }
    }
}
