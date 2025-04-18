package androidx.work;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class l extends o {
    public final h a = h.f2197c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return this.a.equals(((l) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + AbstractJsonLexerKt.END_OBJ;
    }
}
