package N1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i implements f {
    public final j2.c b = new x.l();

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        int i9 = 0;
        while (true) {
            j2.c cVar = this.b;
            if (i9 < cVar.f24086d) {
                h hVar = (h) cVar.h(i9);
                Object m = this.b.m(i9);
                g gVar = hVar.b;
                if (hVar.f2091d == null) {
                    hVar.f2091d = hVar.f2090c.getBytes(f.f2087a);
                }
                gVar.a(hVar.f2091d, m, messageDigest);
                i9++;
            } else {
                return;
            }
        }
    }

    public final Object c(h hVar) {
        j2.c cVar = this.b;
        if (cVar.containsKey(hVar)) {
            return cVar.getOrDefault(hVar, null);
        }
        return hVar.f2089a;
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.b.equals(((i) obj).b);
        }
        return false;
    }

    @Override // N1.f
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
