package com.applovin.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ph extends b {

    /* renamed from: g, reason: collision with root package name */
    private final int f6978g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6979h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f6980i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f6981j;

    /* renamed from: k, reason: collision with root package name */
    private final go[] f6982k;

    /* renamed from: l, reason: collision with root package name */
    private final Object[] f6983l;

    /* renamed from: m, reason: collision with root package name */
    private final HashMap f6984m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(Collection collection, tj tjVar) {
        super(false, tjVar);
        int i10 = 0;
        int size = collection.size();
        this.f6980i = new int[size];
        this.f6981j = new int[size];
        this.f6982k = new go[size];
        this.f6983l = new Object[size];
        this.f6984m = new HashMap();
        Iterator it = collection.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            zd zdVar = (zd) it.next();
            this.f6982k[i12] = zdVar.b();
            this.f6981j[i12] = i10;
            this.f6980i[i12] = i11;
            i10 += this.f6982k[i12].b();
            i11 += this.f6982k[i12].a();
            this.f6983l[i12] = zdVar.a();
            this.f6984m.put(this.f6983l[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f6978g = i10;
        this.f6979h = i11;
    }

    @Override // com.applovin.impl.go
    public int a() {
        return this.f6979h;
    }

    @Override // com.applovin.impl.b
    public int b(Object obj) {
        Integer num = (Integer) this.f6984m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.impl.b
    public int d(int i10) {
        return yp.a(this.f6980i, i10 + 1, false, false);
    }

    @Override // com.applovin.impl.b
    public int e(int i10) {
        return yp.a(this.f6981j, i10 + 1, false, false);
    }

    @Override // com.applovin.impl.b
    public Object f(int i10) {
        return this.f6983l[i10];
    }

    @Override // com.applovin.impl.b
    public int g(int i10) {
        return this.f6980i[i10];
    }

    @Override // com.applovin.impl.b
    public int h(int i10) {
        return this.f6981j[i10];
    }

    @Override // com.applovin.impl.b
    public go i(int i10) {
        return this.f6982k[i10];
    }

    public List d() {
        return Arrays.asList(this.f6982k);
    }

    @Override // com.applovin.impl.go
    public int b() {
        return this.f6978g;
    }
}
