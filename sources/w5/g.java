package w5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public final o a;

    /* renamed from: b, reason: collision with root package name */
    public final p f26770b;

    public g(o section, p pVar) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.a = section;
        this.f26770b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.f26770b == gVar.f26770b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p pVar = this.f26770b;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "SectionFieldMapping(section=" + this.a + ", field=" + this.f26770b + ')';
    }
}
