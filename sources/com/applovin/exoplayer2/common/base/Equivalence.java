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

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t9) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t9;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Equivalence implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final b f6133a = new b();

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

        /* renamed from: a, reason: collision with root package name */
        private final Equivalence f6134a;
        private final Object b;

        public c(Equivalence equivalence, Object obj) {
            this.f6134a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f6134a.equivalent(obj, this.b);
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
            if (this.f6134a.equals(cVar.f6134a) && Objects.equal(this.b, cVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f6134a, this.b);
        }

        public String toString() {
            return this.f6134a + ".equivalentTo(" + this.b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Equivalence implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final d f6135a = new d();

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
        return b.f6133a;
    }

    public static Equivalence<Object> identity() {
        return d.f6135a;
    }

    public abstract boolean doEquivalent(T t9, T t10);

    public abstract int doHash(T t9);

    public final boolean equivalent(@NullableDecl T t9, @NullableDecl T t10) {
        if (t9 == t10) {
            return true;
        }
        if (t9 != null && t10 != null) {
            return doEquivalent(t9, t10);
        }
        return false;
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t9) {
        return new c(this, t9);
    }

    public final int hash(@NullableDecl T t9) {
        if (t9 == null) {
            return 0;
        }
        return doHash(t9);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s5) {
        return new Wrapper<>(s5);
    }
}
