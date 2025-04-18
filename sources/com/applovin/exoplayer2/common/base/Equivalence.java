package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Equivalence<T> {

    /* loaded from: classes.dex */
    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @NullableDecl
        private final T reference;

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Wrapper) {
                Wrapper wrapper = (Wrapper) obj;
                if (this.equivalence.equals(wrapper.equivalence)) {
                    return this.equivalence.equivalent(this.reference, wrapper.reference);
                }
                return false;
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t5) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Equivalence implements Serializable {
        static final b a = new b();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Predicate, Serializable {
        private final Equivalence a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f3402b;

        public c(Equivalence equivalence, Object obj) {
            this.a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f3402b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.a.equivalent(obj, this.f3402b);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && Objects.equal(this.f3402b, cVar.f3402b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.a, this.f3402b);
        }

        public String toString() {
            return this.a + ".equivalentTo(" + this.f3402b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Equivalence implements Serializable {
        static final d a = new d();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static Equivalence<Object> equals() {
        return b.a;
    }

    public static Equivalence<Object> identity() {
        return d.a;
    }

    public abstract boolean doEquivalent(T t5, T t10);

    public abstract int doHash(T t5);

    public final boolean equivalent(@NullableDecl T t5, @NullableDecl T t10) {
        if (t5 == t10) {
            return true;
        }
        if (t5 == null || t10 == null) {
            return false;
        }
        return doEquivalent(t5, t10);
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t5) {
        return new c(this, t5);
    }

    public final int hash(@NullableDecl T t5) {
        if (t5 == null) {
            return 0;
        }
        return doHash(t5);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s5) {
        return new Wrapper<>(s5);
    }
}
