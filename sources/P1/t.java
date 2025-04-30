package P1;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class t implements N1.f {
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2391d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f2392e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f2393f;

    /* renamed from: g, reason: collision with root package name */
    public final N1.f f2394g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f2395h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.i f2396i;

    /* renamed from: j, reason: collision with root package name */
    public int f2397j;

    public t(Object obj, N1.f fVar, int i9, int i10, j2.c cVar, Class cls, Class cls2, N1.i iVar) {
        j2.g.c(obj, "Argument must not be null");
        this.b = obj;
        j2.g.c(fVar, "Signature must not be null");
        this.f2394g = fVar;
        this.f2390c = i9;
        this.f2391d = i10;
        j2.g.c(cVar, "Argument must not be null");
        this.f2395h = cVar;
        j2.g.c(cls, "Resource class must not be null");
        this.f2392e = cls;
        j2.g.c(cls2, "Transcode class must not be null");
        this.f2393f = cls2;
        j2.g.c(iVar, "Argument must not be null");
        this.f2396i = iVar;
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.b.equals(tVar.b) || !this.f2394g.equals(tVar.f2394g) || this.f2391d != tVar.f2391d || this.f2390c != tVar.f2390c || !this.f2395h.equals(tVar.f2395h) || !this.f2392e.equals(tVar.f2392e) || !this.f2393f.equals(tVar.f2393f) || !this.f2396i.equals(tVar.f2396i)) {
            return false;
        }
        return true;
    }

    @Override // N1.f
    public final int hashCode() {
        if (this.f2397j == 0) {
            int hashCode = this.b.hashCode();
            this.f2397j = hashCode;
            int hashCode2 = ((((this.f2394g.hashCode() + (hashCode * 31)) * 31) + this.f2390c) * 31) + this.f2391d;
            this.f2397j = hashCode2;
            int hashCode3 = this.f2395h.hashCode() + (hashCode2 * 31);
            this.f2397j = hashCode3;
            int hashCode4 = this.f2392e.hashCode() + (hashCode3 * 31);
            this.f2397j = hashCode4;
            int hashCode5 = this.f2393f.hashCode() + (hashCode4 * 31);
            this.f2397j = hashCode5;
            this.f2397j = this.f2396i.b.hashCode() + (hashCode5 * 31);
        }
        return this.f2397j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.f2390c + ", height=" + this.f2391d + ", resourceClass=" + this.f2392e + ", transcodeClass=" + this.f2393f + ", signature=" + this.f2394g + ", hashCode=" + this.f2397j + ", transformations=" + this.f2395h + ", options=" + this.f2396i + '}';
    }
}
