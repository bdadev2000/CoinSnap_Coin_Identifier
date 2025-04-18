package g;

import androidx.compose.ui.graphics.painter.Painter;

/* loaded from: classes3.dex */
public final class i extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Painter f30539a;

    /* renamed from: b, reason: collision with root package name */
    public final q.e f30540b;

    public i(Painter painter, q.e eVar) {
        this.f30539a = painter;
        this.f30540b = eVar;
    }

    @Override // g.l
    public final Painter a() {
        return this.f30539a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p0.a.g(this.f30539a, iVar.f30539a) && p0.a.g(this.f30540b, iVar.f30540b);
    }

    public final int hashCode() {
        Painter painter = this.f30539a;
        return this.f30540b.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f30539a + ", result=" + this.f30540b + ')';
    }
}
