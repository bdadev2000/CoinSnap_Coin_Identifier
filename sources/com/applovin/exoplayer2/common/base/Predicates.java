package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Predicates {

    /* loaded from: classes.dex */
    public static class b implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f6141a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i9 = 0; i9 < this.f6141a.size(); i9++) {
                if (!((Predicate) this.f6141a.get(i9)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6141a.equals(((b) obj).f6141a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6141a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f6141a);
        }

        private b(List list) {
            this.f6141a = list;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate f6142a;
        final Function b;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f6142a.apply(this.b.apply(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.b.equals(cVar.b) || !this.f6142a.equals(cVar.f6142a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() ^ this.f6142a.hashCode();
        }

        public String toString() {
            return this.f6142a + "(" + this.b + ")";
        }

        private c(Predicate predicate, Function function) {
            this.f6142a = (Predicate) Preconditions.checkNotNull(predicate);
            this.b = (Function) Preconditions.checkNotNull(function);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f6143a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            try {
                return this.f6143a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f6143a.equals(((d) obj).f6143a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6143a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f6143a + ")";
        }

        private d(Collection collection) {
            this.f6143a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f6144a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f6144a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof e) || this.f6144a != ((e) obj).f6144a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f6144a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f6144a.getName() + ")";
        }

        private e(Class cls) {
            this.f6144a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Object f6145a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f6145a.equals(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.f6145a.equals(((f) obj).f6145a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6145a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f6145a + ")";
        }

        private f(Object obj) {
            this.f6145a = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class g implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate f6146a;

        public g(Predicate predicate) {
            this.f6146a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return !this.f6146a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.f6146a.equals(((g) obj).f6146a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f6146a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f6146a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class h implements Predicate {

        /* renamed from: a, reason: collision with root package name */
        public static final h f6147a = new a("ALWAYS_TRUE", 0);
        public static final h b = new b("ALWAYS_FALSE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final h f6148c = new c("IS_NULL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final h f6149d = new d("NOT_NULL", 3);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ h[] f6150f = a();

        /* loaded from: classes.dex */
        public enum a extends h {
            public a(String str, int i9) {
                super(str, i9);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* loaded from: classes.dex */
        public enum b extends h {
            public b(String str, int i9) {
                super(str, i9);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* loaded from: classes.dex */
        public enum c extends h {
            public c(String str, int i9) {
                super(str, i9);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* loaded from: classes.dex */
        public enum d extends h {
            public d(String str, int i9) {
                super(str, i9);
            }

            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        private h(String str, int i9) {
        }

        private static /* synthetic */ h[] a() {
            return new h[]{f6147a, b, f6148c, f6149d};
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f6150f.clone();
        }

        public Predicate b() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f6151a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i9 = 0; i9 < this.f6151a.size(); i9++) {
                if (((Predicate) this.f6151a.get(i9)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.f6151a.equals(((i) obj).f6151a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6151a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f6151a);
        }

        private i(List list) {
            this.f6151a = list;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f6152a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof j) || this.f6152a != ((j) obj).f6152a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f6152a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f6152a.getName() + ")";
        }

        private j(Class cls) {
            this.f6152a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Class cls) {
            return this.f6152a.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return h.b.b();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return h.f6147a.b();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new b(defensiveCopy(iterable));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new c(predicate, function);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t9) {
        if (t9 == null) {
            return isNull();
        }
        return new f(t9);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new d(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new e(cls);
    }

    public static <T> Predicate<T> isNull() {
        return h.f6148c.b();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new g(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return h.f6149d.b();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new i(defensiveCopy(iterable));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new j(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z8 = true;
        for (Object obj : iterable) {
            if (!z8) {
                sb.append(',');
            }
            sb.append(obj);
            z8 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new b(defensiveCopy(predicateArr));
    }

    public static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new i(defensiveCopy(predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new b(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new i(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }
}
