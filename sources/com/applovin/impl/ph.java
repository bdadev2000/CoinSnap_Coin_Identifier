package com.applovin.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ph extends AbstractC0672b {

    /* renamed from: g, reason: collision with root package name */
    private final int f10045g;

    /* renamed from: h, reason: collision with root package name */
    private final int f10046h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f10047i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f10048j;

    /* renamed from: k, reason: collision with root package name */
    private final go[] f10049k;
    private final Object[] l;
    private final HashMap m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(Collection collection, tj tjVar) {
        super(false, tjVar);
        int i9 = 0;
        int size = collection.size();
        this.f10047i = new int[size];
        this.f10048j = new int[size];
        this.f10049k = new go[size];
        this.l = new Object[size];
        this.m = new HashMap();
        Iterator it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            zd zdVar = (zd) it.next();
            this.f10049k[i11] = zdVar.b();
            this.f10048j[i11] = i9;
            this.f10047i[i11] = i10;
            i9 += this.f10049k[i11].b();
            i10 += this.f10049k[i11].a();
            this.l[i11] = zdVar.a();
            this.m.put(this.l[i11], Integer.valueOf(i11));
            i11++;
        }
        this.f10045g = i9;
        this.f10046h = i10;
    }

    @Override // com.applovin.impl.go
    public int a() {
        return this.f10046h;
    }

    @Override // com.applovin.impl.AbstractC0672b
    public int b(Object obj) {
        Integer num = (Integer) this.m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.impl.AbstractC0672b
    public int d(int i9) {
        return yp.a(this.f10047i, i9 + 1, false, false);
    }

    @Override // com.applovin.impl.AbstractC0672b
    public int e(int i9) {
        return yp.a(this.f10048j, i9 + 1, false, false);
    }

    @Override // com.applovin.impl.AbstractC0672b
    public Object f(int i9) {
        return this.l[i9];
    }

    @Override // com.applovin.impl.AbstractC0672b
    public int g(int i9) {
        return this.f10047i[i9];
    }

    @Override // com.applovin.impl.AbstractC0672b
    public int h(int i9) {
        return this.f10048j[i9];
    }

    @Override // com.applovin.impl.AbstractC0672b
    public go i(int i9) {
        return this.f10049k[i9];
    }

    public List d() {
        return Arrays.asList(this.f10049k);
    }

    @Override // com.applovin.impl.go
    public int b() {
        return this.f10045g;
    }
}
