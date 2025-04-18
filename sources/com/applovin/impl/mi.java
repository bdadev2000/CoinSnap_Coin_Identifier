package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class mi extends eb {

    /* renamed from: f, reason: collision with root package name */
    static final eb f25581f = new mi(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f25582c;
    private final transient int d;

    public mi(Object[] objArr, int i2) {
        this.f25582c = objArr;
        this.d = i2;
    }

    @Override // com.applovin.impl.eb, com.applovin.impl.cb
    public int a(Object[] objArr, int i2) {
        System.arraycopy(this.f25582c, 0, objArr, i2, this.d);
        return i2 + this.d;
    }

    @Override // com.applovin.impl.cb
    public Object[] b() {
        return this.f25582c;
    }

    @Override // com.applovin.impl.cb
    public int c() {
        return this.d;
    }

    @Override // com.applovin.impl.cb
    public int d() {
        return 0;
    }

    @Override // com.applovin.impl.cb
    public boolean e() {
        return false;
    }

    @Override // java.util.List
    public Object get(int i2) {
        Preconditions.checkElementIndex(i2, this.d);
        return this.f25582c[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d;
    }
}
