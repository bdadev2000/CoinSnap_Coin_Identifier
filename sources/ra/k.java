package ra;

import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class k implements j, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List f24055b;

    public k(List list) {
        this.f24055b = list;
    }

    @Override // ra.j
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f24055b;
            if (i10 < list.size()) {
                if (!((j) list.get(i10)).apply(obj)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f24055b.equals(((k) obj).f24055b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24055b.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f24055b) {
            if (!z10) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
