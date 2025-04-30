package com.applovin.impl;

import com.applovin.impl.C0776x2;
import com.applovin.impl.fk;
import com.applovin.impl.gk;
import com.applovin.impl.yr;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ X(int i9) {
        this.b = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a6;
        int b;
        switch (this.b) {
            case 0:
                return bs.b((xr) obj, (xr) obj2);
            case 1:
                a6 = fk.a((fk.b) obj, (fk.b) obj2);
                return a6;
            case 2:
                b = fk.b((fk.b) obj, (fk.b) obj2);
                return b;
            case 3:
                return C0776x2.a.b((C0776x2.a) obj, (C0776x2.a) obj2);
            case 4:
                return yr.b.b((yr.b) obj, (yr.b) obj2);
            case 5:
                return AbstractC0690e2.b((d9) obj, (d9) obj2);
            case 6:
                return gk.b.b((gk.b) obj, (gk.b) obj2);
            case 7:
                return k6.c((Integer) obj, (Integer) obj2);
            case 8:
                return k6.d((Integer) obj, (Integer) obj2);
            default:
                return oq.b((pq) obj, (pq) obj2);
        }
    }
}
