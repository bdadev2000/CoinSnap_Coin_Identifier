package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ek extends eb {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f4475c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f4476d;

    public ek(Object obj) {
        this.f4475c = Preconditions.checkNotNull(obj);
    }

    @Override // com.applovin.impl.ya
    public int a(Object[] objArr, int i10) {
        objArr[i10] = this.f4475c;
        return i10 + 1;
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f4475c.equals(obj);
    }

    @Override // com.applovin.impl.ya
    public boolean e() {
        return false;
    }

    @Override // com.applovin.impl.eb
    public ab f() {
        return ab.a(this.f4475c);
    }

    @Override // com.applovin.impl.eb
    public boolean g() {
        return this.f4476d != 0;
    }

    @Override // com.applovin.impl.eb, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f4476d;
        if (i10 == 0) {
            int hashCode = this.f4475c.hashCode();
            this.f4476d = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public qp iterator() {
        return sb.a(this.f4475c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "[" + this.f4475c.toString() + AbstractJsonLexerKt.END_LIST;
    }

    public ek(Object obj, int i10) {
        this.f4475c = obj;
        this.f4476d = i10;
    }
}
