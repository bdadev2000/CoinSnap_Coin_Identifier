package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class bs implements kl {
    private final List a;

    /* renamed from: b */
    private final long[] f3955b;

    /* renamed from: c */
    private final long[] f3956c;

    public bs(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.f3955b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            xr xrVar = (xr) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f3955b;
            jArr[i11] = xrVar.f9076b;
            jArr[i11 + 1] = xrVar.f9077c;
        }
        long[] jArr2 = this.f3955b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f3956c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.applovin.impl.kl
    public long a(int i10) {
        a1.a(i10 >= 0);
        a1.a(i10 < this.f3956c.length);
        return this.f3956c[i10];
    }

    @Override // com.applovin.impl.kl
    public List b(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.a.size(); i10++) {
            long[] jArr = this.f3955b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                xr xrVar = (xr) this.a.get(i10);
                z4 z4Var = xrVar.a;
                if (z4Var.f9324f == -3.4028235E38f) {
                    arrayList2.add(xrVar);
                } else {
                    arrayList.add(z4Var);
                }
            }
        }
        Collections.sort(arrayList2, new et(0));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((xr) arrayList2.get(i12)).a.a().a((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.f3956c.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j3) {
        int a = yp.a(this.f3956c, j3, false, false);
        if (a < this.f3956c.length) {
            return a;
        }
        return -1;
    }

    public static /* synthetic */ int a(xr xrVar, xr xrVar2) {
        return Long.compare(xrVar.f9076b, xrVar2.f9076b);
    }
}
