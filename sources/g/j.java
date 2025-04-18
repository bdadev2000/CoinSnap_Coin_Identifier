package g;

import androidx.compose.ui.graphics.painter.Painter;

/* loaded from: classes3.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Painter f30544a;

    public j(Painter painter) {
        this.f30544a = painter;
    }

    @Override // g.l
    public final Painter a() {
        return this.f30544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && p0.a.g(this.f30544a, ((j) obj).f30544a);
    }

    public final int hashCode() {
        Painter painter = this.f30544a;
        if (painter == null) {
            return 0;
        }
        return painter.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f30544a + ')';
    }
}
