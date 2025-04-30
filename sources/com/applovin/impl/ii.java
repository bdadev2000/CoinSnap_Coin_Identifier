package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ii extends ab {

    /* renamed from: f, reason: collision with root package name */
    static final ab f8307f = new ii(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f8308c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f8309d;

    public ii(Object[] objArr, int i9) {
        this.f8308c = objArr;
        this.f8309d = i9;
    }

    @Override // com.applovin.impl.ab, com.applovin.impl.ya
    public int a(Object[] objArr, int i9) {
        System.arraycopy(this.f8308c, 0, objArr, i9, this.f8309d);
        return i9 + this.f8309d;
    }

    @Override // com.applovin.impl.ya
    public Object[] b() {
        return this.f8308c;
    }

    @Override // com.applovin.impl.ya
    public int c() {
        return this.f8309d;
    }

    @Override // com.applovin.impl.ya
    public int d() {
        return 0;
    }

    @Override // com.applovin.impl.ya
    public boolean e() {
        return false;
    }

    @Override // java.util.List
    public Object get(int i9) {
        Preconditions.checkElementIndex(i9, this.f8309d);
        return this.f8308c[i9];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8309d;
    }
}
