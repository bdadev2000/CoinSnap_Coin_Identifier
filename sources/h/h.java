package h;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f30676a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30677b;

    public h(Drawable drawable, boolean z2) {
        this.f30676a = drawable;
        this.f30677b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (p0.a.g(this.f30676a, hVar.f30676a) && this.f30677b == hVar.f30677b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30677b) + (this.f30676a.hashCode() * 31);
    }
}
