package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f23937b;

    /* renamed from: c, reason: collision with root package name */
    public int f23938c;

    /* renamed from: d, reason: collision with root package name */
    public int f23939d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23940f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k.d f23941g;

    public g(k.d dVar, int i10) {
        this.f23941g = dVar;
        this.f23937b = i10;
        this.f23938c = dVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23939d < this.f23938c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object d10 = this.f23941g.d(this.f23939d, this.f23937b);
            this.f23939d++;
            this.f23940f = true;
            return d10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f23940f) {
            int i10 = this.f23939d - 1;
            this.f23939d = i10;
            this.f23938c--;
            this.f23940f = false;
            this.f23941g.j(i10);
            return;
        }
        throw new IllegalStateException();
    }
}
