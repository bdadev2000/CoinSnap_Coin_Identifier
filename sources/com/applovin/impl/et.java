package com.applovin.impl;

import com.applovin.impl.fk;
import com.applovin.impl.gk;
import com.applovin.impl.x2;
import com.applovin.impl.yr;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class et implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4525b;

    public /* synthetic */ et(int i10) {
        this.f4525b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a;
        int b3;
        switch (this.f4525b) {
            case 0:
                return bs.b((xr) obj, (xr) obj2);
            case 1:
                a = fk.a((fk.b) obj, (fk.b) obj2);
                return a;
            case 2:
                b3 = fk.b((fk.b) obj, (fk.b) obj2);
                return b3;
            case 3:
                return x2.a.b((x2.a) obj, (x2.a) obj2);
            case 4:
                return yr.b.b((yr.b) obj, (yr.b) obj2);
            case 5:
                return e2.b((d9) obj, (d9) obj2);
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
