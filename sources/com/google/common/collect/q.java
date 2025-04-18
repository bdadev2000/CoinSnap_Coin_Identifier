package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class q extends o implements List {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f12017h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Object obj, List list, o oVar) {
        super(rVar, obj, list, oVar);
        this.f12017h = rVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        boolean isEmpty = this.f12009c.isEmpty();
        ((List) this.f12009c).add(i10, obj);
        this.f12017h.f12025g++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f12009c).addAll(i10, collection);
        if (addAll) {
            this.f12017h.f12025g += this.f12009c.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        return ((List) this.f12009c).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f12009c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f12009c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new p(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        Object remove = ((List) this.f12009c).remove(i10);
        r rVar = this.f12017h;
        rVar.f12025g--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        b();
        return ((List) this.f12009c).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        b();
        List subList = ((List) this.f12009c).subList(i10, i11);
        o oVar = this.f12010d;
        if (oVar == null) {
            oVar = this;
        }
        r rVar = this.f12017h;
        rVar.getClass();
        boolean z10 = subList instanceof RandomAccess;
        Object obj = this.f12008b;
        if (z10) {
            return new l(rVar, obj, subList, oVar);
        }
        return new q(rVar, obj, subList, oVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        return new p(this, i10);
    }
}
