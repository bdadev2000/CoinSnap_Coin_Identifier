package p4;

import android.graphics.Bitmap;
import e4.q;
import g4.g0;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: b, reason: collision with root package name */
    public final q f23429b;

    public d(q qVar) {
        com.bumptech.glide.c.l(qVar);
        this.f23429b = qVar;
    }

    @Override // e4.q
    public final g0 a(com.bumptech.glide.g gVar, g0 g0Var, int i10, int i11) {
        c cVar = (c) g0Var.get();
        g0 dVar = new n4.d(cVar.f23419b.a.f23449l, com.bumptech.glide.b.a(gVar).f9606b);
        q qVar = this.f23429b;
        g0 a = qVar.a(gVar, dVar, i10, i11);
        if (!dVar.equals(a)) {
            dVar.a();
        }
        cVar.f23419b.a.c(qVar, (Bitmap) a.get());
        return g0Var;
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        this.f23429b.b(messageDigest);
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f23429b.equals(((d) obj).f23429b);
        }
        return false;
    }

    @Override // e4.j
    public final int hashCode() {
        return this.f23429b.hashCode();
    }
}
