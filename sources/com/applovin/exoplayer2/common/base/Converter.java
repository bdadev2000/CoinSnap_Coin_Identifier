package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @LazyInit
    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    /* loaded from: classes.dex */
    public class a implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f22465a;

        /* renamed from: com.applovin.exoplayer2.common.base.Converter$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0066a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator f22467a;

            public C0066a() {
                this.f22467a = a.this.f22465a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f22467a.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public Object next() {
                return Converter.this.convert(this.f22467a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f22467a.remove();
            }
        }

        public a(Iterable iterable) {
            this.f22465a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0066a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Converter f22469a;

        /* renamed from: b, reason: collision with root package name */
        final Converter f22470b;

        public b(Converter converter, Converter converter2) {
            this.f22469a = converter;
            this.f22470b = converter2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoBackward(Object obj) {
            return this.f22469a.correctedDoBackward(this.f22470b.correctedDoBackward(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoForward(Object obj) {
            return this.f22470b.correctedDoForward(this.f22469a.correctedDoForward(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doBackward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doForward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22469a.equals(bVar.f22469a) && this.f22470b.equals(bVar.f22470b);
        }

        public int hashCode() {
            return this.f22470b.hashCode() + (this.f22469a.hashCode() * 31);
        }

        public String toString() {
            return this.f22469a + ".andThen(" + this.f22470b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Function f22471a;

        /* renamed from: b, reason: collision with root package name */
        private final Function f22472b;

        public /* synthetic */ c(Function function, Function function2, a aVar) {
            this(function, function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doBackward(Object obj) {
            return this.f22472b.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doForward(Object obj) {
            return this.f22471a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22471a.equals(cVar.f22471a) && this.f22472b.equals(cVar.f22472b);
        }

        public int hashCode() {
            return this.f22472b.hashCode() + (this.f22471a.hashCode() * 31);
        }

        public String toString() {
            return "Converter.from(" + this.f22471a + ", " + this.f22472b + ")";
        }

        private c(Function function, Function function2) {
            this.f22471a = (Function) Preconditions.checkNotNull(function);
            this.f22472b = (Function) Preconditions.checkNotNull(function2);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final d f22473a = new d();

        private d() {
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter doAndThen(Converter converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doBackward(Object obj) {
            return obj;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doForward(Object obj) {
            return obj;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public d reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Converter f22474a;

        public e(Converter converter) {
            this.f22474a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoBackward(Object obj) {
            return this.f22474a.correctedDoForward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoForward(Object obj) {
            return this.f22474a.correctedDoBackward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doBackward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doForward(Object obj) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f22474a.equals(((e) obj).f22474a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f22474a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter reverse() {
            return this.f22474a;
        }

        public String toString() {
            return this.f22474a + ".reverse()";
        }
    }

    public Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new c(function, function2, null);
    }

    public static <T> Converter<T, T> identity() {
        return d.f22473a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @CanIgnoreReturnValue
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return convert(a2);
    }

    @CanIgnoreReturnValue
    @NullableDecl
    public final B convert(@NullableDecl A a2) {
        return correctedDoForward(a2);
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b2) {
        if (!this.handleNullAutomatically) {
            return doBackward(b2);
        }
        if (b2 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b2));
    }

    @NullableDecl
    public B correctedDoForward(@NullableDecl A a2) {
        if (!this.handleNullAutomatically) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a2));
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new b(this, (Converter) Preconditions.checkNotNull(converter));
    }

    @ForOverride
    public abstract A doBackward(B b2);

    @ForOverride
    public abstract B doForward(A a2);

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        e eVar = new e(this);
        this.reverse = eVar;
        return eVar;
    }

    public Converter(boolean z2) {
        this.handleNullAutomatically = z2;
    }
}
