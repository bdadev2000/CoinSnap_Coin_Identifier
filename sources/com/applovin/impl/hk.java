package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hk extends ib {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f24327c;
    private transient int d;

    public hk(Object obj) {
        this.f24327c = Preconditions.checkNotNull(obj);
    }

    @Override // com.applovin.impl.cb
    public int a(Object[] objArr, int i2) {
        objArr[i2] = this.f24327c;
        return i2 + 1;
    }

    @Override // com.applovin.impl.cb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f24327c.equals(obj);
    }

    @Override // com.applovin.impl.cb
    public boolean e() {
        return false;
    }

    @Override // com.applovin.impl.ib
    public eb f() {
        return eb.a(this.f24327c);
    }

    @Override // com.applovin.impl.ib
    public boolean g() {
        return this.d != 0;
    }

    @Override // com.applovin.impl.ib, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.d;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f24327c.hashCode();
        this.d = hashCode;
        return hashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public pp iterator() {
        return xb.a(this.f24327c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "[" + this.f24327c.toString() + ']';
    }

    public hk(Object obj, int i2) {
        this.f24327c = obj;
        this.d = i2;
    }
}
