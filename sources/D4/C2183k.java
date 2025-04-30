package d4;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: d4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2183k extends AbstractC2186n {

    /* renamed from: d, reason: collision with root package name */
    public final transient AbstractC2186n f19872d;

    public C2183k(AbstractC2186n abstractC2186n) {
        this.f19872d = abstractC2186n;
    }

    @Override // d4.AbstractC2186n, d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19872d.contains(obj);
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return this.f19872d.f();
    }

    @Override // java.util.List
    public final Object get(int i9) {
        AbstractC2186n abstractC2186n = this.f19872d;
        C2.m.g(i9, abstractC2186n.size());
        return abstractC2186n.get((abstractC2186n.size() - 1) - i9);
    }

    @Override // d4.AbstractC2186n, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f19872d.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // d4.AbstractC2186n, d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // d4.AbstractC2186n
    public final AbstractC2186n k() {
        return this.f19872d;
    }

    @Override // d4.AbstractC2186n, java.util.List
    /* renamed from: l */
    public final AbstractC2186n subList(int i9, int i10) {
        AbstractC2186n abstractC2186n = this.f19872d;
        C2.m.j(i9, i10, abstractC2186n.size());
        return abstractC2186n.subList(abstractC2186n.size() - i10, abstractC2186n.size() - i9).k();
    }

    @Override // d4.AbstractC2186n, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f19872d.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // d4.AbstractC2186n, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19872d.size();
    }

    @Override // d4.AbstractC2186n, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i9) {
        return listIterator(i9);
    }
}
