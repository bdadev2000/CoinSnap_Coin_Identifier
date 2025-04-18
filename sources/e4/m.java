package e4;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: b, reason: collision with root package name */
    public final w4.c f17107b = new w4.c();

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            w4.c cVar = this.f17107b;
            if (i10 < cVar.f23955d) {
                l lVar = (l) cVar.h(i10);
                Object l10 = this.f17107b.l(i10);
                k kVar = lVar.f17104b;
                if (lVar.f17106d == null) {
                    lVar.f17106d = lVar.f17105c.getBytes(j.a);
                }
                kVar.a(lVar.f17106d, l10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final Object c(l lVar) {
        w4.c cVar = this.f17107b;
        if (cVar.containsKey(lVar)) {
            return cVar.getOrDefault(lVar, null);
        }
        return lVar.a;
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f17107b.equals(((m) obj).f17107b);
        }
        return false;
    }

    @Override // e4.j
    public final int hashCode() {
        return this.f17107b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f17107b + AbstractJsonLexerKt.END_OBJ;
    }
}
