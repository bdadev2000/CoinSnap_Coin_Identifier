package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ek extends eb {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f7445c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f7446d;

    public ek(Object obj) {
        this.f7445c = Preconditions.checkNotNull(obj);
    }

    @Override // com.applovin.impl.ya
    public int a(Object[] objArr, int i9) {
        objArr[i9] = this.f7445c;
        return i9 + 1;
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f7445c.equals(obj);
    }

    @Override // com.applovin.impl.ya
    public boolean e() {
        return false;
    }

    @Override // com.applovin.impl.eb
    public ab f() {
        return ab.a(this.f7445c);
    }

    @Override // com.applovin.impl.eb
    public boolean g() {
        if (this.f7446d != 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.eb, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i9 = this.f7446d;
        if (i9 == 0) {
            int hashCode = this.f7445c.hashCode();
            this.f7446d = hashCode;
            return hashCode;
        }
        return i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public qp iterator() {
        return sb.a(this.f7445c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "[" + this.f7445c.toString() + ']';
    }

    public ek(Object obj, int i9) {
        this.f7445c = obj;
        this.f7446d = i9;
    }
}
