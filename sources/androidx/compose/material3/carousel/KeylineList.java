package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.u;
import e0.w;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.e;
import r0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class KeylineList implements List<Keyline>, a {

    /* renamed from: h, reason: collision with root package name */
    public static final KeylineList f12726h = new KeylineList(w.f30218a);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12729c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final int f12730f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12731g;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public KeylineList(List list) {
        int i2;
        int i3;
        this.f12727a = list;
        Iterator it = list.iterator();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (((Keyline) it.next()).f12724f) {
                break;
            } else {
                i5++;
            }
        }
        this.f12728b = i5;
        Iterator it2 = this.f12727a.iterator();
        int i6 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i6 = -1;
                break;
            } else if (!((Keyline) it2.next()).e) {
                break;
            } else {
                i6++;
            }
        }
        this.f12729c = i6;
        ListIterator listIterator = this.f12727a.listIterator(this.f12727a.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i3 = -1;
                break;
            } else if (!((Keyline) listIterator.previous()).e) {
                i3 = listIterator.nextIndex();
                break;
            }
        }
        this.d = i3;
        Iterator it3 = this.f12727a.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i4 = -1;
                break;
            } else if (((Keyline) it3.next()).d) {
                break;
            } else {
                i4++;
            }
        }
        this.f12730f = i4;
        ListIterator listIterator2 = this.f12727a.listIterator(this.f12727a.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (((Keyline) listIterator2.previous()).d) {
                i2 = listIterator2.nextIndex();
                break;
            }
        }
        this.f12731g = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Keyline get(int i2) {
        return (Keyline) this.f12727a.get(i2);
    }

    public final Keyline c() {
        Keyline keyline = (Keyline) u.G0(this.f12730f, this);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Keyline)) {
            return false;
        }
        return this.f12727a.contains((Keyline) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f12727a.containsAll(collection);
    }

    public final Keyline d() {
        Keyline keyline = (Keyline) u.G0(this.f12731g, this);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeylineList)) {
            return false;
        }
        KeylineList keylineList = (KeylineList) obj;
        if (this.f12727a.size() != keylineList.f12727a.size()) {
            return false;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!p0.a.g(get(i2), keylineList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int size = size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += get(i3).hashCode() * 31;
        }
        return i2;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return this.f12727a.indexOf((Keyline) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12727a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f12727a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return this.f12727a.lastIndexOf((Keyline) obj);
    }

    @Override // java.util.List
    public final ListIterator<Keyline> listIterator() {
        return this.f12727a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Keyline remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Keyline set(int i2, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12727a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<Keyline> subList(int i2, int i3) {
        return this.f12727a.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<Keyline> listIterator(int i2) {
        return this.f12727a.listIterator(i2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return e.D(this, objArr);
    }
}
