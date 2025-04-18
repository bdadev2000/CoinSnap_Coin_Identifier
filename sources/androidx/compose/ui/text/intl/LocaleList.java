package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import e0.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.e;
import r0.a;

@Immutable
/* loaded from: classes2.dex */
public final class LocaleList implements Collection<Locale>, a {

    /* renamed from: c, reason: collision with root package name */
    public static final LocaleList f17401c = new LocaleList(w.f30218a);

    /* renamed from: a, reason: collision with root package name */
    public final List f17402a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17403b;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public LocaleList(List list) {
        this.f17402a = list;
        this.f17403b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Locale)) {
            return false;
        }
        return this.f17402a.contains((Locale) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f17402a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocaleList) {
            return p0.a.g(this.f17402a, ((LocaleList) obj).f17402a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f17402a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f17402a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f17402a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f17403b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f17402a + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return e.D(this, objArr);
    }
}
