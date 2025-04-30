package s;

import java.util.Iterator;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2687d extends AbstractC2688e implements Iterator {
    public C2686c b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22957c = true;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2689f f22958d;

    public C2687d(C2689f c2689f) {
        this.f22958d = c2689f;
    }

    @Override // s.AbstractC2688e
    public final void a(C2686c c2686c) {
        boolean z8;
        C2686c c2686c2 = this.b;
        if (c2686c == c2686c2) {
            C2686c c2686c3 = c2686c2.f22956f;
            this.b = c2686c3;
            if (c2686c3 == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f22957c = z8;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22957c) {
            if (this.f22958d.b == null) {
                return false;
            }
            return true;
        }
        C2686c c2686c = this.b;
        if (c2686c == null || c2686c.f22955d == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2686c c2686c;
        if (this.f22957c) {
            this.f22957c = false;
            this.b = this.f22958d.b;
        } else {
            C2686c c2686c2 = this.b;
            if (c2686c2 != null) {
                c2686c = c2686c2.f22955d;
            } else {
                c2686c = null;
            }
            this.b = c2686c;
        }
        return this.b;
    }
}
