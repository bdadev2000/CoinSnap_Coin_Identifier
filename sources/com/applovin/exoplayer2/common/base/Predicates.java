package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class Predicates {

    /* loaded from: classes3.dex */
    public static class b implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f22484a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i2 = 0; i2 < this.f22484a.size(); i2++) {
                if (!((Predicate) this.f22484a.get(i2)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f22484a.equals(((b) obj).f22484a);
            }
            return false;
        }

        public int hashCode() {
            return this.f22484a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f22484a);
        }

        private b(List list) {
            this.f22484a = list;
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate f22485a;

        /* renamed from: b, reason: collision with root package name */
        final Function f22486b;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f22485a.apply(this.f22486b.apply(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22486b.equals(cVar.f22486b) && this.f22485a.equals(cVar.f22485a);
        }

        public int hashCode() {
            return this.f22486b.hashCode() ^ this.f22485a.hashCode();
        }

        public String toString() {
            return this.f22485a + "(" + this.f22486b + ")";
        }

        private c(Predicate predicate, Function function) {
            this.f22485a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f22486b = (Function) Preconditions.checkNotNull(function);
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Collection f22487a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            try {
                return this.f22487a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f22487a.equals(((d) obj).f22487a);
            }
            return false;
        }

        public int hashCode() {
            return this.f22487a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f22487a + ")";
        }

        private d(Collection collection) {
            this.f22487a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    /* loaded from: classes3.dex */
    public static class e implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f22488a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f22488a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f22488a == ((e) obj).f22488a;
        }

        public int hashCode() {
            return this.f22488a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f22488a.getName() + ")";
        }

        private e(Class cls) {
            this.f22488a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    /* loaded from: classes3.dex */
    public static class f implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Object f22489a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f22489a.equals(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.f22489a.equals(((f) obj).f22489a);
            }
            return false;
        }

        public int hashCode() {
            return this.f22489a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f22489a + ")";
        }

        private f(Object obj) {
            this.f22489a = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static class g implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Predicate f22490a;

        public g(Predicate predicate) {
            this.f22490a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return !this.f22490a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.f22490a.equals(((g) obj).f22490a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f22490a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f22490a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class h implements Predicate {

        /* renamed from: a, reason: collision with root package name */
        public static final h f22491a = new a("ALWAYS_TRUE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final h f22492b = new b("ALWAYS_FALSE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final h f22493c = new c("IS_NULL", 2);
        public static final h d = new d("NOT_NULL", 3);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ h[] f22494f = a();

        /* loaded from: classes3.dex */
        public enum a extends h {
            public a(String str, int i2) {
                super(str, i2);
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

        /* loaded from: classes3.dex */
        public enum b extends h {
            public b(String str, int i2) {
                super(str, i2);
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

        /* loaded from: classes3.dex */
        public enum c extends h {
            public c(String str, int i2) {
                super(str, i2);
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

        /* loaded from: classes3.dex */
        public enum d extends h {
            public d(String str, int i2) {
                super(str, i2);
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

        private h(String str, int i2) {
        }

        private static /* synthetic */ h[] a() {
            return new h[]{f22491a, f22492b, f22493c, d};
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f22494f.clone();
        }

        public Predicate b() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class i implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f22495a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i2 = 0; i2 < this.f22495a.size(); i2++) {
                if (((Predicate) this.f22495a.get(i2)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.f22495a.equals(((i) obj).f22495a);
            }
            return false;
        }

        public int hashCode() {
            return this.f22495a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f22495a);
        }

        private i(List list) {
            this.f22495a = list;
        }
    }

    /* loaded from: classes3.dex */
    public static class j implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f22496a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            return (obj instanceof j) && this.f22496a == ((j) obj).f22496a;
        }

        public int hashCode() {
            return this.f22496a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f22496a.getName() + ")";
        }

        private j(Class cls) {
            this.f22496a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Class cls) {
            return this.f22496a.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return h.f22492b.b();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return h.f22491a.b();
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

    public static <T> Predicate<T> equalTo(@NullableDecl T t2) {
        return t2 == null ? isNull() : new f(t2);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new d(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new e(cls);
    }

    public static <T> Predicate<T> isNull() {
        return h.f22493c.b();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new g(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return h.d.b();
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
        boolean z2 = true;
        for (Object obj : iterable) {
            if (!z2) {
                sb.append(',');
            }
            sb.append(obj);
            z2 = false;
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
