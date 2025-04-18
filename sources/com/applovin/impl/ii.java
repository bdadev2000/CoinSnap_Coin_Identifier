package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ii extends ab {

    /* renamed from: f, reason: collision with root package name */
    static final ab f5343f = new ii(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f5344c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f5345d;

    public ii(Object[] objArr, int i10) {
        this.f5344c = objArr;
        this.f5345d = i10;
    }

    @Override // com.applovin.impl.ab, com.applovin.impl.ya
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f5344c, 0, objArr, i10, this.f5345d);
        return i10 + this.f5345d;
    }

    @Override // com.applovin.impl.ya
    public Object[] b() {
        return this.f5344c;
    }

    @Override // com.applovin.impl.ya
    public int c() {
        return this.f5345d;
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
    public Object get(int i10) {
        Preconditions.checkElementIndex(i10, this.f5345d);
        return this.f5344c[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5345d;
    }
}
