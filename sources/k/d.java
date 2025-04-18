package k;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f30870a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30871b;

    /* renamed from: c, reason: collision with root package name */
    public final h.g f30872c;

    public d(Drawable drawable, boolean z2, h.g gVar) {
        this.f30870a = drawable;
        this.f30871b = z2;
        this.f30872c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (p0.a.g(this.f30870a, dVar.f30870a) && this.f30871b == dVar.f30871b && this.f30872c == dVar.f30872c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30872c.hashCode() + android.support.v4.media.d.g(this.f30871b, this.f30870a.hashCode() * 31, 31);
    }
}
