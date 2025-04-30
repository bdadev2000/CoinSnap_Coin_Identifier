package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import u7.AbstractC2815f;

/* loaded from: classes.dex */
public final class E extends AbstractList {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f13401g = new AtomicInteger();
    public Handler b;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13403d;

    /* renamed from: c, reason: collision with root package name */
    public final String f13402c = String.valueOf(Integer.valueOf(f13401g.incrementAndGet()));

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13404f = new ArrayList();

    public E(Collection collection) {
        this.f13403d = new ArrayList(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        C c9 = (C) obj;
        G7.j.e(c9, "element");
        this.f13403d.add(i9, c9);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13403d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z8;
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof C;
        }
        if (!z8) {
            return false;
        }
        return super.contains((C) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return (C) this.f13403d.get(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z8;
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof C;
        }
        if (!z8) {
            return -1;
        }
        return super.indexOf((C) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z8;
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof C;
        }
        if (!z8) {
            return -1;
        }
        return super.lastIndexOf((C) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof C) {
            return super.remove((C) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        C c9 = (C) obj;
        G7.j.e(c9, "element");
        return (C) this.f13403d.set(i9, c9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13403d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        return (C) this.f13403d.remove(i9);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        C c9 = (C) obj;
        G7.j.e(c9, "element");
        return this.f13403d.add(c9);
    }

    public E(C... cArr) {
        this.f13403d = new ArrayList(AbstractC2815f.t(cArr));
    }
}
