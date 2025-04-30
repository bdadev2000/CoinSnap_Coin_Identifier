package x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public int f24073c;

    /* renamed from: d, reason: collision with root package name */
    public int f24074d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24075f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2913a f24076g;

    public h(C2913a c2913a, int i9) {
        this.f24076g = c2913a;
        this.b = i9;
        this.f24073c = c2913a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24074d < this.f24073c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object b = this.f24076g.b(this.f24074d, this.b);
            this.f24074d++;
            this.f24075f = true;
            return b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f24075f) {
            int i9 = this.f24074d - 1;
            this.f24074d = i9;
            this.f24073c--;
            this.f24075f = false;
            this.f24076g.h(i9);
            return;
        }
        throw new IllegalStateException();
    }
}
