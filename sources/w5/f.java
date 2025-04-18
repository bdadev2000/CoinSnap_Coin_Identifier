package w5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public final o a;

    /* renamed from: b, reason: collision with root package name */
    public final m f26769b;

    public f(o oVar, m field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.a = oVar;
        this.f26769b = field;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.f26769b == fVar.f26769b;
    }

    public final int hashCode() {
        o oVar = this.a;
        return this.f26769b.hashCode() + ((oVar == null ? 0 : oVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SectionCustomEventFieldMapping(section=" + this.a + ", field=" + this.f26769b + ')';
    }
}
