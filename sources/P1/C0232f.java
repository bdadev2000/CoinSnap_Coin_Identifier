package P1;

import java.security.MessageDigest;

/* renamed from: P1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232f implements N1.f {
    public final N1.f b;

    /* renamed from: c, reason: collision with root package name */
    public final N1.f f2304c;

    public C0232f(N1.f fVar, N1.f fVar2) {
        this.b = fVar;
        this.f2304c = fVar2;
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.f2304c.b(messageDigest);
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0232f)) {
            return false;
        }
        C0232f c0232f = (C0232f) obj;
        if (!this.b.equals(c0232f.b) || !this.f2304c.equals(c0232f.f2304c)) {
            return false;
        }
        return true;
    }

    @Override // N1.f
    public final int hashCode() {
        return this.f2304c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.f2304c + '}';
    }
}
