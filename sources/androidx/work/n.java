package androidx.work;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class n extends o {
    public final h a;

    public n(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return this.a.equals(((n) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (n.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + AbstractJsonLexerKt.END_OBJ;
    }
}
