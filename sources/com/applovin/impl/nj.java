package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class nj {

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f9353a;
        final /* synthetic */ Set b;

        /* renamed from: com.applovin.impl.nj$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0027a extends AbstractC0682d {

            /* renamed from: c, reason: collision with root package name */
            final Iterator f9354c;

            public C0027a() {
                this.f9354c = a.this.f9353a.iterator();
            }

            @Override // com.applovin.impl.AbstractC0682d
            public Object a() {
                while (this.f9354c.hasNext()) {
                    Object next = this.f9354c.next();
                    if (a.this.b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f9353a = set;
            this.b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.f9353a.contains(obj) && this.b.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            if (this.f9353a.containsAll(collection) && this.b.containsAll(collection)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.b, this.f9353a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f9353a.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                if (this.b.contains(it.next())) {
                    i9++;
                }
            }
            return i9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public qp iterator() {
            return new C0027a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return nj.a((Set) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends AbstractSet {
        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ c(mj mjVar) {
            this();
        }
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b() {
        return Collections.newSetFromMap(qc.b());
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i9 = ~(~(i9 + (next != null ? next.hashCode() : 0)));
        }
        return i9;
    }

    public static c a(Set set, Set set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new a(set, set2);
    }

    public static boolean a(Set set, Collection collection) {
        Preconditions.checkNotNull(collection);
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return sb.a(set.iterator(), collection);
        }
        return a(set, collection.iterator());
    }

    public static boolean a(Set set, Iterator it) {
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= set.remove(it.next());
        }
        return z8;
    }

    public static HashSet a() {
        return new HashSet();
    }

    public static HashSet a(int i9) {
        return new HashSet(qc.a(i9));
    }
}
