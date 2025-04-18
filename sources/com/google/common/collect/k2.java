package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class k2 extends n2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f11992d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Set f11993f;

    public /* synthetic */ k2(Set set, Set set2, int i10) {
        this.f11991c = i10;
        this.f11992d = set;
        this.f11993f = set2;
    }

    public final b a() {
        switch (this.f11991c) {
            case 0:
                return new j2(this);
            default:
                return new j1(this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f11991c;
        Set set = this.f11993f;
        Set set2 = this.f11992d;
        switch (i10) {
            case 0:
                if (!set2.contains(obj) && !set.contains(obj)) {
                    return false;
                }
                return true;
            default:
                if (!set2.contains(obj) || !set.contains(obj)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.f11991c) {
            case 1:
                if (this.f11992d.containsAll(collection) && this.f11993f.containsAll(collection)) {
                    return true;
                }
                return false;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i10 = this.f11991c;
        Set set = this.f11993f;
        Set set2 = this.f11992d;
        switch (i10) {
            case 0:
                if (set2.isEmpty() && set.isEmpty()) {
                    return true;
                }
                return false;
            default:
                return Collections.disjoint(set, set2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        switch (this.f11991c) {
            case 0:
                return a();
            default:
                return a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f11991c;
        Set set = this.f11993f;
        Set set2 = this.f11992d;
        switch (i10) {
            case 0:
                int size = set2.size();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            default:
                Iterator it2 = set2.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    if (set.contains(it2.next())) {
                        i11++;
                    }
                }
                return i11;
        }
    }
}
