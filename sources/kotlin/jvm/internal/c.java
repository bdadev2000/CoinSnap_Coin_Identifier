package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class c implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f30920a;

    /* renamed from: b, reason: collision with root package name */
    public int f30921b;

    public c(float[] fArr) {
        this.f30920a = fArr;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        try {
            float[] fArr = this.f30920a;
            int i2 = this.f30921b;
            this.f30921b = i2 + 1;
            return Float.valueOf(fArr[i2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f30921b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30921b < this.f30920a.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
