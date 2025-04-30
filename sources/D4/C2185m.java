package d4;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: d4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2185m extends AbstractC2186n {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f19873d;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f19874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC2186n f19875g;

    public C2185m(AbstractC2186n abstractC2186n, int i9, int i10) {
        this.f19875g = abstractC2186n;
        this.f19873d = i9;
        this.f19874f = i10;
    }

    @Override // d4.AbstractC2180h
    public final Object[] c() {
        return this.f19875g.c();
    }

    @Override // d4.AbstractC2180h
    public final int d() {
        return this.f19875g.e() + this.f19873d + this.f19874f;
    }

    @Override // d4.AbstractC2180h
    public final int e() {
        return this.f19875g.e() + this.f19873d;
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        C2.m.g(i9, this.f19874f);
        return this.f19875g.get(i9 + this.f19873d);
    }

    @Override // d4.AbstractC2186n, d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // d4.AbstractC2186n, java.util.List
    /* renamed from: l */
    public final AbstractC2186n subList(int i9, int i10) {
        C2.m.j(i9, i10, this.f19874f);
        int i11 = this.f19873d;
        return this.f19875g.subList(i9 + i11, i10 + i11);
    }

    @Override // d4.AbstractC2186n, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19874f;
    }

    @Override // d4.AbstractC2186n, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i9) {
        return listIterator(i9);
    }
}
