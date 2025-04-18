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
        final /* synthetic */ Set a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f6417b;

        /* renamed from: com.applovin.impl.nj$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0027a extends d {

            /* renamed from: c, reason: collision with root package name */
            final Iterator f6418c;

            public C0027a() {
                this.f6418c = a.this.a.iterator();
            }

            @Override // com.applovin.impl.d
            public Object a() {
                while (this.f6418c.hasNext()) {
                    Object next = this.f6418c.next();
                    if (a.this.f6417b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.a = set;
            this.f6417b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.a.contains(obj) && this.f6417b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.a.containsAll(collection) && this.f6417b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f6417b, this.a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f6417b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
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
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
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
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }

    public static HashSet a() {
        return new HashSet();
    }

    public static HashSet a(int i10) {
        return new HashSet(qc.a(i10));
    }
}
