package w4;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class k {
    public Class a;

    /* renamed from: b, reason: collision with root package name */
    public Class f26737b;

    /* renamed from: c, reason: collision with root package name */
    public Class f26738c;

    public k() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a.equals(kVar.a) && this.f26737b.equals(kVar.f26737b) && m.b(this.f26738c, kVar.f26738c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f26737b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.f26738c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.f26737b + AbstractJsonLexerKt.END_OBJ;
    }

    public k(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.f26737b = cls2;
        this.f26738c = cls3;
    }
}
