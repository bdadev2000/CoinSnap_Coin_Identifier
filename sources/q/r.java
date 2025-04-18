package q;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class r extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f31332a;

    /* renamed from: b, reason: collision with root package name */
    public final j f31333b;

    /* renamed from: c, reason: collision with root package name */
    public final h.g f31334c;
    public final o.c d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31335f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31336g;

    public r(Drawable drawable, j jVar, h.g gVar, o.c cVar, String str, boolean z2, boolean z3) {
        this.f31332a = drawable;
        this.f31333b = jVar;
        this.f31334c = gVar;
        this.d = cVar;
        this.e = str;
        this.f31335f = z2;
        this.f31336g = z3;
    }

    @Override // q.k
    public final Drawable a() {
        return this.f31332a;
    }

    @Override // q.k
    public final j b() {
        return this.f31333b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (p0.a.g(this.f31332a, rVar.f31332a)) {
                if (p0.a.g(this.f31333b, rVar.f31333b) && this.f31334c == rVar.f31334c && p0.a.g(this.d, rVar.d) && p0.a.g(this.e, rVar.e) && this.f31335f == rVar.f31335f && this.f31336g == rVar.f31336g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f31334c.hashCode() + ((this.f31333b.hashCode() + (this.f31332a.hashCode() * 31)) * 31)) * 31;
        o.c cVar = this.d;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f31336g) + android.support.v4.media.d.g(this.f31335f, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }
}
