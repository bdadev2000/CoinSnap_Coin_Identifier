package L7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b implements Iterator, H7.a {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1832c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1833d;

    /* renamed from: f, reason: collision with root package name */
    public int f1834f;

    public b(int i9, int i10, int i11) {
        this.b = i11;
        this.f1832c = i10;
        boolean z8 = false;
        if (i11 <= 0 ? i9 >= i10 : i9 <= i10) {
            z8 = true;
        }
        this.f1833d = z8;
        this.f1834f = z8 ? i9 : i10;
    }

    public final int a() {
        int i9 = this.f1834f;
        if (i9 == this.f1832c) {
            if (this.f1833d) {
                this.f1833d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f1834f = this.b + i9;
        }
        return i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1833d;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
