package h4;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class g implements k {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public int f18742b;

    /* renamed from: c, reason: collision with root package name */
    public Class f18743c;

    public g(c cVar) {
        this.a = cVar;
    }

    @Override // h4.k
    public final void a() {
        this.a.j(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f18742b != gVar.f18742b || this.f18743c != gVar.f18743c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f18742b * 31;
        Class cls = this.f18743c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return "Key{size=" + this.f18742b + "array=" + this.f18743c + AbstractJsonLexerKt.END_OBJ;
    }
}
