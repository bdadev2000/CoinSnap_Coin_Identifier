package i2;

import N1.f;
import j2.n;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2338a implements f {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final f f20641c;

    public C2338a(int i9, f fVar) {
        this.b = i9;
        this.f20641c = fVar;
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        this.f20641c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2338a)) {
            return false;
        }
        C2338a c2338a = (C2338a) obj;
        if (this.b != c2338a.b || !this.f20641c.equals(c2338a.f20641c)) {
            return false;
        }
        return true;
    }

    @Override // N1.f
    public final int hashCode() {
        return n.h(this.b, this.f20641c);
    }
}
