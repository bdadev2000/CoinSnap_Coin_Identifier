package s;

import java.util.Iterator;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2685b extends AbstractC2688e implements Iterator {
    public C2686c b;

    /* renamed from: c, reason: collision with root package name */
    public C2686c f22952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22953d;

    public C2685b(C2686c c2686c, C2686c c2686c2, int i9) {
        this.f22953d = i9;
        this.b = c2686c2;
        this.f22952c = c2686c;
    }

    @Override // s.AbstractC2688e
    public final void a(C2686c c2686c) {
        C2686c c2686c2 = null;
        if (this.b == c2686c && c2686c == this.f22952c) {
            this.f22952c = null;
            this.b = null;
        }
        C2686c c2686c3 = this.b;
        if (c2686c3 == c2686c) {
            this.b = b(c2686c3);
        }
        C2686c c2686c4 = this.f22952c;
        if (c2686c4 == c2686c) {
            C2686c c2686c5 = this.b;
            if (c2686c4 != c2686c5 && c2686c5 != null) {
                c2686c2 = c(c2686c4);
            }
            this.f22952c = c2686c2;
        }
    }

    public final C2686c b(C2686c c2686c) {
        switch (this.f22953d) {
            case 0:
                return c2686c.f22956f;
            default:
                return c2686c.f22955d;
        }
    }

    public final C2686c c(C2686c c2686c) {
        switch (this.f22953d) {
            case 0:
                return c2686c.f22955d;
            default:
                return c2686c.f22956f;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22952c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2686c c2686c;
        C2686c c2686c2 = this.f22952c;
        C2686c c2686c3 = this.b;
        if (c2686c2 != c2686c3 && c2686c3 != null) {
            c2686c = c(c2686c2);
        } else {
            c2686c = null;
        }
        this.f22952c = c2686c;
        return c2686c2;
    }
}
