package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class p extends f implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f12014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(qVar);
        this.f12014g = qVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        q qVar = this.f12014g;
        boolean isEmpty = qVar.isEmpty();
        b().add(obj);
        qVar.f12017h.f12025g++;
        if (isEmpty) {
            qVar.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f11941c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, int i10) {
        super(qVar, ((List) qVar.f12009c).listIterator(i10));
        this.f12014g = qVar;
    }
}
