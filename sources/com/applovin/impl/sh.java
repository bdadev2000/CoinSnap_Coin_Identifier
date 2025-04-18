package com.applovin.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class sh extends b {

    /* renamed from: g, reason: collision with root package name */
    private final int f26894g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26895h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f26896i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f26897j;

    /* renamed from: k, reason: collision with root package name */
    private final fo[] f26898k;

    /* renamed from: l, reason: collision with root package name */
    private final Object[] f26899l;

    /* renamed from: m, reason: collision with root package name */
    private final HashMap f26900m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(Collection collection, wj wjVar) {
        super(false, wjVar);
        int i2 = 0;
        int size = collection.size();
        this.f26896i = new int[size];
        this.f26897j = new int[size];
        this.f26898k = new fo[size];
        this.f26899l = new Object[size];
        this.f26900m = new HashMap();
        Iterator it = collection.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            ee eeVar = (ee) it.next();
            this.f26898k[i4] = eeVar.b();
            this.f26897j[i4] = i2;
            this.f26896i[i4] = i3;
            i2 += this.f26898k[i4].b();
            i3 += this.f26898k[i4].a();
            this.f26899l[i4] = eeVar.a();
            this.f26900m.put(this.f26899l[i4], Integer.valueOf(i4));
            i4++;
        }
        this.f26894g = i2;
        this.f26895h = i3;
    }

    @Override // com.applovin.impl.fo
    public int a() {
        return this.f26895h;
    }

    @Override // com.applovin.impl.fo
    public int b() {
        return this.f26894g;
    }

    @Override // com.applovin.impl.b
    public int d(int i2) {
        return xp.a(this.f26896i, i2 + 1, false, false);
    }

    @Override // com.applovin.impl.b
    public int e(int i2) {
        return xp.a(this.f26897j, i2 + 1, false, false);
    }

    @Override // com.applovin.impl.b
    public Object f(int i2) {
        return this.f26899l[i2];
    }

    @Override // com.applovin.impl.b
    public int g(int i2) {
        return this.f26896i[i2];
    }

    @Override // com.applovin.impl.b
    public int h(int i2) {
        return this.f26897j[i2];
    }

    @Override // com.applovin.impl.b
    public fo i(int i2) {
        return this.f26898k[i2];
    }

    @Override // com.applovin.impl.b
    public int b(Object obj) {
        Integer num = (Integer) this.f26900m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public List d() {
        return Arrays.asList(this.f26898k);
    }
}
