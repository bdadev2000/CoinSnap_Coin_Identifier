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

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f6127a;

        /* renamed from: com.applovin.exoplayer2.common.base.Converter$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0005a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator f6128a;

            public C0005a() {
                this.f6128a = a.this.f6127a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f6128a.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public Object next() {
                return Converter.this.convert(this.f6128a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f6128a.remove();
            }
        }

        public a(Iterable iterable) {
            this.f6127a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C0005a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Converter f6129a;
        final Converter b;

        public b(Converter converter, Converter converter2) {
            this.f6129a = converter;
            this.b = converter2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoBackward(Object obj) {
            return this.f6129a.correctedDoBackward(this.b.correctedDoBackward(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoForward(Object obj) {
            return this.b.correctedDoForward(this.f6129a.correctedDoForward(obj));
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
            if (!this.f6129a.equals(bVar.f6129a) || !this.b.equals(bVar.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.f6129a.hashCode() * 31);
        }

        public String toString() {
            return this.f6129a + ".andThen(" + this.b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Function f6130a;
        private final Function b;

        public /* synthetic */ c(Function function, Function function2, a aVar) {
            this(function, function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doBackward(Object obj) {
            return this.b.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object doForward(Object obj) {
            return this.f6130a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f6130a.equals(cVar.f6130a) || !this.b.equals(cVar.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.f6130a.hashCode() * 31);
        }

        public String toString() {
            return "Converter.from(" + this.f6130a + ", " + this.b + ")";
        }

        private c(Function function, Function function2) {
            this.f6130a = (Function) Preconditions.checkNotNull(function);
            this.b = (Function) Preconditions.checkNotNull(function2);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Converter implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final d f6131a = new d();

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
        final Converter f6132a;

        public e(Converter converter) {
            this.f6132a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoBackward(Object obj) {
            return this.f6132a.correctedDoForward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Object correctedDoForward(Object obj) {
            return this.f6132a.correctedDoBackward(obj);
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
                return this.f6132a.equals(((e) obj).f6132a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f6132a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter reverse() {
            return this.f6132a;
        }

        public String toString() {
            return this.f6132a + ".reverse()";
        }
    }

    public Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new c(function, function2, null);
    }

    public static <T> Converter<T, T> identity() {
        return d.f6131a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a6) {
        return convert(a6);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a6) {
        return correctedDoForward(a6);
    }

    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b8) {
        if (this.handleNullAutomatically) {
            if (b8 == null) {
                return null;
            }
            return (A) Preconditions.checkNotNull(doBackward(b8));
        }
        return doBackward(b8);
    }

    @NullableDecl
    public B correctedDoForward(@NullableDecl A a6) {
        if (this.handleNullAutomatically) {
            if (a6 == null) {
                return null;
            }
            return (B) Preconditions.checkNotNull(doForward(a6));
        }
        return doForward(a6);
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new b(this, (Converter) Preconditions.checkNotNull(converter));
    }

    public abstract A doBackward(B b8);

    public abstract B doForward(A a6);

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

    public Converter(boolean z8) {
        this.handleNullAutomatically = z8;
    }
}
