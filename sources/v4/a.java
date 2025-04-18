package v4;

import e4.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import w4.m;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public final int f26023b;

    /* renamed from: c, reason: collision with root package name */
    public final j f26024c;

    public a(int i10, j jVar) {
        this.f26023b = i10;
        this.f26024c = jVar;
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        this.f26024c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f26023b).array());
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26023b != aVar.f26023b || !this.f26024c.equals(aVar.f26024c)) {
            return false;
        }
        return true;
    }

    @Override // e4.j
    public final int hashCode() {
        return m.f(this.f26023b, this.f26024c);
    }
}
