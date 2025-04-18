package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f30917a;

    /* renamed from: b, reason: collision with root package name */
    public int f30918b;

    public b(double[] dArr) {
        this.f30917a = dArr;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        try {
            double[] dArr = this.f30917a;
            int i2 = this.f30918b;
            this.f30918b = i2 + 1;
            return Double.valueOf(dArr[i2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f30918b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30918b < this.f30917a.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
