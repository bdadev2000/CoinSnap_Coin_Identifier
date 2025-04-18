package v4;

import e4.j;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Object f26026b;

    public d(Object obj) {
        com.bumptech.glide.c.l(obj);
        this.f26026b = obj;
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f26026b.toString().getBytes(j.a));
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f26026b.equals(((d) obj).f26026b);
        }
        return false;
    }

    @Override // e4.j
    public final int hashCode() {
        return this.f26026b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f26026b + AbstractJsonLexerKt.END_OBJ;
    }
}
