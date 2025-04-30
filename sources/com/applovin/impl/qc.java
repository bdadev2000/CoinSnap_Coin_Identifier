package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.nj;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class qc {

    /* loaded from: classes.dex */
    public class a extends zo {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.applovin.impl.zo
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class b implements Function {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10224a = new a("KEY", 0);
        public static final b b = new C0031b("VALUE", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f10225c = a();

        /* loaded from: classes.dex */
        public enum a extends b {
            public a(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.applovin.impl.qc$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum C0031b extends b {
            public C0031b(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i9) {
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f10224a, b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10225c.clone();
        }

        public /* synthetic */ b(String str, int i9, pc pcVar) {
            this(str, i9);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends nj.b {
        public abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.applovin.impl.nj.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return nj.a((Set) this, collection.iterator());
            }
        }

        @Override // com.applovin.impl.nj.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a6 = nj.a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        a6.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(a6);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends nj.b {

        /* renamed from: a, reason: collision with root package name */
        final Map f10226a;

        public d(Map map) {
            this.f10226a = (Map) Preconditions.checkNotNull(map);
        }

        public Map a() {
            return this.f10226a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        final Map f10227a;

        public e(Map map) {
            this.f10227a = (Map) Preconditions.checkNotNull(map);
        }

        public final Map a() {
            return this.f10227a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return qc.a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a6 = nj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a6.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(a6);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a6 = nj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a6.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(a6);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f extends AbstractMap {

        /* renamed from: a, reason: collision with root package name */
        private transient Set f10228a;
        private transient Collection b;

        public abstract Set a();

        public Collection b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f10228a;
            if (set == null) {
                Set a6 = a();
                this.f10228a = a6;
                return a6;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.b;
            if (collection == null) {
                Collection b = b();
                this.b = b;
                return b;
            }
            return collection;
        }
    }

    public static int a(int i9) {
        if (i9 < 3) {
            n3.a(i9, "expectedSize");
            return i9 + 1;
        }
        if (i9 < 1073741824) {
            return (int) ((i9 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object c(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object d(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static IdentityHashMap b() {
        return new IdentityHashMap();
    }

    public static Function c() {
        return b.b;
    }

    public static String a(Map map) {
        StringBuilder a6 = o3.a(map.size());
        a6.append('{');
        boolean z8 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z8) {
                a6.append(", ");
            }
            a6.append(entry.getKey());
            a6.append('=');
            a6.append(entry.getValue());
            z8 = false;
        }
        a6.append('}');
        return a6.toString();
    }

    public static Function a() {
        return b.f10224a;
    }

    public static Iterator a(Iterator it) {
        return new a(it);
    }

    public static Map.Entry a(Object obj, Object obj2) {
        return new za(obj, obj2);
    }
}
