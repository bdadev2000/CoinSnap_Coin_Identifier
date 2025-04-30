package i2;

import N1.f;
import j2.g;
import java.security.MessageDigest;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2341d implements f {
    public final Object b;

    public C2341d(Object obj) {
        g.c(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(f.f2087a));
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (obj instanceof C2341d) {
            return this.b.equals(((C2341d) obj).b);
        }
        return false;
    }

    @Override // N1.f
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
