package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class Equivalence<T> {

    /* loaded from: classes3.dex */
    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @NullableDecl
        private final T reference;

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
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

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t2) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends Equivalence implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final b f22475a = new b();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Predicate, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Equivalence f22476a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f22477b;

        public c(Equivalence equivalence, Object obj) {
            this.f22476a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f22477b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f22476a.equivalent(obj, this.f22477b);
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
            return this.f22476a.equals(cVar.f22476a) && Objects.equal(this.f22477b, cVar.f22477b);
        }

        public int hashCode() {
            return Objects.hashCode(this.f22476a, this.f22477b);
        }

        public String toString() {
            return this.f22476a + ".equivalentTo(" + this.f22477b + ")";
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends Equivalence implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final d f22478a = new d();

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
        return b.f22475a;
    }

    public static Equivalence<Object> identity() {
        return d.f22478a;
    }

    @ForOverride
    public abstract boolean doEquivalent(T t2, T t3);

    @ForOverride
    public abstract int doHash(T t2);

    public final boolean equivalent(@NullableDecl T t2, @NullableDecl T t3) {
        if (t2 == t3) {
            return true;
        }
        if (t2 == null || t3 == null) {
            return false;
        }
        return doEquivalent(t2, t3);
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t2) {
        return new c(this, t2);
    }

    public final int hash(@NullableDecl T t2) {
        if (t2 == null) {
            return 0;
        }
        return doHash(t2);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s2) {
        return new Wrapper<>(s2);
    }
}
