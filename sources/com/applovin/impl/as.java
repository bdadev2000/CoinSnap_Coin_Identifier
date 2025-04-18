package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class as implements nl {

    /* renamed from: a */
    private final List f22958a;

    /* renamed from: b */
    private final long[] f22959b;

    /* renamed from: c */
    private final long[] f22960c;

    public as(List list) {
        this.f22958a = Collections.unmodifiableList(new ArrayList(list));
        this.f22959b = new long[list.size() * 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            wr wrVar = (wr) list.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f22959b;
            jArr[i3] = wrVar.f27785b;
            jArr[i3 + 1] = wrVar.f27786c;
        }
        long[] jArr2 = this.f22959b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f22960c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.applovin.impl.nl
    public long a(int i2) {
        b1.a(i2 >= 0);
        b1.a(i2 < this.f22960c.length);
        return this.f22960c[i2];
    }

    @Override // com.applovin.impl.nl
    public List b(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f22958a.size(); i2++) {
            long[] jArr = this.f22959b;
            int i3 = i2 * 2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                wr wrVar = (wr) this.f22958a.get(i2);
                b5 b5Var = wrVar.f27784a;
                if (b5Var.f22993f == -3.4028235E38f) {
                    arrayList2.add(wrVar);
                } else {
                    arrayList.add(b5Var);
                }
            }
        }
        Collections.sort(arrayList2, new ns(0));
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            arrayList.add(((wr) arrayList2.get(i4)).f27784a.a().a((-1) - i4, 1).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.f22960c.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j2) {
        int a2 = xp.a(this.f22960c, j2, false, false);
        if (a2 < this.f22960c.length) {
            return a2;
        }
        return -1;
    }

    public static /* synthetic */ int a(wr wrVar, wr wrVar2) {
        return Long.compare(wrVar.f27785b, wrVar2.f27785b);
    }
}
