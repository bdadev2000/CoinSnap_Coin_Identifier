package n4;

import android.graphics.drawable.Drawable;
import g4.g0;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class r implements e4.q {

    /* renamed from: b, reason: collision with root package name */
    public final e4.q f22437b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22438c;

    public r(e4.q qVar, boolean z10) {
        this.f22437b = qVar;
        this.f22438c = z10;
    }

    @Override // e4.q
    public final g0 a(com.bumptech.glide.g gVar, g0 g0Var, int i10, int i11) {
        h4.d dVar = com.bumptech.glide.b.a(gVar).f9606b;
        Drawable drawable = (Drawable) g0Var.get();
        d f10 = c6.c.f(dVar, drawable, i10, i11);
        if (f10 == null) {
            if (!this.f22438c) {
                return g0Var;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        g0 a = this.f22437b.a(gVar, f10, i10, i11);
        if (a.equals(f10)) {
            a.a();
            return g0Var;
        }
        return new d(gVar.getResources(), a);
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        this.f22437b.b(messageDigest);
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f22437b.equals(((r) obj).f22437b);
        }
        return false;
    }

    @Override // e4.j
    public final int hashCode() {
        return this.f22437b.hashCode();
    }
}
