package e0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class c implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30194a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f30195b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30196c;

    public c(Object[] objArr) {
        p0.a.s(objArr, "array");
        this.f30196c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f30194a;
        Object obj = this.f30196c;
        switch (i2) {
            case 0:
                return this.f30195b < ((f) obj).size();
            default:
                return this.f30195b < ((Object[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f30194a;
        Object obj = this.f30196c;
        switch (i2) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f30195b;
                this.f30195b = i3 + 1;
                return ((f) obj).get(i3);
            default:
                try {
                    int i4 = this.f30195b;
                    this.f30195b = i4 + 1;
                    return ((Object[]) obj)[i4];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f30195b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f30194a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(f fVar) {
        this.f30196c = fVar;
    }
}
