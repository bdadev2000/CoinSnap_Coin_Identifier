package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.rj;
import com.google.android.gms.common.api.Api;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes2.dex */
public abstract class vc {

    /* loaded from: classes2.dex */
    public class a extends yo {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.applovin.impl.yo
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static abstract class b implements Function {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27520a = new a("KEY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f27521b = new C0100b("VALUE", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f27522c = a();

        /* loaded from: classes2.dex */
        public enum a extends b {
            public a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.applovin.impl.vc$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum C0100b extends b {
            public C0100b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i2) {
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f27520a, f27521b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f27522c.clone();
        }

        public /* synthetic */ b(String str, int i2, uc ucVar) {
            this(str, i2);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c extends rj.b {
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

        @Override // com.applovin.impl.rj.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return rj.a((Set) this, collection.iterator());
            }
        }

        @Override // com.applovin.impl.rj.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = rj.a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        a2.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(a2);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends rj.b {

        /* renamed from: a, reason: collision with root package name */
        final Map f27523a;

        public d(Map map) {
            this.f27523a = (Map) Preconditions.checkNotNull(map);
        }

        public Map a() {
            return this.f27523a;
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

    /* loaded from: classes2.dex */
    public static class e extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        final Map f27524a;

        public e(Map map) {
            this.f27524a = (Map) Preconditions.checkNotNull(map);
        }

        public final Map a() {
            return this.f27524a;
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
            return vc.a(a().entrySet().iterator());
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
                HashSet a2 = rj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a2.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(a2);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a2 = rj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a2.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(a2);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f extends AbstractMap {

        /* renamed from: a, reason: collision with root package name */
        private transient Set f27525a;

        /* renamed from: b, reason: collision with root package name */
        private transient Collection f27526b;

        public abstract Set a();

        public Collection b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f27525a;
            if (set != null) {
                return set;
            }
            Set a2 = a();
            this.f27525a = a2;
            return a2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f27526b;
            if (collection != null) {
                return collection;
            }
            Collection b2 = b();
            this.f27526b = b2;
            return b2;
        }
    }

    public static int a(int i2) {
        if (i2 >= 3) {
            return i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        p3.a(i2, "expectedSize");
        return i2 + 1;
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
        return b.f27521b;
    }

    public static String a(Map map) {
        StringBuilder a2 = q3.a(map.size());
        a2.append('{');
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                a2.append(", ");
            }
            a2.append(entry.getKey());
            a2.append(SignatureVisitor.INSTANCEOF);
            a2.append(entry.getValue());
            z2 = false;
        }
        a2.append('}');
        return a2.toString();
    }

    public static Function a() {
        return b.f27520a;
    }

    public static Iterator a(Iterator it) {
        return new a(it);
    }

    public static Map.Entry a(Object obj, Object obj2) {
        return new db(obj, obj2);
    }
}
