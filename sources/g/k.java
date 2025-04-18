package g;

import androidx.compose.ui.graphics.painter.Painter;

/* loaded from: classes3.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Painter f30547a;

    /* renamed from: b, reason: collision with root package name */
    public final q.r f30548b;

    public k(Painter painter, q.r rVar) {
        this.f30547a = painter;
        this.f30548b = rVar;
    }

    @Override // g.l
    public final Painter a() {
        return this.f30547a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p0.a.g(this.f30547a, kVar.f30547a) && p0.a.g(this.f30548b, kVar.f30548b);
    }

    public final int hashCode() {
        return this.f30548b.hashCode() + (this.f30547a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f30547a + ", result=" + this.f30548b + ')';
    }
}
