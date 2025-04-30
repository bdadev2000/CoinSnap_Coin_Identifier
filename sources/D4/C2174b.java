package d4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: d4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2174b implements Iterator {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f19851c;

    /* renamed from: d, reason: collision with root package name */
    public int f19852d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2178f f19853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2178f f19855h;

    public C2174b(C2178f c2178f, int i9) {
        int i10;
        this.f19854g = i9;
        this.f19855h = c2178f;
        this.f19853f = c2178f;
        this.b = c2178f.f19862g;
        if (c2178f.isEmpty()) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f19851c = i10;
        this.f19852d = -1;
    }

    public final Object a(int i9) {
        switch (this.f19854g) {
            case 0:
                return this.f19855h.i()[i9];
            case 1:
                return new C2176d(this.f19855h, i9);
            default:
                return this.f19855h.k()[i9];
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19851c >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2178f c2178f = this.f19853f;
        if (c2178f.f19862g == this.b) {
            if (hasNext()) {
                int i9 = this.f19851c;
                this.f19852d = i9;
                Object a6 = a(i9);
                int i10 = this.f19851c + 1;
                if (i10 >= c2178f.f19863h) {
                    i10 = -1;
                }
                this.f19851c = i10;
                return a6;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z8;
        C2178f c2178f = this.f19853f;
        int i9 = c2178f.f19862g;
        int i10 = this.b;
        if (i9 == i10) {
            int i11 = this.f19852d;
            if (i11 >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                this.b = i10 + 32;
                c2178f.remove(c2178f.i()[i11]);
                this.f19851c--;
                this.f19852d = -1;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
