package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class bs implements kl {

    /* renamed from: a */
    private final List f6935a;
    private final long[] b;

    /* renamed from: c */
    private final long[] f6936c;

    public bs(List list) {
        this.f6935a = Collections.unmodifiableList(new ArrayList(list));
        this.b = new long[list.size() * 2];
        for (int i9 = 0; i9 < list.size(); i9++) {
            xr xrVar = (xr) list.get(i9);
            int i10 = i9 * 2;
            long[] jArr = this.b;
            jArr[i10] = xrVar.b;
            jArr[i10 + 1] = xrVar.f12295c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f6936c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.applovin.impl.kl
    public long a(int i9) {
        AbstractC0669a1.a(i9 >= 0);
        AbstractC0669a1.a(i9 < this.f6936c.length);
        return this.f6936c[i9];
    }

    @Override // com.applovin.impl.kl
    public List b(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < this.f6935a.size(); i9++) {
            long[] jArr = this.b;
            int i10 = i9 * 2;
            if (jArr[i10] <= j7 && j7 < jArr[i10 + 1]) {
                xr xrVar = (xr) this.f6935a.get(i9);
                z4 z4Var = xrVar.f12294a;
                if (z4Var.f12508f == -3.4028235E38f) {
                    arrayList2.add(xrVar);
                } else {
                    arrayList.add(z4Var);
                }
            }
        }
        Collections.sort(arrayList2, new X(0));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList.add(((xr) arrayList2.get(i11)).f12294a.a().a((-1) - i11, 1).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.f6936c.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j7) {
        int a6 = yp.a(this.f6936c, j7, false, false);
        if (a6 < this.f6936c.length) {
            return a6;
        }
        return -1;
    }

    public static /* synthetic */ int a(xr xrVar, xr xrVar2) {
        return Long.compare(xrVar.b, xrVar2.b);
    }
}
