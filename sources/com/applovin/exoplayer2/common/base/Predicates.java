package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Predicates {

    /* loaded from: classes.dex */
    public static class b implements Predicate, Serializable {
        private final List a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.a.size(); i10++) {
                if (!((Predicate) this.a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.a);
        }

        private b(List list) {
            this.a = list;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Predicate, Serializable {
        final Predicate a;

        /* renamed from: b, reason: collision with root package name */
        final Function f3407b;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.a.apply(this.f3407b.apply(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f3407b.equals(cVar.f3407b) || !this.a.equals(cVar.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f3407b.hashCode() ^ this.a.hashCode();
        }

        public String toString() {
            return this.a + "(" + this.f3407b + ")";
        }

        private c(Predicate predicate, Function function) {
            this.a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f3407b = (Function) Preconditions.checkNotNull(function);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Predicate, Serializable {
        private final Collection a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            try {
                return this.a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.a + ")";
        }

        private d(Collection collection) {
            this.a = (Collection) Preconditions.checkNotNull(collection);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Predicate, Serializable {
        private final Class a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof e) || this.a != ((e) obj).a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.a.getName() + ")";
        }

        private e(Class cls) {
            this.a = (Class) Preconditions.checkNotNull(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Predicate, Serializable {
        private final Object a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.a.equals(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.a.equals(((f) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.a + ")";
        }

        private f(Object obj) {
            this.a = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class g implements Predicate, Serializable {
        final Predicate a;

        public g(Predicate predicate) {
            this.a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return !this.a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.a.equals(((g) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class h implements Predicate {
        public static final h a = new a("ALWAYS_TRUE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final h f3408b = new b("ALWAYS_FALSE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final h f3409c = new c("IS_NULL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final h f3410d = new d("NOT_NULL", 3);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ h[] f3411f = a();

        /* loaded from: classes.dex */
        public enum a extends h {
            public a(String str, int i10) {
                super(str, i10);
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
            public b(String str, int i10) {
                super(str, i10);
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
            public c(String str, int i10) {
                super(str, i10);
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
            public d(String str, int i10) {
                super(str, i10);
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

        private h(String str, int i10) {
        }

        private static /* synthetic */ h[] a() {
            return new h[]{a, f3408b, f3409c, f3410d};
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f3411f.clone();
        }

        public Predicate b() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Predicate, Serializable {
        private final List a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.a.size(); i10++) {
                if (((Predicate) this.a.get(i10)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.a.equals(((i) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.a);
        }

        private i(List list) {
            this.a = list;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Predicate, Serializable {
        private final Class a;

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (!(obj instanceof j) || this.a != ((j) obj).a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.a.getName() + ")";
        }

        private j(Class cls) {
            this.a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Class cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return h.f3408b.b();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return h.a.b();
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

    public static <T> Predicate<T> equalTo(@NullableDecl T t5) {
        return t5 == null ? isNull() : new f(t5);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new d(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new e(cls);
    }

    public static <T> Predicate<T> isNull() {
        return h.f3409c.b();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new g(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return h.f3410d.b();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new i(defensiveCopy(iterable));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new j(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
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
