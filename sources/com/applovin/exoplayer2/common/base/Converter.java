package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    /* loaded from: classes.dex */
    public class a implements Iterable {
        final /* synthetic */ Iterable a;

        /* renamed from: com.applovin.exoplayer2.common.base.Converter$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0005a implements Iterator {
            private final Iterator a;

            public C0005a() {
                this.a = a.this.a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public Object next() {
                return Converter.this.convert(this.a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
            }
        }

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0005a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Converter implements Serializable {
        final Converter a;

        /* renamed from: b, reason: collision with root package name */
        final Converter f3400b;

        public b(Converter converter, Converter converter2) {
            this.a = converter;
            this.f3400b = converter2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoBackward(Object obj) {
            return this.a.correctedDoBackward(this.f3400b.correctedDoBackward(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoForward(Object obj) {
            return this.f3400b.correctedDoForward(this.a.correctedDoForward(obj));
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
            if (!this.a.equals(bVar.a) || !this.f3400b.equals(bVar.f3400b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f3400b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            return this.a + ".andThen(" + this.f3400b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Converter implements Serializable {
        private final Function a;

        /* renamed from: b, reason: collision with root package name */
        private final Function f3401b;

        public /* synthetic */ c(Function function, Function function2, a aVar) {
            this(function, function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doBackward(Object obj) {
            return this.f3401b.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doForward(Object obj) {
            return this.a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.a.equals(cVar.a) || !this.f3401b.equals(cVar.f3401b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f3401b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            return "Converter.from(" + this.a + ", " + this.f3401b + ")";
        }

        private c(Function function, Function function2) {
            this.a = (Function) Preconditions.checkNotNull(function);
            this.f3401b = (Function) Preconditions.checkNotNull(function2);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Converter implements Serializable {
        static final d a = new d();

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
        final Converter a;

        public e(Converter converter) {
            this.a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoBackward(Object obj) {
            return this.a.correctedDoForward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoForward(Object obj) {
            return this.a.correctedDoBackward(obj);
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
                return this.a.equals(((e) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter reverse() {
            return this.a;
        }

        public String toString() {
            return this.a + ".reverse()";
        }
    }

    public Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new c(function, function2, null);
    }

    public static <T> Converter<T, T> identity() {
        return d.a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a10) {
        return convert(a10);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a10) {
        return correctedDoForward(a10);
    }

    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b3) {
        if (this.handleNullAutomatically) {
            if (b3 == null) {
                return null;
            }
            return (A) Preconditions.checkNotNull(doBackward(b3));
        }
        return doBackward(b3);
    }

    @NullableDecl
    public B correctedDoForward(@NullableDecl A a10) {
        if (this.handleNullAutomatically) {
            if (a10 == null) {
                return null;
            }
            return (B) Preconditions.checkNotNull(doForward(a10));
        }
        return doForward(a10);
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new b(this, (Converter) Preconditions.checkNotNull(converter));
    }

    public abstract A doBackward(B b3);

    public abstract B doForward(A a10);

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter == null) {
            e eVar = new e(this);
            this.reverse = eVar;
            return eVar;
        }
        return converter;
    }

    public Converter(boolean z10) {
        this.handleNullAutomatically = z10;
    }
}
