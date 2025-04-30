package d1;

import z.AbstractC2965e;

/* renamed from: d1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2167h {

    /* renamed from: a, reason: collision with root package name */
    public String f19800a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2167h)) {
            return false;
        }
        C2167h c2167h = (C2167h) obj;
        if (this.b != c2167h.b) {
            return false;
        }
        return this.f19800a.equals(c2167h.f19800a);
    }

    public final int hashCode() {
        return AbstractC2965e.d(this.b) + (this.f19800a.hashCode() * 31);
    }
}
