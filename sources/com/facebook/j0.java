package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 extends AbstractList {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f11151g = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public Handler f11152b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11153c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11154d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11155f;

    public j0(Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f11153c = String.valueOf(Integer.valueOf(f11151g.incrementAndGet()));
        this.f11155f = new ArrayList();
        this.f11154d = new ArrayList(requests);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        g0 element = (g0) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        this.f11154d.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f11154d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof g0;
        }
        if (!z10) {
            return false;
        }
        return super.contains((g0) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (g0) this.f11154d.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof g0;
        }
        if (!z10) {
            return -1;
        }
        return super.indexOf((g0) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof g0;
        }
        if (!z10) {
            return -1;
        }
        return super.lastIndexOf((g0) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof g0) {
            return super.remove((g0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        g0 element = (g0) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return (g0) this.f11154d.set(i10, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11154d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return (g0) this.f11154d.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g0 element = (g0) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f11154d.add(element);
    }

    public j0(g0... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f11153c = String.valueOf(Integer.valueOf(f11151g.incrementAndGet()));
        this.f11155f = new ArrayList();
        this.f11154d = new ArrayList(ArraysKt.asList(requests));
    }
}
