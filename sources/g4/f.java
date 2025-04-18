package g4;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class f implements e4.j {

    /* renamed from: b, reason: collision with root package name */
    public final e4.j f18058b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.j f18059c;

    public f(e4.j jVar, e4.j jVar2) {
        this.f18058b = jVar;
        this.f18059c = jVar2;
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        this.f18058b.b(messageDigest);
        this.f18059c.b(messageDigest);
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f18058b.equals(fVar.f18058b) || !this.f18059c.equals(fVar.f18059c)) {
            return false;
        }
        return true;
    }

    @Override // e4.j
    public final int hashCode() {
        return this.f18059c.hashCode() + (this.f18058b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f18058b + ", signature=" + this.f18059c + AbstractJsonLexerKt.END_OBJ;
    }
}
